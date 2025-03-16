package com.cy.store.service.impl;

import com.cy.store.entity.UsersEntity;
import com.cy.store.mapper.UsersMapper;
import com.cy.store.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2025-03-11
 * 继承通用基类
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, UsersEntity> implements UsersService {

}
