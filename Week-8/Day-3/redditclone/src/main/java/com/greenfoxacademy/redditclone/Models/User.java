package com.greenfoxacademy.redditclone.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long userID;
    private String userName;
    private String userEmail;
    private String userPassword;
    private boolean userLoggedIn = false;

    @Temporal(TemporalType.DATE)
    private Date userCreated;
    @Temporal(TemporalType.TIMESTAMP)
    private Date userLastLogin;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Article> articlesCreated = null;

    public User() {
    }

    public User(String name, String password, String email){
        this.userName = name;
        this.userPassword = password;
        this.userEmail = email;
        this.userCreated = new Date();
        this.articlesCreated = new ArrayList<>();
    }

    public long getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isUserLoggedIn() {
        return userLoggedIn;
    }

    public void setUserLoggedIn(boolean userLoggedIn) {
        this.userLoggedIn = userLoggedIn;
    }

    public Date getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(Date userCreated) {
        this.userCreated = userCreated;
    }

    public Date getUserLastLogin() {
        return userLastLogin;
    }

    public void setUserLastLogin(Date userLastLogin) {
        this.userLastLogin = userLastLogin;
    }

    public List<Article> getArticlesCreated() {
        return articlesCreated;
    }

    public void setArticlesCreated(List<Article> addArticle) {
        this.articlesCreated = addArticle;
    }
}
