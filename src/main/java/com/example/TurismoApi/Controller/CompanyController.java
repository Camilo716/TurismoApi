package com.example.TurismoApi.Controller;

import com.example.TurismoApi.Models.Company;
import com.example.TurismoApi.Services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @PostMapping
    public ResponseEntity<?> postCompany(@RequestBody Company company){
        return null;
    }

    @PutMapping()
    public ResponseEntity<?> putCompany(@RequestBody Company company, @PathVariable Integer id){
        return null;
    }

    @GetMapping
    public ResponseEntity<?> getCompanyById(@PathVariable Integer id){
        return null;
    }

    @GetMapping
    public ResponseEntity<?> getCompanies(){
        return null;
    }

    @DeleteMapping
    public ResponseEntity<?> deleteCompany(@PathVariable Integer id){
        return null;
    }
}
