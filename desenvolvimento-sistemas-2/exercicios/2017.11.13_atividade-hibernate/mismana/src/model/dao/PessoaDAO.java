package model.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Pessoa;

public class PessoaDAO implements PessoaDAOInterf {

	EntityManager entityManager;
	
	@Override
	public void inserePessoa(Pessoa pessoa) {
		entityManager.persist(pessoa);
	}

	@Override
	public void atualizaPessoa(Pessoa pessoa) {
		entityManager.merge(pessoa);
	}

	@Override
	public void excluiPessoa(Pessoa pessoa) {
		entityManager.remove(pessoa);
	}

	@Override
	public ArrayList<Pessoa> getPessoas() {
		Query query = (Query) entityManager.createQuery("from Pessoa");
		return (ArrayList<Pessoa>) query.getResultList();
	}

}
