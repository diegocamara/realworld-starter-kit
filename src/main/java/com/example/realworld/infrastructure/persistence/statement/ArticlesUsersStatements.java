package com.example.realworld.infrastructure.persistence.statement;

import io.vertx.core.json.JsonArray;

public interface ArticlesUsersStatements {
  Statement<JsonArray> countByArticleIdAndUserId(String articleId, String userId);

  Statement<JsonArray> countByArticleId(String articleId);

  Statement<JsonArray> deleteByArticle(String articleId);

  Statement<JsonArray> store(String articleId, String userId);

  Statement<JsonArray> deleteByArticleAndUser(String articleId, String userId);
}
