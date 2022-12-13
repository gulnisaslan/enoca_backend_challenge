package com.example.project.dtos.response;

import java.util.List;

import com.example.project.model.CompanyWorker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CompanyWorkerResponseDto {
	private String workerName;

	private String workerLastName;
	
	private String workerPhoneNumber;
	
	private String workerEmail;
	private Long companyId;

}
