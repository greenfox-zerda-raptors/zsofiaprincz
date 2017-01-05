package com.greenfox.zsofi.reddit.Entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Table(name="posts")
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String content;
    private int score;

    public Post(int id, String content, int score) {
        this.id = id;
        this.content = content;
        this.score = score;
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
