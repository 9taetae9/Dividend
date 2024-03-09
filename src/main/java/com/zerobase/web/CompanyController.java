package com.zerobase.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @GetMapping("/autocomplete") //키워드 조회
    public ResponseEntity<?> autocomplete(@RequestParam String keyword){
        return null;
    }

    @GetMapping // company 리스트
    public ResponseEntity<?> searchCompany(){
        return null;
    }

    @PostMapping //data 저장
    public ResponseEntity<?> addCompany(){
        return null;
    }

    @DeleteMapping //data 삭제
    public ResponseEntity<?> deleteCompany(){
        return null;
    }
}
