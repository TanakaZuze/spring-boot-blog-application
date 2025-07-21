package com.dev.tanaka.spring_boot_blog_application.controller;

import com.dev.tanaka.spring_boot_blog_application.model.Post;
import com.dev.tanaka.spring_boot_blog_application.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class PostController {
//    dependency injection for post service
    protected final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/create-post")
    @ResponseStatus(HttpStatus.CREATED)
    public Post createpost(@RequestBody Post post){
        return postService.creatPost(post);
    }


//    create task

}
