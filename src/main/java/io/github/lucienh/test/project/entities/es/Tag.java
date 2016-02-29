package io.github.lucienh.test.project.entities.es;

import java.io.Serializable;


public class Tag implements Serializable {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tag{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            '}';
    }
}
