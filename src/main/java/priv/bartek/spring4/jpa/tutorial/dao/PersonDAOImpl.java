package priv.bartek.spring4.jpa.tutorial.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import priv.bartek.spring4.jpa.tutorial.dao.common.impl.BaseDAOImpl;
import priv.bartek.spring4.jpa.tutorial.model.Person;

@Repository
@Transactional(readOnly = true)
public class PersonDAOImpl extends BaseDAOImpl<Person, Integer> implements PersonDAO {

}
