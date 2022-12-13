package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Company;

@Repository
public interface CompanyRepository  extends JpaRepository<Company, Long> {

}
