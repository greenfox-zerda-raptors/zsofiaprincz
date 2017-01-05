package com.greenfox.zsofi.reddit.Dao;

import com.greenfox.zsofi.reddit.Entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDao extends CrudRepository<Post, Integer> {



}
