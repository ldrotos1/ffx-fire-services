package org.ffx.fire.apparatus_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(schema="ffx_fire_ops", name="apparatus")
public class ApparatusEntity {

	@Id
	@Column(name="unit_designator")
	private String unitDesignator;
	
	@Column(name="station_designator")
	private Integer stationDesignator;
	
	@ManyToOne
	@JoinColumn(name="apparatus_type_id", nullable=false)
	private ApparatusTypeEntity apparatusType;
	
	@Column(name="dept_id")
	private String departmentId;
	
	@Column(name="is_reserved")
	private Boolean isReserved;
	
	@Column(name="year")
	private Integer year;
	
	@Column(name="make")
	private String make;
	
	@Column(name="model")
	private String model;
}
