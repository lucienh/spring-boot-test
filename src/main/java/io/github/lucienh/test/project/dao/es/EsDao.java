package io.github.lucienh.test.project.dao.es;

import io.github.lucienh.test.project.entities.es.Post;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;


public interface EsDao extends ElasticsearchRepository<Post, String>{

    List<Post> findAll();

    Post findById(String id);

    List<Post> findByTitle(String title);

    List<Post> findByTagsName(String name);

    String deleteById(String id);
}
