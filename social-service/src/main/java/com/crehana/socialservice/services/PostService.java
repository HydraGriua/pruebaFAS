package com.crehana.socialservice.services;

import java.util.List;
import com.crehana.socialservice.models.Post;
public interface PostService {
    Post getPostById(Long id);
    List<Post> getPosts();
    Post createPost(Post post);
    Post updatePost(Long id, Post post);
    String deletePost(Long id);
}
