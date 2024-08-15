package com.example.WebDemo.Controller;

import com.example.WebDemo.Entity.User;
import com.example.WebDemo.Service.UserService;
import com.example.WebDemo.dbo.request.UserCreationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
//add user
    @PostMapping("/users")
    public User addUser(@RequestBody UserCreationRequest request) {
        return userService.createRequest(request);
    }
}
