package com.greenfoxacademy.redditclone.Services;

import com.greenfoxacademy.redditclone.Models.User;
import com.greenfoxacademy.redditclone.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public int createUser(String name, String password, String email) {
        //check if this UserName is already given:
        User userReferenz = fetchUserByUserName(name);
        if (userReferenz == null) {
            User user = new User(name, password, email);
            userRepository.save(user);
            user.setUserLoggedIn(true);
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public User fetchUser() {
        return null;
    }

    @Override
    public User fetchUserByUserName(String userName) {
        //Load all Users in a List
        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(userList::add);

        //Search for the User with userName
        User singleUser = userList
                            .stream()
                            .filter(user -> user.getUserName().toLowerCase().equals(userName.toLowerCase()))
                            .findFirst().orElse(null);
        return singleUser;
    }

    @Override
    public User fetchUserByUserID(long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUser() {

    }

    @Override
    public void editUser() {

    }

    @Override
    public User loginUser(String username, String password) {
        //Load all Users in a List
        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(userList::add);

        //Search ListOfUsers for username && password
        User refUser = userList
                .stream()
                .filter(user -> user.getUserName().equals(username) && user.getUserPassword().equals(password))
                .findFirst().orElse(null);

        if (refUser != null) {
            refUser.setUserLoggedIn(true);
        }
        return refUser;

        // If User = null --> no such User found. Error needs handling!
    }

    @Override
    public void setUserAsActive(String userName) {
        User user = fetchUserByUserName(userName);
        user.setUserLoggedIn(true);
    }

}
