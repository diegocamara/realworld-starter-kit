package com.example.realworld.infrastructure.persistence.statement;

import com.example.realworld.domain.article.model.Article;
import io.vertx.core.json.JsonArray;

import java.util.List;

public interface ArticleStatements {
  Statement<JsonArray> countBy(String field, String value);

  Statement<JsonArray> countBy(String field, String value, String excludeArticleId);

  Statement<JsonArray> store(Article article);

  Statement<JsonArray> findArticles(
      int offset, int limit, List<String> tags, List<String> authors, List<String> favorited);

  Statement<JsonArray> totalArticles(
      List<String> tags, List<String> authors, List<String> favorited);

  Statement<JsonArray> findBySlug(String slug);

  Statement<JsonArray> update(Article article);

  Statement<JsonArray> deleteByArticleIdAndAuthorId(String articleId, String authorId);

  Statement<JsonArray> findBySlugAndAuthorId(String slug, String authorId);
}
