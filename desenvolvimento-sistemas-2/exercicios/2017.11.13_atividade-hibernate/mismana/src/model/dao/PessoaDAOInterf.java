package model.dao;

import java.util.ArrayList;

import model.Pessoa;

public interface PessoaDAOInterf {
	public void inserePessoa(Pessoa pessoa);
	public void atualizaPessoa(Pessoa pessoa);
	public void excluiPessoa(Pessoa pessoa);
	public ArrayList<Pessoa> getPessoas();
}
