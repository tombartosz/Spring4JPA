package priv.bartek.spring4.jpa.tutorial.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

import priv.bartek.spring4.jpa.tutorial.model.common.Metadata;

/**
 * Entity implementation class for Entity: Person
 *
 */
@Entity
@Table(name = "person")
public class Person implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String secondName;
	private String otherNames;
	private String surname;
	private Date birthDate;

	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private Address registeredAddress;
	
	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private Address correspondenceAddress;
	
	@Embedded
	private Metadata metadata;

	private static final long serialVersionUID = 1L;

	public Person() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return this.secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getOtherNames() {
		return this.otherNames;
	}

	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Address getRegisteredAddress() {
		return registeredAddress;
	}

	public void setRegisteredAddress(Address registeredAddress) {
		this.registeredAddress = registeredAddress;
	}

	public Address getCorrespondenceAddress() {
		return correspondenceAddress;
	}

	public void setCorrespondenceAddress(Address correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}

}
