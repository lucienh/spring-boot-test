package io.github.lucienh.test.project.dao.mysql;


import io.github.lucienh.test.project.entities.model.Model;

import java.util.List;

/**
 * Created by zl on 2015/8/27.
 */
public interface ModelMapper {

    public Model getModelById(int id);

    public int saveModel(Model model);

    public void updateModelById(Model model);

    public void deleteModelById(int id);

    public List<Model> getAllModel();
}
