package com.example.taskList.controller;

import com.example.taskList.domain.User;
import com.example.taskList.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(consumes = "application/json")
    public ResponseEntity createUser(@RequestBody User user){
        User createUser = userService.createUser(user);
        return ResponseEntity.status(200).body("Feito!\n" + user);
    }
}
