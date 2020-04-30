package com.greenfoxacademy.reddit.Repository;

import com.greenfoxacademy.reddit.Model.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
}
