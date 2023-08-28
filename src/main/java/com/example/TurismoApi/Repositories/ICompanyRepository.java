package com.example.TurismoApi.Repositories;

import com.example.TurismoApi.Models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompanyRepository extends JpaRepository<Company, Integer> {

}
