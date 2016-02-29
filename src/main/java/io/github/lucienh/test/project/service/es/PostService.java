package io.github.lucienh.test.project.service.es;

import io.github.lucienh.test.project.entities.es.Post;

import java.util.List;

public interface PostService {

    Post save(Post post);

    Post findById(String id);

    List<Post> findAll();

    List<Post> findByTitle(String title);

    List<Post> findByTagsName(String tagName);

    void delete(String id);

}
