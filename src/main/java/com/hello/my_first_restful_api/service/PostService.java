package com.hello.my_first_restful_api.service;

import com.hello.my_first_restful_api.domain.Post;
import com.hello.my_first_restful_api.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public Long save(Post post) {
        postRepository.save(post);

        return post.getId();
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }


}
