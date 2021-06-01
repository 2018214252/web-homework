package com.example.webhomework.MapperTest;

import com.example.webhomework.entity.User;
import com.example.webhomework.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class CommomTest {
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        User user = userService.getUser("2018214252");
        log.debug("{}",user.getId());
    }

}
