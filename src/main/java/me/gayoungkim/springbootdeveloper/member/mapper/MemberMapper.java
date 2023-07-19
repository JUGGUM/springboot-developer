package me.gayoungkim.springbootdeveloper.member.mapper;

import me.gayoungkim.springbootdeveloper.member.domain.Member;
import me.gayoungkim.springbootdeveloper.member.entity.MemberEntity;

public class MemberMapper {
  public static Member toDomain(MemberEntity entity) {
    Member member = new Member();
    member.setId(entity.getId());
    member.setName(entity.getName());
    member.setEmail(entity.getEmail());
    return member;
  }

  public static MemberEntity toEntity(Member member){
    MemberEntity entity = new MemberEntity();
    entity.setId(member.getId());
    entity.setName(member.getName());
    entity.setEmail(member.getEmail());
    return entity;
  }
}
