package io.github.lucienh.test.project.entities.model;

import java.io.Serializable;

/**
 * Author developer
 * Date： 16-2-29
 * Version: spring-boot-test-1.0
 * Copyright : lucien.hua
 */

public class Model implements Serializable{

    private int id;
    private String name;
    private String description;
    private String createTime;
    private String updateTime;
    private String createUserId;
    private String createUserName;
    private String gqimContext;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getGqimContext() {
        return gqimContext;
    }

    public void setGqimContext(String gqimContext) {
        this.gqimContext = gqimContext;
    }

    @Override
    public String toString() {
        return "Modle{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", description='" + description + '\'' +
            ", createTime='" + createTime + '\'' +
            ", updateTime='" + updateTime + '\'' +
            ", createUserId='" + createUserId + '\'' +
            ", createUserName='" + createUserName + '\'' +
            ", gqimContext='" + gqimContext + '\'' +
            '}';
    }
}
