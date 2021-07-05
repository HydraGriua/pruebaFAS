package com.crehana.socialservice.services.impl;

import java.util.List;
import java.util.stream.Collectors;
import com.crehana.socialservice.dtos.CommentDto;
import com.crehana.socialservice.exceptions.NotFoundException;
import com.crehana.socialservice.models.Comment;
import com.crehana.socialservice.repositories.CommentRepository;
import com.crehana.socialservice.services.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    CommentRepository commentRepository;

    public static final ModelMapper modelMapper = new ModelMapper();

    @Override
    public Comment getCommentById(Long id) {
        return commentRepository.findById(id)
        .orElseThrow(()-> new NotFoundException("Not found"));
    }

    @Override
    public List<CommentDto> getComments() {
        return convertToResources(commentRepository.findAll());
    }

    @Override
    public List<Comment> getCommentsByPostId(Long postId) {
        return commentRepository.FindAllByPostId(postId);
    }

    @Override
    public Comment createComment(Comment comment) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Comment updateComment(Long id, Comment comment) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String deleteComment(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    private List<CommentDto> convertToResources(List<Comment> comments) {
        return comments.stream().map(x -> modelMapper.map(x, CommentDto.class)).collect(Collectors.toList());
    }
}
