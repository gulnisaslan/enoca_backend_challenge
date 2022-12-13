package com.example.project.service;

import java.util.List;

import com.example.project.dtos.request.CompanyRequestDto;
import com.example.project.dtos.response.CompanyResponseDto;
import com.example.project.model.Company;

public interface CompanyService {
	List<Company> getAllCompany();
	CompanyResponseDto getByCompanyId(Long id);
	CompanyResponseDto saveCompany(CompanyRequestDto companyRequestDto);
	CompanyResponseDto updateCompany(Company company);
	Boolean deleteByCompanyId(Long Id);
	

}
