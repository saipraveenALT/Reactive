package com.example.demo.dal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
@Table("EMPLOYEE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {
	@Id
	private int id;
	@Column("name")
	private String name;
	@Column("email")
	private String email;
	@Column("phno")
	private int phno;

//	private ProjectEntity projectEntity;
}
