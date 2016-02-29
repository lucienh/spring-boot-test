package io.github.lucienh.test.project.service.model;

import io.github.lucienh.test.project.entities.model.Model;

import java.util.List;

public interface ModelService {

    Model getModelById(int id);

    int saveModel(Model model);

    void updateModelById(Model model);

    void deleteModelById(int id);

    List<Model> getAllModel();
}
