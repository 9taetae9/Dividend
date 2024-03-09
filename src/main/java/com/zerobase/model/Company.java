package com.zerobase.model;


import lombok.Builder;
import lombok.Data;

@Data    //getter, setter, toString, equals, hashCode, RequiredArgsConstructor를 자동으로 생성
@Builder //Builder 패턴을 사용할 수 있게 해준다.
public class Company {
    private String ticker;
    private String name;
}
