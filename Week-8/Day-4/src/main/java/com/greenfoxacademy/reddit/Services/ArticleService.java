package com.greenfoxacademy.reddit.Services;

import com.greenfoxacademy.reddit.Model.Article;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArticleService {

    void createArticle(String title, String url, long userID);

    List<Article> getAllArticles();

    void upvoteArticle(long id);

    void downvoteArticle(long id);

    Article findArticleByID(long articleID);

    void editOwnArticle(long articleID, String articleTitle, String articleUrl, long userID);

    void deleteOwnArticle(long articleID, long userID);

}
