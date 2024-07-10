package org.ffx.fire.models.station;

import java.util.Objects;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class StationListItem {
	private Integer stationDesignator;
	private int stationNumber;
	private String stationName;
	private int battalion;
	private int division;
	
	@Override
	public int hashCode() {
		return Objects.hash(battalion, division, stationDesignator, stationName, stationNumber);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StationListItem other = (StationListItem) obj;
		return battalion == other.battalion && division == other.division
				&& Objects.equals(stationDesignator, other.stationDesignator)
				&& Objects.equals(stationName, other.stationName) && stationNumber == other.stationNumber;
	}
	
	@Override
	public String toString() {
		return "StationListItem [stationDesignator=" + stationDesignator + ", stationNumber=" + stationNumber
				+ ", stationName=" + stationName + ", battalion=" + battalion + ", division=" + division + "]";
	}
	
}
