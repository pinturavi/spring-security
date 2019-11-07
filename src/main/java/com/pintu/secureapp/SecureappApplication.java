package com.pintu.secureapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SecureappApplication {

   /* @Bean
    public CommandLineRunner commandLineRunner(UserRepository userRepo, AuthorityRepository authorityRepository){
        Set<Authority> authorities = new HashSet<>();
        authorities.add(new Authority(AuthorityType.ROLE_ADMIN));
        authorities.add(new Authority(AuthorityType.ROLE_USER));
        User user = new User("pintu",  BCrypt.hashpw("pass", BCrypt.gensalt()), Date.valueOf(LocalDate.now()), authorities);
        return args -> {
            userRepo.save(user);
        };
    }*/

    public static void main(String[] args) {
        SpringApplication.run(SecureappApplication.class, args);
    }

}
