package org.ffx.fire.station_service.services;

import java.util.List;
import java.util.stream.Collectors;

import org.ffx.fire.apparatus_service.interfaces.ApparatusServiceInterface;
import org.ffx.fire.models.station.Station;
import org.ffx.fire.models.station.StationListItem;
import org.ffx.fire.station_service.repository.StationListItemRepository;
import org.ffx.fire.station_service.repository.StationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ffx.fire.station_service.entity.StationEntity;
import org.ffx.fire.station_service.interfaces.StationServiceInterface;
import org.ffx.fire.station_service.mappers.StationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StationService implements StationServiceInterface {
	
	private static final Logger logger = LoggerFactory.getLogger(StationService.class);
	
	@Autowired
	private StationListItemRepository stationListItemRepo;
	
	@Autowired
	private StationRepository stationRepo;
	
	@Autowired
	private ApparatusServiceInterface apparatusService;
	
	@Override
	public List<StationListItem> getStationList() {
		logger.info("Call to station service to get all stations");
		return stationListItemRepo.findAll().stream()
				.map(e -> StationMapper.mapStationListItem(e))
				.collect(Collectors.toList());
	}

	@Override
	public Station getStation(Integer stationDesignator) {
		logger.info("Call to station service to get station with designator - " + stationDesignator);
		StationEntity stationEntity = stationRepo.findById(stationDesignator).orElseThrow();
		Station station = StationMapper.mapStation(stationEntity);
		station.setApparatus(apparatusService.getStationApparatus(stationDesignator));
		return station;
	}
	
	
}
