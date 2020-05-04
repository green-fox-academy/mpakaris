package com.greenfoxacademy.reddit.Services;

import com.greenfoxacademy.reddit.Model.User;
import com.greenfoxacademy.reddit.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUserByID(long id) {
        User user = userRepository.findById(id).get();
        return user;
    }

    @Override
    public User createNewUser(String name, String email, String password) {
        User user = new User(name, email, password);
        userRepository.save(user);

        //If User created --> set logIn = True && return User
        user.setloggedIn(true);
        return user;
    }


    @Override
    public User evaluateLoginData(String name, String password) {
        List<User> listAllUsers = new ArrayList<>();
        userRepository.findAll().forEach(listAllUsers::add);

        // Check if User with same Username exists in List:
        User user = listAllUsers.stream().filter(p -> p.getUserName().toLowerCase()
                .equals(name.toLowerCase()) && p.getUserPassword().equals(password)).findFirst().orElse(null);

        //If User exists && Password correct --> set logIn = True && return User | else return null;
        user.setloggedIn(true);
        return user;
    }

    @Override
    public void logoutUserByID(long id) {
        User user = userRepository.findById(id).get();
        user.setloggedIn(false);
    }
}
