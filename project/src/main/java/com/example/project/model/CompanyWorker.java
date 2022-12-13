package com.example.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "company_workers")
public class CompanyWorker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "worker_name")
	private String workerName;
	
	@Column(name="worker_lastname")
	private String workerLastName;
	
	@Column(name="worker_phone_number")
	private String workerPhoneNumber;
	
	@Column(name ="worker_email")
	@Email
	private String workerEmail;
	
	@ManyToOne
	@JoinColumn(name ="company_id",referencedColumnName = "id")
	private Company company;
	
	
	
	
	

}
