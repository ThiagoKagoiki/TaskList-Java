package com.example.taskList.service;

import com.example.taskList.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;
    private final String url_api = "https://6a2dbd9e2edd4cb330d16548.mockapi.io/usuarios";

    public User createUser(User user){
        return restTemplate.postForObject(url_api, user, User.class);
    }
}
