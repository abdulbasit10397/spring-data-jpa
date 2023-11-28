package com.restful.jpa;

import com.restful.jpa.entity.User;
import com.restful.jpa.service.UserDaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger logger =
            LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

    @Autowired
    private UserDaoService userDaoService;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User("Basit", 25, "Admin");
        long savedUserId = userDaoService.insert(user1);

        logger.info("User created with ID: " + savedUserId);
    }
}
