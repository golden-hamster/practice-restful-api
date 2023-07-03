package com.hello.my_first_restful_api.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Comment {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "comment_id")
    private Long id;

    private Member member;

    private Post post;

    private String content;

    private LocalDateTime creationDate;


}
