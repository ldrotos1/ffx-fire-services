package org.ffx.fire.models.apparatus;

import java.util.Objects;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class StationApparatus {

	public String unitDesignator;
	public String apparatusType;
	public String apparatusCategory;
	public Boolean isReserved;
	
	@Override
	public String toString() {
		return "StationApparatus [unitDesignator=" + unitDesignator + ", apparatusType=" + apparatusType
				+ ", apparatusCategory=" + apparatusCategory + ", isReserved=" + isReserved + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apparatusCategory, apparatusType, isReserved, unitDesignator);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StationApparatus other = (StationApparatus) obj;
		return Objects.equals(apparatusCategory, other.apparatusCategory)
				&& Objects.equals(apparatusType, other.apparatusType) && Objects.equals(isReserved, other.isReserved)
				&& Objects.equals(unitDesignator, other.unitDesignator);
	}
	
}
