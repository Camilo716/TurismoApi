package com.example.TurismoApi.Services;

import com.example.TurismoApi.Models.Company;
import com.example.TurismoApi.Repositories.ICompanyRepository;
import com.example.TurismoApi.Validators.IValidable;
import com.example.TurismoApi.Validators.StringRangeValidator;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Array;
import java.util.List;

public class CompanyService {

    @Autowired
    ICompanyRepository companyRepository;
    @Autowired
    IValidable<String> stringLenghtValidator;

    private final IValidable<String> lengthBetween0And10Validator;
    private final IValidable<String> lengthBetween0And30Validator;

    public CompanyService() {
        lengthBetween0And10Validator = new StringRangeValidator(0,10);
        lengthBetween0And30Validator = new StringRangeValidator(0,30);
    }

    public Company postCompany(Company company) throws Exception {
        try{
            lengthBetween0And30Validator.validate(company.getName());
            lengthBetween0And10Validator.validate(company.getNit());
            return companyRepository.save(company);
        } catch (Exception exception){
            throw new Exception(exception.getMessage());
        }
    }

    public Company putCompany(Integer id, Company company) throws Exception {
        return null;
    }

    public Company getCompanyById(Integer id) throws Exception{
        return null;
    }

    public List<Company> getCompanies() throws Exception{
        return null;
    }

    public boolean deleteCompany(Integer id) throws Exception{
        return true;
    }
}
