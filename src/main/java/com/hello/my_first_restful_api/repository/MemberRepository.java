package com.hello.my_first_restful_api.repository;

import com.hello.my_first_restful_api.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {


}
