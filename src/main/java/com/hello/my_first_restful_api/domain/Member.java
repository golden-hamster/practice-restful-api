package com.hello.my_first_restful_api.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class Member {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    @Id
    private Long id;

    private String loginId;

    private String password;

    private String name;

    private LocalDateTime creationDate;



}
