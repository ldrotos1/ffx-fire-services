package org.ffx.fire.station_service.interfaces;

import java.util.List;

import org.ffx.fire.models.station.Station;
import org.ffx.fire.models.station.StationListItem;
import org.springframework.stereotype.Service;

@Service
public interface StationServiceInterface {

	public List<StationListItem> getStationList();
	
	public Station getStation(Integer stationDesignator);
}
