package com.greenfoxacademy.redditclone.Services;

import com.greenfoxacademy.redditclone.Models.Article;
import com.greenfoxacademy.redditclone.Models.User;
import com.greenfoxacademy.redditclone.Repositories.ArticleRepository;
import com.greenfoxacademy.redditclone.Repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService{

    private ArticleRepository articleRepository;
    private UserRepository userRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository, UserRepository userRepository) {
        this.articleRepository = articleRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void createArticle(long id, String title, String url, String content) {
        User user = userRepository.findById(id).orElse(null);
        Article article = new Article(title, url, content);

        articleRepository.save(article);
        addUserToArticle(user, article);
    }

    @Override
    public void addUserToArticle(User user, Article article) {

        article.setArticleCreator(user);
        List<Article> usersArticles = user.getArticlesCreated();
        usersArticles.add(article);
        user.setArticlesCreated(usersArticles);
        userRepository.save(user);
        articleRepository.save(article);

    }

    @Override
    public List<Article> fetchAllArticles() {
        List<Article> allArticles = new ArrayList<>();
        articleRepository.findAll().forEach(allArticles::add);
        return allArticles;
    }

    @Override
    public Article fetchArticle(String title) {
        List<Article> listArticles = new ArrayList<>();
        articleRepository.findAll().forEach(listArticles::add);

        Article article = listArticles
                .stream()
                .filter(item -> item.getArticleTitle().equals(title))
                .findFirst().orElse(null);

        return article;
    }



    @Override
    public void editArticle() {

    }

    @Override
    public void deleteArticle() {

    }
}
