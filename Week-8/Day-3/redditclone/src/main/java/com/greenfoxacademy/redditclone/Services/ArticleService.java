package com.greenfoxacademy.redditclone.Services;

import com.greenfoxacademy.redditclone.Models.Article;
import com.greenfoxacademy.redditclone.Models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArticleService {

    void createArticle(long id, String title, String url, String content);

    List<Article> fetchAllArticles();

    Article fetchArticle(String title);

    void addUserToArticle(User user, Article article);

    void editArticle();

    void deleteArticle();



}
