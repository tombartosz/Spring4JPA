package priv.bartek.spring4.jpa.tutorial.dao.common.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import priv.bartek.spring4.jpa.tutorial.dao.common.BaseDAO;

public abstract class BaseDAOImpl<E, K extends Serializable> implements BaseDAO<E, K> {

	@Autowired
	private JpaRepository<E, K> repo;
	
	@Override
	public List<E> findAll() {
		return repo.findAll();
	}

	@Override
	public List<E> findAll(Sort sort) {
		return repo.findAll(sort);
	}

	@Override
	public List<E> findAll(Iterable<K> ids) {
		return repo.findAll(ids);
	}

	@Override
	public <S extends E> List<S> save(Iterable<S> entities) {
		return repo.save(entities);
	}

	@Override
	public void flush() {
		repo.flush();		
	}

	@Override
	public <S extends E> S saveAndFlush(S entity) {
		return repo.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<E> entities) {
		repo.deleteInBatch(entities);		
	}

	@Override
	public void deleteAllInBatch() {
		repo.deleteAllInBatch();
	}

	@Override
	public E getOne(K id) {
		return repo.getOne(id);
	}

	@Override
	public <S extends E> List<S> findAll(Example<S> example) {
		return repo.findAll(example);
	}

	@Override
	public <S extends E> List<S> findAll(Example<S> example, Sort sort) {
		return repo.findAll(example, sort);
	}

	@Override
	public Page<E> findAll(Pageable arg0) {
		return repo.findAll(arg0);
	}

	@Override
	public long count() {
		return repo.count();
	}

	@Override
	public void delete(K arg0) {
		repo.delete(arg0);
	}

	@Override
	public void delete(E arg0) {
		repo.delete(arg0);		
	}

	@Override
	public void delete(Iterable<? extends E> arg0) {
		repo.delete(arg0);
	}

	@Override
	public void deleteAll() {
		repo.deleteAll();
	}

	@Override
	public boolean exists(K arg0) {
		return repo.exists(arg0);
	}

	@Override
	public E findOne(K arg0) {
		return repo.findOne(arg0);
	}

	@Override
	public <S extends E> S save(S arg0) {
		return repo.save(arg0);
	}

	@Override
	public <S extends E> long count(Example<S> arg0) {
		return repo.count(arg0);
	}

	@Override
	public <S extends E> boolean exists(Example<S> arg0) {
		return repo.exists(arg0);
	}

	@Override
	public <S extends E> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		return repo.findAll(arg0, arg1);
	}

	@Override
	public <S extends E> S findOne(Example<S> arg0) {
		return repo.findOne(arg0);
	}

}
