package com.greenfox.zsofi.reddit.Service;

import com.greenfox.zsofi.reddit.Dao.PostDao;
import com.greenfox.zsofi.reddit.Entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PostService {

    @Autowired
    private PostDao postdao;

    public void addPost(Post latestPost) {
        postdao.save(latestPost);
    }

    public List<Post> listPosts(){
        return postdao.findAllByOrderByScoreDesc();

    }

    public void upVote(Integer id){
        Post post = postdao.findOne(id);
        post.setScore(post.getScore() +1);
        postdao.save(post);
    }

    public void downVote(Integer id){
        Post post = postdao.findOne(id);
        post.setScore(post.getScore() -1);
        postdao.save(post);
    }
}
