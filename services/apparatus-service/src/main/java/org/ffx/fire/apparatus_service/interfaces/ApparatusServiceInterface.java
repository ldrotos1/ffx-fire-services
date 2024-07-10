package org.ffx.fire.apparatus_service.interfaces;

import java.util.List;

import org.ffx.fire.models.apparatus.StationApparatus;
import org.springframework.stereotype.Service;

@Service
public interface ApparatusServiceInterface {
	
	public List<StationApparatus> getStationApparatus(Integer stationDesignator);
}
