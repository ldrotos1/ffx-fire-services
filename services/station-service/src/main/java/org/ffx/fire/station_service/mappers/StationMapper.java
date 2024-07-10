package org.ffx.fire.station_service.mappers;

import org.ffx.fire.models.station.Station;
import org.ffx.fire.models.station.StationListItem;
import org.ffx.fire.station_service.entity.StationEntity;
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
	
	public static Station mapStation(StationEntity entity) {
		return Station.builder()
				.stationDesignator(entity.getStationDesignator())
				.stationNumber(entity.getStationNumber())
				.stationName(entity.getStationName())
				.departmentName(entity.getDepartment().getDepartmentFullName())
				.battalion(entity.getBattalion())
				.division(entity.getDivision())
				.address(entity.getAddress())
				.city(entity.getCity())
				.state(entity.getState())
				.zipCode(entity.getZipCode())
				.latitude(entity.getLatitude())
				.longitude(entity.getLongitude())
				.build();
	}
}
