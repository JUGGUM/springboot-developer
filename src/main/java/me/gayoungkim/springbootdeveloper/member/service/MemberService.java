package me.gayoungkim.springbootdeveloper.member.service;

import java.util.NoSuchElementException;
import java.util.Optional;
import me.gayoungkim.springbootdeveloper.member.domain.Member;
import me.gayoungkim.springbootdeveloper.member.entity.MemberEntity;
import me.gayoungkim.springbootdeveloper.member.mapper.MemberMapper;
import me.gayoungkim.springbootdeveloper.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

  @Autowired
  MemberRepository memberRepository;

  public Member getMember(Long id){
      Optional<Member> memberEntity = memberRepository.findById(id);
      if(memberEntity.isPresent()){
          MemberEntity memberEntity1 = memberEntity.get();
          return MemberM
      }
      return MemberMapper.toDomain(memberEntity);
  }
}
