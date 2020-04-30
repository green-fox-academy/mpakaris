package com.greenfoxacademy.redditclone.Models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long articleID;
    private String articleTitle;
    private String articleLink;
    private String articleContent;

    private int articleUpvote;
    private String articleCreatedByUser;

    @Temporal(TemporalType.TIMESTAMP)
    private Date articleCreated;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private User articleCreator;

    public Article() {
    }

    public Article(String articleTitle, String articleLink, String articleContent) {
        this.articleTitle = articleTitle;
        this.articleLink = articleLink;
        this.articleContent = articleContent;
        this.articleCreated = new Date();
    }

    public long getArticleID() {
        return articleID;
    }

    public String getArticleText() {
        return articleTitle;
    }

    public void setArticleText(String articleText) {
        this.articleTitle = articleText;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public User getArticleCreator() {
        return articleCreator;
    }

    public void setArticleCreator(User articleCreator) {
        this.articleCreator = articleCreator;
    }

    public String getArticleLink() {
        return articleLink;
    }

    public void setArticleLink(String articleLink) {
        this.articleLink = articleLink;
    }

    public int getArticleUpvote() {
        return articleUpvote;
    }

    public void setArticleUpvote(int articleUpvote) {
        this.articleUpvote = articleUpvote;
    }

    public String getArticleCreatedByUser() {
        return articleCreatedByUser;
    }

    public void setArticleCreatedByUser(String articleCreatedByUser) {
        this.articleCreatedByUser = articleCreatedByUser;
    }

    public Date getArticleCreated() {
        return articleCreated;
    }

    public void setArticleCreated(Date articleCreated) {
        this.articleCreated = articleCreated;
    }

    public User getUser() {
        return articleCreator;
    }

    public void setUser(User articleCreator) {
        this.articleCreator = articleCreator;
    }

    @ManyToOne(optional = false)
    private User users;

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }
}
