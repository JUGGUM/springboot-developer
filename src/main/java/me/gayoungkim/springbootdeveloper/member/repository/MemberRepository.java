package me.gayoungkim.springbootdeveloper.member.repository;

import me.gayoungkim.springbootdeveloper.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
