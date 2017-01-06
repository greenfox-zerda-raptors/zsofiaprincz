package com.greenfox.zsofi.reddit.Entity;


import javax.persistence.*;
import java.util.Date;


@Table(name="posts")
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String content;
    private int score;
    private Date date;

    public Post(int id, String content, int score) {
        this.id = id;
        this.content = content;
        this.score = score;
        date = new Date();
    }

    public Post() {}

    public Post(String content) {
        this.content = content;
    }

    public long getId() {
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
