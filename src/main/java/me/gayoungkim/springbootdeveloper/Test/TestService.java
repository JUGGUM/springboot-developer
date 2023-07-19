package me.gayoungkim.springbootdeveloper.Test;

import me.gayoungkim.springbootdeveloper.member.domain.Member;
import me.gayoungkim.springbootdeveloper.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
