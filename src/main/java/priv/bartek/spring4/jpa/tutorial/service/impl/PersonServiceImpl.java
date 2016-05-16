package priv.bartek.spring4.jpa.tutorial.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import priv.bartek.spring4.jpa.tutorial.dao.PersonDAO;
import priv.bartek.spring4.jpa.tutorial.model.Person;
import priv.bartek.spring4.jpa.tutorial.service.PersonService;

@Repository
@Transactional(readOnly = true)
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDAO dao;
	
	@Override
	@Transactional
	public void save(Person p) {
		dao.save(p);

	}

}
