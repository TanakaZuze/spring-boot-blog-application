package com.dev.tanaka.spring_boot_blog_application.service;

import com.dev.tanaka.spring_boot_blog_application.model.Post;

import java.util.List;
import java.util.Optional;

public interface PostServiceI {
    Post creatPost(Post post);
    List<Post> getAllPosts();
    Optional<Post> getPostById(Long id);
    Post updatePost(Post post);
}
