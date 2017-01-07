package com.greenfox.zsofi.reddit.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@Table(name="posts")
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String content;
    private int score =0;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;



    public Post() {
        date = new Date();
    }

    public Post(String content) {
        this();
        this.content = content;
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
