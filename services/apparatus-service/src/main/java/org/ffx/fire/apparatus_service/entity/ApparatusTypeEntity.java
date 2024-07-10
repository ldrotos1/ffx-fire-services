package org.ffx.fire.apparatus_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(schema="ffx_fire_ops", name="apparatus_type")
public class ApparatusTypeEntity {

	@Id
	@Column(name="apparatus_type_id")
	private Integer apparatusTypeId;
	
	@Column(name="apparatus_type")
	private String apparatusType;
	
	@Column(name="apparatus_category")
	private String apparatusCategory;
	
	@Column(name="apparatus_image")
	private String apparatusImage;
	
	@Column(name="max_staff")
	private Integer maxStaff;
	
	@Column(name="min_staff_ff")
	private Integer minStaffFireFighter;
	
	@Column(name="min_staff_tech")
	private Integer minStaffTechnician;
	
	@Column(name="min_staff_officer")
	private Integer minStaffOfficer;
	
	@Column(name="min_staff_command")
	private Integer minStaffCommand;
	
	@Column(name="is_paramedic_required")
	private Boolean isParamedicRequired;
	
	@Column(name="is_cross_staffed")
	private Boolean isCrossStaffed;
	
	@Column(name="is_vol_staffed")
	private Boolean isVolStaffed;
}
