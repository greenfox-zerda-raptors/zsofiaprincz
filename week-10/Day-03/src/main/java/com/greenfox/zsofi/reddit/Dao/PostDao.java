package com.greenfox.zsofi.reddit.Dao;

import com.greenfox.zsofi.reddit.Entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostDao extends CrudRepository<Post, Integer> {

    List<Post> findAllByOrderByScoreDesc();



}
