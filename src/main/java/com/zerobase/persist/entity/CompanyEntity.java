package com.zerobase.persist.entity;

import com.zerobase.model.Company;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

//entity는 데이터베이스의 테이블과 매핑되는 객체
//model과 entity는 서로 다른 객체이다.
//entity는 데이터베이스의 테이블과 매핑되는 객체이고, model은 사용자에게 보여지는 객체이다.

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

    public CompanyEntity(Company company){
        this.ticker = company.getTicker();
        this.name = company.getName();
    }
}
