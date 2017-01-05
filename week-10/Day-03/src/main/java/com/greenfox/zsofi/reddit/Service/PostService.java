package com.greenfox.zsofi.reddit.Service;

import com.greenfox.zsofi.reddit.Dao.PostDao;
import com.greenfox.zsofi.reddit.Entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PostService {

    @Autowired
    private PostDao postdao;

    public void addPost(Post latestPost) {
        latestPost.setScore(0);
        postdao.save(new Post());
    }

    public List<Post> listPosts(){
        List<Post> list = new ArrayList<>();
        for (Post item : postdao.findAll()) {
            list.add(item);
        }
        return list;

    }

    public void upVote(Post post){
        post.setScore(post.getScore() +1);
        postdao.save(post);
    }

    public void downVote(Post post){
        post.setScore(post.getScore() -1);
        postdao.save(post);
    }
}
