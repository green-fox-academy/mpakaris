package com.greenfoxacademy.redditclone.Repositories;

import com.greenfoxacademy.redditclone.Models.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
}
