package com.hello.my_first_restful_api.service;

import com.hello.my_first_restful_api.domain.Member;
import com.hello.my_first_restful_api.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public Long join(Member member) {
        memberRepository.save(member);
        return member.getId();
    }

    public Member findById(Long id) {
        return memberRepository.findById(id).get();
    }

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    public Member findByLoginId(String loginId) {
        return memberRepository.findByLoginId(loginId).get();
    }

}
