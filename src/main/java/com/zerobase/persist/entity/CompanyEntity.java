package com.zerobase.persist.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "COMPANY") //회사 정보
@Getter
@ToString  //instance 변수들을 출력하는 toString 메소드를 자동으로 생성
@NoArgsConstructor
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동으로 생성되는 값
    private Long id;

    @Column(unique = true)
    private String ticker;

    private String name;
}
