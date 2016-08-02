package priv.bartek.spring4.jpa.tutorial.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

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
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date birthDate;

	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private Address registeredAddress;
	
	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private Address correspondenceAddress;
	
	@Embedded
	private Metadata metadata;
	
	@ElementCollection
	private Set<Item> items;

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

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}
	
	

}
