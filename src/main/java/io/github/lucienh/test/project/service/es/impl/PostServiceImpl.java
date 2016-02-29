package io.github.lucienh.test.project.service.es.impl;

import io.github.lucienh.test.project.entities.es.Post;
import io.github.lucienh.test.project.dao.es.EsDao;
import io.github.lucienh.test.project.service.es.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private EsDao esDao;

    @Override
    public Post save(Post post) {
        esDao.save(post);
        return post;
    }

    @Override
    public Post findById(String id) {
        return esDao.findById(id);
    }

    @Override
    public List<Post> findByTitle(String title) {
        List<Post> posts = esDao.findByTitle(title);
        return posts;
    }

    @Override
    public List<Post> findAll() {
        return esDao.findAll();
    }

    @Override
    public List<Post> findByTagsName(String tagName) {
        return esDao.findByTagsName(tagName);
    }

    @Override
    public void delete(String id) {
        esDao.deleteById(id);
    }
}
