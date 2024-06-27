package com.example.Assignment2.service;

import com.example.Assignment2.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getAll();
    void create(User user);
    void delete(Long userId);
    void update(Long userId, User user);
    User getUser(Long userId);
}
