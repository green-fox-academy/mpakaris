package com.greenfoxacademy.reddit.Services;

import com.greenfoxacademy.reddit.Model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User findUserByID(long id);

    User createNewUser(String name, String email, String password);

    User evaluateLoginData(String name, String password);

    void logoutUserByID(long id);


}
