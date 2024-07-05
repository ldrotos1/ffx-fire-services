package org.ffx.fire.station_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(schema="ffx_fire_ops", name="station")
public class StationListItemEntity {
	
	@Id
	@Column(name="station_designator")
	private Integer stationDesignator;
	
	@Column(name="station_number")
	private int stationNumber;
	
	@Column(name="station_name")
	private String stationName;
	
	@Column(name="battalion")
	private int battalion;
	
	@Column(name="divison")
	private int division;
}
