package com.example.project.service;

import java.util.List;

import com.example.project.dtos.request.CompanyRequestDto;
import com.example.project.dtos.request.CompanyWorkerRequestDto;
import com.example.project.dtos.response.CompanyResponseDto;
import com.example.project.dtos.response.CompanyWorkerResponseDto;
import com.example.project.model.Company;
import com.example.project.model.CompanyWorker;

public interface CompanyWorkerService {
	
	List<CompanyWorker> getAllCompanyWorker();
	CompanyWorkerResponseDto getByCompanyWorkerId(Long id);
	CompanyWorkerResponseDto saveCompanyWorker(CompanyWorkerRequestDto companyWorkerRequestDto);
	CompanyWorkerResponseDto updateCompanWorker(CompanyWorker companyWorker);
	Boolean deleteByCompanyWorkerId(Long Id);

}
