package com.example.SpringBoard.service;

import com.example.SpringBoard.domain.User;
import com.example.SpringBoard.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {

    private final userRepository userRepository;
    @Autowired
    public userService(userRepository userRepository) {
        this.userRepository = userRepository;
    }
    public int join(User user){
        userRepository.save(user);
        return user.getId();
    }
}
