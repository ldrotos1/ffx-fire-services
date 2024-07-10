package org.ffx.fire.api.controller;

import java.util.List;

import org.ffx.fire.models.station.Station;
import org.ffx.fire.models.station.StationListItem;
import org.ffx.fire.station_service.interfaces.StationServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("stations")
@Tag(name="Stations API")
public class StationController {

	private static final Logger logger = LoggerFactory.getLogger(StationController.class);
	
	@Autowired
	private StationServiceInterface stationServiceInterface;
	
	@GetMapping("/list")
	public List<StationListItem> getStations() {
		logger.info("API request to get all stations");
		return stationServiceInterface.getStationList();
	}
	
	@GetMapping("/get/{station-designator}")
	public Station getStation(@PathVariable("station-designator") Integer stationDesignator) {
		logger.info("API request to get station with designator - " + stationDesignator);
		return stationServiceInterface.getStation(stationDesignator);
	}
	
}
