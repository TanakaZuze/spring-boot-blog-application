package com.dev.tanaka.spring_boot_blog_application.repository;

import com.dev.tanaka.spring_boot_blog_application.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
