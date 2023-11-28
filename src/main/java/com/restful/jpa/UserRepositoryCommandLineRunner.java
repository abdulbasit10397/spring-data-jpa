package com.restful.jpa;

import com.restful.jpa.entity.User;
import com.restful.jpa.service.UserDaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
    private static final Logger logger =
            LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User("Basit", 25, "Admin");

        userRepository.save(user1);

        Optional<User> userFound = userRepository.findById(1l);
        userFound.get().toString();

        logger.info("User created with ID: " + user1.getId());
    }
}
