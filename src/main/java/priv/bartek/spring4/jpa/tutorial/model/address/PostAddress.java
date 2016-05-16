package priv.bartek.spring4.jpa.tutorial.model.address;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Embeddable
public class PostAddress implements Serializable {

	private String country;
	private String postCity;
	private String city;
	private String street;
	private String propertyNumber;
	private String premiseNumber;
	private String postCode;

	private static final long serialVersionUID = 1L;

	public PostAddress() {
		super();
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostCity() {
		return this.postCity;
	}

	public void setPostCity(String postCity) {
		this.postCity = postCity;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPropertyNumber() {
		return this.propertyNumber;
	}

	public void setPropertyNumber(String propertyNumber) {
		this.propertyNumber = propertyNumber;
	}

	public String getPremiseNumber() {
		return this.premiseNumber;
	}

	public void setPremiseNumber(String premiseNumber) {
		this.premiseNumber = premiseNumber;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

}
