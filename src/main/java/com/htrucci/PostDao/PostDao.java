package com.htrucci.PostDao;

import com.htrucci.Controller.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 201410089 on 2017-06-23.
 */
public interface PostDao extends JpaRepository<Post, Integer>{
}
