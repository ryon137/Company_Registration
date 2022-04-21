package com.example.CompanyRegistration.service;

import com.example.CompanyRegistration.model.Company;
import com.example.CompanyRegistration.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CompanyService {
    @Autowired
    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository){
        this.companyRepository = companyRepository;
    }

    public Company createCompany(Company company){
        System.out.println(LocalDateTime.now());
        return companyRepository.save(company);
    }


}
