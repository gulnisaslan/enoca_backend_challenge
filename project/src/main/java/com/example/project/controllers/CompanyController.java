package com.example.project.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.dtos.request.CompanyRequestDto;
import com.example.project.dtos.response.CompanyResponseDto;
import com.example.project.model.Company;
import com.example.project.service.CompanyService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value="/api/v1/companies/")
@RequiredArgsConstructor
public class CompanyController {
	
	private final CompanyService companyService;
	
	@GetMapping(value = "getAllCompany")
	public List<Company> getAllCompanies(){
		return this.companyService.getAllCompany();
	}
	@GetMapping(value = "getbyid/{id}")
	public CompanyResponseDto getByCompanyId(@PathVariable("id") Long id) {
		return this.companyService.getByCompanyId(id);
	}
	@PostMapping(value = "savecompany")
	public CompanyResponseDto saveCompany(@RequestBody CompanyRequestDto companyRequestDto) {
		return this.companyService.saveCompany(companyRequestDto);
		
	}
	@PutMapping(value="updatecompany")
	public CompanyResponseDto updateCompany(@RequestBody Company company) {
		return this.companyService.updateCompany(company);
	}
	@DeleteMapping(value = "delete/{id}")
	public Boolean deleteByCompanyId(@PathVariable("id") Long id) {
		return this.companyService.deleteByCompanyId(id);
		
	}

}
