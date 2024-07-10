package org.ffx.fire.apparatus_service.services;

import java.util.List;
import java.util.stream.Collectors;

import org.ffx.fire.apparatus_service.interfaces.ApparatusServiceInterface;
import org.ffx.fire.apparatus_service.mappers.ApparatusMapper;
import org.ffx.fire.apparatus_service.repository.ApparatusRepository;
import org.ffx.fire.models.apparatus.StationApparatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApparatusService implements ApparatusServiceInterface {

	private static final Logger logger = LoggerFactory.getLogger(ApparatusService.class);
	
	@Autowired
	private ApparatusRepository apparatusRepo;
	
	@Override
	public List<StationApparatus> getStationApparatus(Integer stationDesignator) {
		logger.info("Call to apparatus service to get apparatus at station - " + stationDesignator);
		return apparatusRepo.findByStationDesignator(stationDesignator).stream()
				.map(a -> ApparatusMapper.mapStationApparatus(a))
				.collect(Collectors.toList());
	}

}
