package com.example.project.service.serviceImpl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.aspectj.weaver.NewFieldTypeMunger;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.project.dtos.request.CompanyRequestDto;
import com.example.project.dtos.response.CompanyResponseDto;
import com.example.project.model.Company;
import com.example.project.repository.CompanyRepository;
import com.example.project.service.CompanyService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService{
     
	private final CompanyRepository  companyRepository;
	private final ModelMapper modelMapper;

	@Override
	public List<Company> getAllCompany() {
		// TODO Auto-generated method stub
		return this.companyRepository.findAll();
	}

	@Override
	public CompanyResponseDto getByCompanyId(Long id) {
		Company getById= this.companyRepository.findById(id).orElseThrow(()-> new EntityNotFoundException());
		
		return modelMapper.map(getById, CompanyResponseDto.class);
	}

	@Override
	public CompanyResponseDto saveCompany(CompanyRequestDto companyRequestDto) {
		// TODO Auto-generated method stub
		Company saveCompanyWithDto  = 
				this.companyRepository.save(modelMapper.map(companyRequestDto, Company.class));
		return modelMapper.map(saveCompanyWithDto, CompanyResponseDto.class);
	}

	@Override
	public CompanyResponseDto updateCompany(Company company) {
		// TODO Auto-generated method stub
		Company getById= this.companyRepository.findById(company.getId()).orElseThrow(()-> new EntityNotFoundException());
		
		Company updateCompanyRequest  = this.companyRepository.save(getById);
		return modelMapper.map(updateCompanyRequest, CompanyResponseDto.class);
	}

	@Override
	public Boolean deleteByCompanyId(Long Id) {
		// TODO Auto-generated method stub
		Company getById= this.companyRepository.findById(Id).orElseThrow(()-> new EntityNotFoundException());
		this.companyRepository.delete(getById);
		return true;
	}
}
