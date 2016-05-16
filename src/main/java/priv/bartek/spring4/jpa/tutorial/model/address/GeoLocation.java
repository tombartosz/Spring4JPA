package priv.bartek.spring4.jpa.tutorial.model.address;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class GeoLocation implements Serializable {
	
	private double latitude;
	private double longtitude;

	private static final long serialVersionUID = 1L;

	public GeoLocation() {
		super();
	}   
	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}   
	public double getLongtitude() {
		return this.longtitude;
	}

	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}
   
}
