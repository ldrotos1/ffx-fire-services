package org.ffx.fire.apparatus_service.mappers;

import org.ffx.fire.apparatus_service.entity.ApparatusEntity;
import org.ffx.fire.models.apparatus.StationApparatus;
import org.springframework.stereotype.Component;

@Component
public class ApparatusMapper {

	public static StationApparatus mapStationApparatus(ApparatusEntity entity) {
		return StationApparatus.builder()
				.unitDesignator(entity.getUnitDesignator())
				.apparatusType(entity.getApparatusType().getApparatusType())
				.apparatusCategory(entity.getApparatusType().getApparatusCategory())
				.isReserved(entity.getIsReserved())
				.build();
	}
}
