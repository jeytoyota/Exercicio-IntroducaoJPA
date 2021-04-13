package br.com.fiap.tds.impl;

import javax.persistence.EntityManager;

import br.com.fiap.tds.dao.VeiculoDao;
import br.com.fiap.tds.entity.Veiculo;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.exception.EntityNotFoundException;

public class VeiculoDaoImpl implements VeiculoDao{
	
	private EntityManager em;

	public VeiculoDaoImpl(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public void create(Veiculo veiculo) {
		em.persist(veiculo);
	}
	
	@Override
	public Veiculo search(int id) throws EntityNotFoundException {
		Veiculo veiculo = em.find(Veiculo.class, id);
		if(veiculo == null)
			throw new EntityNotFoundException();
		return veiculo; 
	}
	
	@Override
	public void update(Veiculo veiculo) {
		em.merge(veiculo);
	}
	
	@Override
	public void delete(int id) throws EntityNotFoundException {
		Veiculo veiculo = search(id);
		em.remove(veiculo);
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
