package io.github.lucienh.test.project.service.model.impl;

import io.github.lucienh.test.project.dao.mysql.ModelMapper;
import io.github.lucienh.test.project.entities.model.Model;
import io.github.lucienh.test.project.service.model.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelServiceImpl implements ModelService{

    @Autowired
    private ModelMapper modelMapper;

    public Model getModelById(int id){
        return modelMapper.getModelById(id);
    }

    public int saveModel(Model model){
        return modelMapper.saveModel(model);
    }

    public void updateModelById(Model model){
        modelMapper.updateModelById(model);
    }

    public void deleteModelById(int id){
        modelMapper.deleteModelById(id);
    }

    public List<Model> getAllModel(){
        return modelMapper.getAllModel();
    }
}
