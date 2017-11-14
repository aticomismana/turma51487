package dao;

import java.util.ArrayList;

import javax.persistence.Query;
import javax.persistence.EntityManager;

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
	public ArrayList<Pessoa> getPessoa() {
		Query query = entityManager.createQuery("SELECT * FROM pessoa");
	    return (ArrayList<Pessoa>) query.getResultList();
	}
}
