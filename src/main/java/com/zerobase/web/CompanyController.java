package com.zerobase.web;

import com.zerobase.model.Company;
import com.zerobase.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
@AllArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping("/autocomplete") //키워드 조회
    public ResponseEntity<?> autocomplete(@RequestParam String keyword){
        return null;
    }

    @GetMapping // company 리스트
    public ResponseEntity<?> searchCompany(){
        return null;
    }

    @PostMapping //data 저장
    public ResponseEntity<?> addCompany(@RequestBody Company request){
        String ticker = request.getTicker().trim();
        if(ObjectUtils.isEmpty(ticker)){
            throw new RuntimeException("ticker is empty");
        }

        Company company = this.companyService.save(ticker);

        return ResponseEntity.ok(company);
    }

    @DeleteMapping //data 삭제
    public ResponseEntity<?> deleteCompany(){
        return null;
    }
}
