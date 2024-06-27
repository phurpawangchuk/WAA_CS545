package com.example.Assignment2.service.Imp;


import com.example.Assignment2.entity.User;
import com.example.Assignment2.repository.UserRepository;
import com.example.Assignment2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

    @Autowired
    private final UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void create(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public void update(Long userId, User user) {
        Optional<User> optionalUser = userRepository.findById(userId);
        if (optionalUser.isPresent()) {
            User userToUpdate = optionalUser.get();
            userToUpdate.setEmail(user.getEmail());
            userToUpdate.setPassword(user.getPassword());
            userToUpdate.setFirstName(user.getFirstName());
            userToUpdate.setLastName(user.getLastName());
            userToUpdate.setAddress(user.getAddress());
            userToUpdate.setReviews(user.getReviews());
            userRepository.save(userToUpdate);
        } else {
            throw new RuntimeException("User not found with id " + userId);
        }
    }

    @Override
    public User getUser(Long userId) {
        return userRepository.findById(userId).get();
    }
}
