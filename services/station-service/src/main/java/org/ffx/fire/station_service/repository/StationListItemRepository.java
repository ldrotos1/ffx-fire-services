package org.ffx.fire.station_service.repository;

import org.ffx.fire.station_service.entity.StationListItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationListItemRepository extends JpaRepository<StationListItemEntity, Integer> {

}
