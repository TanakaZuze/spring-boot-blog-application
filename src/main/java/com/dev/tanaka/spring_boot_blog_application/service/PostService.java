package com.dev.tanaka.spring_boot_blog_application.service;

import com.dev.tanaka.spring_boot_blog_application.model.Post;
import com.dev.tanaka.spring_boot_blog_application.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Service
public class PostService implements PostServiceI{
//    repository injection
    protected final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post creatPost(Post post) {
        if(post.getId()==null){
            post.setCreatedAt(LocalDateTime.now());
        }
        return postRepository.save(post);
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Optional<Post> getPostById(Long id) {
        return Optional.empty();
    }

    @Override
    public Post updatePost(Post post) {
        Post updatedPost= new Post();
        updatedPost.setTitle(post.getTitle());
        updatedPost.setContent(post.getContent());

        return postRepository.save(updatedPost);
    }

}
