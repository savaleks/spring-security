package com.savaleks.springdemo.service;

import com.savaleks.springdemo.model.User;
import com.savaleks.springdemo.model.UserRole;

import java.util.Set;

public interface UserService {

    User findByUsername(String username);
    User findByEmail(String email);
    boolean checkUserExists(String username, String email);
    boolean checkUsernameExists(String username);
    boolean checkEmailExists(String email);

    void saveUser(User user);

    User createUser(User user, Set<UserRole> userRoles);
}
