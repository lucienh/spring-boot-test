package io.github.lucienh.test.project.entities.es;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.List;

@Document(indexName = "post", type = "post", shards = 1, replicas = 1)
public class Post implements Serializable{
    @Id
    private String id;
    private String title;
   // @Field(type= FieldType.Nested)
    private List<Tag> tags;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Post{" +
            "id='" + id + '\'' +
            ", title='" + title + '\'' +
            ", tags=" + tags +
            '}';
    }
}
