package priv.bartek.spring4.jpa.tutorial.dao;

import org.springframework.transaction.annotation.Transactional;

import priv.bartek.spring4.jpa.tutorial.dao.common.BaseDAO;
import priv.bartek.spring4.jpa.tutorial.model.Person;

@Transactional(readOnly = true)
public interface PersonDAO extends BaseDAO<Person, Integer> {

}
