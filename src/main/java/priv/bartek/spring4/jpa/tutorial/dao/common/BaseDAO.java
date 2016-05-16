package priv.bartek.spring4.jpa.tutorial.dao.common;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseDAO<E, K extends Serializable> extends JpaRepository<E, K> {

}
