package com.cy.store;

import com.cy.store.entity.UsersEntity;
import com.cy.store.mapper.UsersMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.time.LocalDateTime;

@SpringBootTest
@MapperScan("com.cy.store.mapper")
class StoreSApplicationTests {

  @Autowired
    UsersMapper usermapper ;

    @Test
    void add() {
        LocalDateTime now = LocalDateTime.now();

     // UsersEntity users=  new UsersEntity("yang","123456","管理员",now);
       // usermapper.insert(users);





    }
    @Test
    void query()
    {
      System.out.println(usermapper.selectById(2));

    }
}
