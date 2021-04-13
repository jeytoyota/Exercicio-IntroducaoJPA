package br.com.fiap.tds.dao;

import br.com.fiap.tds.entity.Motorista;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.exception.EntityNotFoundException;

public interface MotoristaDao {
	
	void create(Motorista motorista);
	
	Motorista search(int id) throws EntityNotFoundException;
	
	void delete(int id) throws EntityNotFoundException;
	
	void update(Motorista motorista);
	
	void commit() throws CommitException;

}
