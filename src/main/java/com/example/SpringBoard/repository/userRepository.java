package com.example.SpringBoard.repository;

import com.example.SpringBoard.domain.User;

import java.util.Optional;

public interface userRepository {
    User save(User user);
    Optional<User> findById(int id);
    Optional<User> findByUid(String uid);
    Optional<User> findByPw(String password);
    Optional<User> findByNick(String nickname);
    Optional<User> findAll();
}
