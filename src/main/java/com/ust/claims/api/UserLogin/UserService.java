package com.ust.claims.api.UserLogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
     UserLoginRepository userRepository;
    public List<UserLogin> getAllUsers() {
        return userRepository.findAll();
    }
}
