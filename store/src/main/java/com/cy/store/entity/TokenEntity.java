package com.cy.store.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * token表
 * </p>
 *
 * @author jobob
 * @since 2025-03-12
 */
@TableName("token")
public class TokenEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    /**
     * 用户id
     */
    private Long userid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 表名
     */
    private String tablename;

    /**
     * 角色
     */
    private String role;

    /**
     * 密码
     */
    private String token;

    /**
     * 新增时间
     */
    private Date addtime;

    /**
     * 过期时间
     */
    private Date expiratedtime;

    public TokenEntity(Long id, Long userid, String username, String tablename, String role, String token, Date addtime, Date expiratedtime) {
        this.id = id;
        this.userid = userid;
        this.username = username;
        this.tablename = tablename;
        this.role = role;
        this.token = token;
        this.addtime = addtime;
        this.expiratedtime = expiratedtime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getExpiratedtime() {
        return expiratedtime;
    }

    public void setExpiratedtime(Date expiratedtime) {
        this.expiratedtime = expiratedtime;
    }

    @Override
    public String toString() {
        return "TokenEntity{" +
        "userid=" + userid +
        ", username=" + username +
        ", tablename=" + tablename +
        ", role=" + role +
        ", token=" + token +
        ", addtime=" + addtime +
        ", expiratedtime=" + expiratedtime +
        "}";
    }
}
