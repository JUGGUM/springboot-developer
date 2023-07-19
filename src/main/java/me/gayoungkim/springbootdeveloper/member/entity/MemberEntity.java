package me.gayoungkim.springbootdeveloper.member.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity // 엔티티로 지정 (name = "member_list")
@Table(name = "members")
@Getter
@Setter
public class MemberEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키의 생성방식을 결정
  @Column(name = "id", updatable = false)
  private Long id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "email", nullable = false)
  private String email;
}
