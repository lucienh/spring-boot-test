package io.github.lucienh.test.project.controller.model;

import io.github.lucienh.test.project.controller.ResultBuilder;
import io.github.lucienh.test.project.entities.model.Model;
import io.github.lucienh.test.project.service.model.ModelService;
import io.github.lucienh.test.project.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

/**
 * Author developer
 * Date： 16-1-21
 */
@RestController
//@RequestMapping("/")
public class ModelController {

    @Autowired
    private ModelService modelService;

    @RequestMapping(value = "/model", method = RequestMethod.POST)
    public Map addProduct(@RequestBody Model model) {
        model.setCreateTime(DateUtil.formatDate(new Date()));
        model.setUpdateTime(DateUtil.formatDate(new Date()));
        model.setCreateUserId("jason_id");
        model.setCreateUserName("jason");
        return ResultBuilder.buildSuccess(modelService.saveModel(model));
    }

    @RequestMapping(value = "/model/{id}", method = RequestMethod.DELETE)
    public Map delModelById(@PathVariable int id) {
        modelService.deleteModelById(id);
        return ResultBuilder.buildSuccessCode();
    }

    @RequestMapping(value = "/model/{id}", method = RequestMethod.GET)
    public Map getModelById(@PathVariable int id) {
        return ResultBuilder.buildSuccess(modelService.getModelById(id));
    }

    @RequestMapping(value = "/model", method = RequestMethod.GET)
    public Map getAllModel() {
        return ResultBuilder.buildSuccess(modelService.getAllModel());
    }

    @RequestMapping(value = "/model", method = RequestMethod.PUT)
    public Map updateModelById(@RequestBody Model model) {
        model.setUpdateTime(DateUtil.formatDate(new Date()));
        modelService.updateModelById(model);
        return ResultBuilder.buildSuccessCode();
    }

}
