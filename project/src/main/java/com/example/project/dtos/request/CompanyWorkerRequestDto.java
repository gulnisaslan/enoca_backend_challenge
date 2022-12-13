package com.example.project.dtos.request;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyWorkerRequestDto {
	private String workerName;

	private String workerLastName;
	
	private String workerPhoneNumber;
	
	private String workerEmail;
	private Long companyId;

}
