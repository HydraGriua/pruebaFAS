package com.crehana.socialservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDto {
    private Long id;
    private String title;
    private String description;
    private Long userId;
}
