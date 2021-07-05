package com.crehana.socialservice.services;

import java.util.List;

import com.crehana.socialservice.dtos.CommentDto;
import com.crehana.socialservice.models.Comment;

public interface CommentService {
    Comment getCommentById(Long id);
    List<CommentDto> getComments();
    List<Comment> getCommentsByPostId(Long postId);
    Comment createComment(Comment comment);
    Comment updateComment(Long id, Comment comment);
    String deleteComment(Long id);
}
