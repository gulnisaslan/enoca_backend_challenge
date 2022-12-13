package com.example.project.dtos.request;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyRequestDto {
	
	private String companyName;
	
	private String companyAddress;

}
