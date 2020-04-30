package com.greenfoxacademy.reddit.Model;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Article {

    @Id
    @GeneratedValue
    private long id;
    private String articleTitle;
    private String articleUrl;
    private int vote;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private User user;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Article() {
    }

    public Article(String articleTitle, String articleUrl, User user) {
        this.articleTitle = articleTitle;
        this.articleUrl = articleUrl;
        this.user = user;
        this.vote = 0;
        this.date = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public void upVote() {
        this.vote++;
    }

    public void downVote() {
        this.vote--;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
