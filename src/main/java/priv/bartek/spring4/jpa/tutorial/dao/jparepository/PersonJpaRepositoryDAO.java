package priv.bartek.spring4.jpa.tutorial.dao.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import priv.bartek.spring4.jpa.tutorial.model.Person;

@Transactional(readOnly = true)
public interface PersonJpaRepositoryDAO extends JpaRepository<Person, Integer> {

}
