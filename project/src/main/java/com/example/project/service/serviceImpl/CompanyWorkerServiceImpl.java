package com.example.project.service.serviceImpl;

import java.util.List;

import javax.persistence.EntityNotFoundException;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.project.dtos.request.CompanyWorkerRequestDto;
import com.example.project.dtos.response.CompanyWorkerResponseDto;
import com.example.project.model.CompanyWorker;
import com.example.project.repository.CompanyWorkerRepository;
import com.example.project.service.CompanyWorkerService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CompanyWorkerServiceImpl implements CompanyWorkerService{
	
	private final CompanyWorkerRepository workerRepository;
	private final ModelMapper modelMapper;
	@Override
	public List<CompanyWorker> getAllCompanyWorker() {
		// TODO Auto-generated method stub
		return this.workerRepository.findAll();
	}
	@Override
	public CompanyWorkerResponseDto getByCompanyWorkerId(Long id) {
		// TODO Auto-generated method stub
		CompanyWorker companyWorker = this.workerRepository.findById(id)
				.orElseThrow(()->new EntityNotFoundException());
		return modelMapper.map(companyWorker, CompanyWorkerResponseDto.class);
	}
	@Override
	public CompanyWorkerResponseDto saveCompanyWorker( CompanyWorkerRequestDto companyWorkerRequestDto) {
		// TODO Auto-generated method stub
		CompanyWorker companyWorker = this.workerRepository.save(modelMapper.map(companyWorkerRequestDto, CompanyWorker.class));
		return modelMapper.map(companyWorker, CompanyWorkerResponseDto.class);
	}
	@Override
	public CompanyWorkerResponseDto updateCompanWorker(CompanyWorker companyWorker) {
		// TODO Auto-generated method stub
		CompanyWorker getby = this.workerRepository.findById(companyWorker.getId())
				.orElseThrow(()-> new EntityNotFoundException());
		CompanyWorker save=this.workerRepository.save(getby);
		
		return modelMapper.map(save, CompanyWorkerResponseDto.class);
	}
	@Override
	public Boolean deleteByCompanyWorkerId(Long Id) {
		// TODO Auto-generated method stub
		CompanyWorker companyWorker = this.workerRepository.findById(Id)
				.orElseThrow(()->new EntityNotFoundException());
		this.workerRepository.deleteById(companyWorker.getId());
		return null;
	}





}
