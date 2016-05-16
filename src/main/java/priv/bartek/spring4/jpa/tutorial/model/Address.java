package priv.bartek.spring4.jpa.tutorial.model;

import java.io.Serializable;
import javax.persistence.*;

import priv.bartek.spring4.jpa.tutorial.model.address.GeoLocation;
import priv.bartek.spring4.jpa.tutorial.model.address.PostAddress;
import priv.bartek.spring4.jpa.tutorial.model.common.Metadata;

/**
 * Entity implementation class for Entity: Address
 *
 */
@Entity
@Table(name="address")

public class Address implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Embedded
	private PostAddress postAddress;
	
	@Embedded
	private GeoLocation location;
	
	@Embedded
	private Metadata metadata;
	
	private static final long serialVersionUID = 1L;

	public Address() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
}
