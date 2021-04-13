package br.com.fiap.tds.impl;

import javax.persistence.EntityManager;

import br.com.fiap.tds.dao.MotoristaDao;
import br.com.fiap.tds.entity.Motorista;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.exception.EntityNotFoundException;

public class MotoristaDaoImpl implements MotoristaDao{
	
	private EntityManager em;
	

	public MotoristaDaoImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public void create(Motorista motorista) {
		em.persist(motorista);
		
	}

	@Override
	public Motorista search(int id) throws EntityNotFoundException {
		Motorista motorista = em.find(Motorista.class, id);
		if(motorista == null) throw new EntityNotFoundException();	
		return motorista;
		}

	@Override
	public void delete(int id) throws EntityNotFoundException {
		Motorista motorista = search(id);
		em.remove(motorista);
		
	}

	@Override
	public void update(Motorista motorista) {
		em.merge(motorista);
		
	}

	@Override
	public void commit() throws CommitException {
		try {	
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			throw new CommitException();
		}
		
	}
	
	

}
