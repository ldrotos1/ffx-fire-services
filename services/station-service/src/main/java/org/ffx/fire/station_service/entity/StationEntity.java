package org.ffx.fire.station_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(schema="ffx_fire_ops", name="station")
public class StationEntity {
	
	@Id
	@Column(name="station_designator")
	private Integer stationDesignator;
	
	@Column(name="station_number")
	private int stationNumber;
	
	@Column(name="station_name")
	private String stationName;
	
	@ManyToOne
	@JoinColumn(name="department_id", nullable=false)
	private DepartmentEntity department;
	
	@Column(name="battalion")
	private int battalion;
	
	@Column(name="divison")
	private int division;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zip")
	private String zipCode;
	
	@Column(name="lat")
	private double latitude;
	
	@Column(name="lon")
	private double longitude;
}
