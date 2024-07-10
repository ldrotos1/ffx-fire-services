package org.ffx.fire.station_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(schema="ffx_fire_ops", name="department")
public class DepartmentEntity {

	@Id
	@Column(name="dept_id")
	private Integer departmentId;
	
	@Column(name="dept_full_name")
	private String departmentFullName;
	
	@Column(name="dept_short_name")
	private String departmentShortName;
	
	@Column(name="dept_abbreviation")
	private String departmentAbbreviation;
}
