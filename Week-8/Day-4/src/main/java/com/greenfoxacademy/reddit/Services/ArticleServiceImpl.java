package com.greenfoxacademy.reddit.Services;

import com.greenfoxacademy.reddit.Model.Article;
import com.greenfoxacademy.reddit.Model.User;
import com.greenfoxacademy.reddit.Repository.ArticleRepository;
import com.greenfoxacademy.reddit.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService{

    private ArticleRepository articleRepository;
    private UserRepository userRepository;

    @Autowired
    public ArticleServiceImpl(ArticleRepository articleRepository, UserRepository userRepository) {
        this.articleRepository = articleRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void createArticle(String title, String url, long userID) { ;
        User user = userRepository.findById(userID).orElse(null);
        Article article = new Article(title, url, user);
        articleRepository.save(article);
        // Missing: fetch List<Article> from User and add/save Article there!
        List<Article> articlesOfUser = user.getArticlesCreated();
        articlesOfUser.add(article);
        userRepository.save(user);
    }

    @Override
    public List<Article> getAllArticles() {
        List<Article> listAllArticles = new ArrayList<>();
        articleRepository.findAll().forEach(listAllArticles::add);
        return listAllArticles;
    }

    @Override
    public void upvoteArticle(long id) {
        Article article = new Article();
        article = articleRepository.findById(id).orElse(null);
        article.upVote();
        articleRepository.save(article);
    }

    @Override
    public void downvoteArticle(long id) {
        Article article = new Article();
        article = articleRepository.findById(id).orElse(null);
        article.downVote();;
        articleRepository.save(article);
    }


}
