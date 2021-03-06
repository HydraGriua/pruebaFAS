package com.crehana.socialservice.repositories;
import java.util.List;

import com.crehana.socialservice.models.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CommentRepository extends JpaRepository<Comment,Long>{
    List<Comment> FindAllByPostId(long postId);
}
