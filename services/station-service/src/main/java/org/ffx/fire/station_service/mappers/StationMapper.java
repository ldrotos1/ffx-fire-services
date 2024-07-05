package org.ffx.fire.station_service.mappers;

import org.ffx.fire.models.station.StationListItem;
import org.ffx.fire.station_service.entity.StationListItemEntity;
import org.springframework.stereotype.Component;

@Component
public class StationMapper {

	public static StationListItem mapStationListItem(StationListItemEntity entity) {
		return StationListItem.builder()
				.stationDesignator(entity.getStationDesignator())
				.stationNumber(entity.getStationNumber())
				.stationName(entity.getStationName())
				.battalion(entity.getBattalion())
				.division(entity.getDivision())
				.build();
	}
}
