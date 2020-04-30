package com.greenfoxacademy.redditclone.Services;

import com.greenfoxacademy.redditclone.Models.User;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public interface UserService {

    int createUser(String name, String password, String email);

    User fetchUser();

    User fetchUserByUserName(String userName);

    User fetchUserByUserID(long id);

    void deleteUser();

    void editUser();

    User loginUser(String username, String password);

    void setUserAsActive(String userName);

}
