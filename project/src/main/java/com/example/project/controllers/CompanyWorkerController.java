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

import com.example.project.dtos.request.CompanyWorkerRequestDto;
import com.example.project.dtos.response.CompanyWorkerResponseDto;
import com.example.project.model.CompanyWorker;
import com.example.project.service.CompanyWorkerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value ="/api/v1/companyworkers/")
@RequiredArgsConstructor
public class CompanyWorkerController {
	
	private final CompanyWorkerService companyWorkerService;
	
	@GetMapping(value="getallcompanyworkers")
	public List<CompanyWorker> getAllCompanyWorker() {
		// TODO Auto-generated method stub
		return this.companyWorkerService.getAllCompanyWorker();
	}

	@GetMapping(value ="getbyid/{id}")
	public CompanyWorkerResponseDto getByCompanyWorkerId(@PathVariable("id")  Long id) {
		// TODO Auto-generated method stub
		return this.companyWorkerService.getByCompanyWorkerId(id);
	}
	@PostMapping(value="savecompanyWorker")
	public CompanyWorkerResponseDto saveCompanyWorker(@RequestBody CompanyWorkerRequestDto companyWorkerRequestDto) {
		// TODO Auto-generated method stub
		return this.companyWorkerService.saveCompanyWorker(companyWorkerRequestDto);
	}
	
	@PutMapping(value ="updatecompanyworker")
	public CompanyWorkerResponseDto updateCompanWorker(@RequestBody CompanyWorker companyWorker) {
		// TODO Auto-generated method stub
		return this.companyWorkerService.updateCompanWorker(companyWorker);
	}
	@DeleteMapping(value ="deleteByCompanyWorkerId/{id}")
	public Boolean deleteByCompanyWorkerId(@PathVariable("id") Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
