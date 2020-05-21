package com.huy.models;

import javax.persistence.*;

@Entity
@NamedQuery(
        name = "getAllBlog",
        query = "select blog from Blog blog"
)
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String article;

    public Blog(){

    }
    public Blog(String title, String article) {
        this.title = title;
        this.article = article;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }
}
