package com.cy.store.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author jobob
 * @since 2025-03-11
 */
@TableName("users")
public class UsersEntity implements Serializable {

    private static final long serialVersionUID = 1L;



    private long id;
    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 角色
     */
    private String role;

    /**
     * 新增时间
     */
    private LocalDateTime addtime;

    public UsersEntity(long id, String username, String password, String role, LocalDateTime addtime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.addtime = addtime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDateTime getAddtime() {
        return addtime;
    }

    public void setAddtime(LocalDateTime addtime) {
        this.addtime = addtime;
    }

    @Override
    public String toString() {
        return "UsersEntity{" +
        "username=" + username +
        ", password=" + password +
        ", role=" + role +
        ", addtime=" + addtime +
        "}";
    }
}
