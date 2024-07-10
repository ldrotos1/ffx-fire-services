package org.ffx.fire.models.station;

import java.util.List;
import java.util.Objects;

import org.ffx.fire.models.apparatus.StationApparatus;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Station {
	private Integer stationDesignator;
	private int stationNumber;
	private String stationName;
	private String departmentName;
	private int battalion;
	private int division;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private double latitude;
	private double longitude;
	private List<StationApparatus> apparatus;
	
	@Override
	public int hashCode() {
		return Objects.hash(address, apparatus, battalion, city, departmentName, division, latitude, longitude, state,
				stationDesignator, stationName, stationNumber, zipCode);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Station other = (Station) obj;
		return Objects.equals(address, other.address) && Objects.equals(apparatus, other.apparatus)
				&& battalion == other.battalion && Objects.equals(city, other.city)
				&& Objects.equals(departmentName, other.departmentName) && division == other.division
				&& Double.doubleToLongBits(latitude) == Double.doubleToLongBits(other.latitude)
				&& Double.doubleToLongBits(longitude) == Double.doubleToLongBits(other.longitude)
				&& Objects.equals(state, other.state) && Objects.equals(stationDesignator, other.stationDesignator)
				&& Objects.equals(stationName, other.stationName) && stationNumber == other.stationNumber
				&& Objects.equals(zipCode, other.zipCode);
	}
	
	@Override
	public String toString() {
		return "Station [stationDesignator=" + stationDesignator + ", stationNumber=" + stationNumber + ", stationName="
				+ stationName + ", departmentName=" + departmentName + ", battalion=" + battalion + ", division="
				+ division + ", address=" + address + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", apparatus=" + apparatus + "]";
	}
	
}
