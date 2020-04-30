package com.greenfoxacademy.reddit.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;
    private String userName;
    private String userEmail;
    private String userPassword;

    private boolean loggedIn = false;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user", cascade = CascadeType.ALL)
    private List<Article> articlesCreated = null;

    @Temporal(TemporalType.DATE)
    private Date userCreationDate;

    public User() {
    }

    public User(String name, String email, String userPassword) {
        this.userName = name;
        this.userEmail = email;
        this.userPassword = userPassword;
        this.userCreationDate = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isloggedIn() {
        return loggedIn;
    }

    public void setloggedIn(boolean logIn) {
        this.loggedIn = logIn;
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

    public List<Article> getArticlesCreated() {
        return articlesCreated;
    }

    public void setArticlesCreated(List<Article> articlesCreated) {
        this.articlesCreated = articlesCreated;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public Date getUserCreationDate() {
        return userCreationDate;
    }

    public void setUserCreationDate(Date userCreationDate) {
        this.userCreationDate = userCreationDate;
    }
}
