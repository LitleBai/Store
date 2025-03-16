package com.cy.store.service;

import com.cy.store.entity.TokenEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * token表 服务类
 * </p>
 *
 * @author jobob
 * @since 2025-03-12
 */
public interface TokenService extends IService<TokenEntity> {

    String generateToken(Long userid,String username,String tableName, String role);
}
