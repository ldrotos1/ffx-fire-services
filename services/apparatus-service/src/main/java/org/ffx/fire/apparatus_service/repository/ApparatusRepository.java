package org.ffx.fire.apparatus_service.repository;

import java.util.List;

import org.ffx.fire.apparatus_service.entity.ApparatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ApparatusRepository extends JpaRepository<ApparatusEntity, Integer> {

	@Query("select a from ApparatusEntity a where a.stationDesignator = :station_desig")
	List<ApparatusEntity> findByStationDesignator(@Param("station_desig") Integer stationDesignator);
}
