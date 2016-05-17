package priv.bartek.spring4.jpa.tutorial.service;

import java.util.List;

import priv.bartek.spring4.jpa.tutorial.model.Person;

public interface PersonService {

	public void save(Person p);
	
	public List<Person> findAll();
}
