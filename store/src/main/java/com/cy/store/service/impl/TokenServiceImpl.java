package com.cy.store.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cy.store.entity.TokenEntity;
import com.cy.store.mapper.TokenMapper;
import com.cy.store.service.TokenService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cy.store.utils.CommonUtil;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

/**
 * <p>
 * token表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2025-03-12
 */
@Service
public class TokenServiceImpl extends ServiceImpl<TokenMapper, TokenEntity> implements TokenService {

    @Override
    public String generateToken(Long userid, String username, String tableName, String role) {
        QueryWrapper<TokenEntity> queryWrapper =new QueryWrapper<>();
        queryWrapper.eq("userid",userid)
                .eq("role",role); //查询当前用户现有的token

        TokenEntity tokenEntity =this.getOne(queryWrapper);

        String token = CommonUtil.getRandomString(32); //生成token
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.HOUR_OF_DAY, 3); //设置过期时间，3小时后

        if(tokenEntity!=null){
            tokenEntity.setToken(token);
            tokenEntity.setExpiratedtime(cal.getTime());
            this.updateById(tokenEntity);//更新实体
        }else {
            this.save(new TokenEntity(null,userid,username, tableName, role, token, new Date(),cal.getTime()));
            //创建一个token数据
        }

    return  token;


    }
}
