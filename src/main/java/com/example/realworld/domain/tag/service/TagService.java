package com.example.realworld.domain.tag.service;

import com.example.realworld.domain.tag.model.Tag;
import io.reactivex.Single;

import java.util.List;
import java.util.Optional;

public interface TagService {

  Single<Tag> create(String tagName);

  Single<List<Tag>> findTagsByArticle(String articleId);

  Single<Optional<Tag>> findTagByName(String name);

  Single<List<Tag>> findAll();
}
