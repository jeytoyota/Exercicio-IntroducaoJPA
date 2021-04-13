package br.com.fiap.tds.dao;

import br.com.fiap.tds.entity.Veiculo;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.exception.EntityNotFoundException;

public interface VeiculoDao {
	
	void create(Veiculo veiculo);
	
	Veiculo search(int id) throws EntityNotFoundException;
	
	void update(Veiculo veiculo);
	
	void delete(int id) throws EntityNotFoundException;
	
	void commit() throws CommitException;

}
