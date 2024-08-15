package com.example.WebDemo.Service;

import com.example.WebDemo.Entity.User;
import com.example.WebDemo.Repository.UserRepo;
import com.example.WebDemo.dbo.request.UserCreationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User createRequest(UserCreationRequest request)
    {
        User user = new User();

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstname(request.getFirstname());
        user.setLastname(request.getLastname());
        user.setBirthday(request.getBirthday());

        userRepo.save(user);
        return user;
    }
}
