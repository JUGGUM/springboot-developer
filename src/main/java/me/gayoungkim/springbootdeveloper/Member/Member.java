package me.gayoungkim.springbootdeveloper.Member;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자
@AllArgsConstructor
@Getter
@Entity // 엔티티로 지정 (name = "member_list")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키의 생성방식을 결정
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
