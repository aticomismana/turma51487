package model.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Pessoa;

public class PessoaDAO implements PessoaDAOInterface{

	EntityManager entityManager;
	@Override
	public void inserePessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		entityManager.persist(pessoa);
	}

	@Override
	public void atualizaPessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		entityManager.merge(pessoa);
	}

	@Override
	public void excluirPEssoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		entityManager.remove(pessoa);
	}

	@Override
	public ArrayList<Pessoa> getPessoas() {
		// TODO Auto-generated method stub
		Query query = (Query) entityManager.createQuery("from Pessoa");
		return (ArrayList<Pessoa>) query.getResultList();
	}

}
