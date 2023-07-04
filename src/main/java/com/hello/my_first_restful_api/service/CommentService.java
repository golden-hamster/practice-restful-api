package com.hello.my_first_restful_api.service;

import com.hello.my_first_restful_api.domain.Comment;
import com.hello.my_first_restful_api.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CommentService {

    private final CommentRepository commentRepository;

    @Transactional
    public Long save(Comment comment) {
        commentRepository.save(comment);
        return comment.getId();
    }

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }
}
