package com.example.Assignment2.controller;

import com.example.Assignment2.entity.User;
import com.example.Assignment2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String createUser(@RequestBody User user){
        userService.create(user);
        return "User created.";
    }

    @GetMapping
    public List<User> getAll(){
       return userService.getAll();
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId){
        return userService.getUser(userId);
    }

    @PutMapping("/{userId}")
    public String update(@PathVariable Long userId, @RequestBody User user){
        userService.update(userId, user);
        return "User updated.";
    }

    @DeleteMapping("/{userId}")
    public String delete(@PathVariable Long userId){
        userService.delete(userId);
        return "User Deleted.";
    }
}
