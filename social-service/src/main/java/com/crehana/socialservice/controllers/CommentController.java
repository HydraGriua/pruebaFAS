package com.crehana.socialservice.controllers;

import java.util.List;

import com.crehana.socialservice.dtos.CommentDto;
import com.crehana.socialservice.responses.ResourceResponse;
import com.crehana.socialservice.services.CommentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    CommentService commentService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public ResourceResponse<List<CommentDto>> getComments() throws RuntimeException{
        return new ResourceResponse<>("Success",String.valueOf(HttpStatus.OK),"OK",
                commentService.getComments());
    }
}
