package io.github.lucienh.test.project.controller.sample;

import io.github.lucienh.test.project.controller.ResultBuilder;
import io.github.lucienh.test.project.entities.es.Post;
import io.github.lucienh.test.project.service.es.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value = "/example")
public class EsSampleController {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map getById(@PathVariable String id) {
        return ResultBuilder.buildSuccess(this.postService.findById(id));
    }

    @RequestMapping(value = "/title/{title}", method = RequestMethod.GET)
    @ResponseBody
    public Map getByTitle(@PathVariable String title) {
        return ResultBuilder.buildSuccess(this.postService.findByTitle(title));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public Map getAll() {
        return ResultBuilder.buildSuccess(this.postService.findAll());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public Map save(@RequestBody Post post) {
        return ResultBuilder.buildSuccess(this.postService.save(post).getId());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Map delete(@PathVariable String id) {
        this.postService.delete(id);
        return ResultBuilder.buildSuccessCode();
    }

}
