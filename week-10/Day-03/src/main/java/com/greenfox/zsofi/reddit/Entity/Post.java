package com.greenfox.zsofi.reddit.Entity;


import javax.persistence.*;
import java.util.Date;


@Table(name="posts")
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String content;
    private int score =0;
    private Date date;

    public Post(int id, String content, int score) {
        this.id = id;
        this.content = content;
        this.score = score;
        date = new Date();
    }

    public Post() {
        date = new Date();
    }

    public Post(String content) {
        this();
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", score=" + score +
                '}';
    }
}
