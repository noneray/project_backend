package com.project.project_backend.controller;

import com.project.project_backend.entity.User;
import com.project.project_backend.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class TempController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("hello")
    public String hello() {
        List<User> list1 = userRepository.findAll();
        for (User user : list1) {
            System.out.println(user.getUsername());
        }
        return "hello spring security";
    }
}
