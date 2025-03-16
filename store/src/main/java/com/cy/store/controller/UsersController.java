package com.cy.store.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cy.store.entity.UsersEntity;
import com.cy.store.service.TokenService;
import com.cy.store.service.UsersService;
import com.cy.store.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2025-03-11
 */
@RestController
@RequestMapping("/users")
public class UsersController {
@Autowired
    UsersService usersService;
@Autowired
   TokenService tokenService;
   @PostMapping(value = "/login")
   public R login (String username, String password, String captcha, HttpServletRequest request)
   {

      QueryWrapper<UsersEntity> queryWrapper = new QueryWrapper<>();
      queryWrapper.eq("username", username);

      UsersEntity user = usersService.getOne(queryWrapper);

      if(user == null||!user.getPassword().equals(password))
      {
      System.out.println(password);
      System.out.println(user.getPassword());
         return R.error("账号或密码不正确");
      }
      String token = tokenService.generateToken(user.getId(),username, "users", user.getRole());
      return R.ok().put("token", token);

   }

}

