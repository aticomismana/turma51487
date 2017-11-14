package model.dao;

import java.util.ArrayList;

import model.Pessoa;

public interface PessoaDAOInterface {
	public void inserePessoa(Pessoa pessoa);
	public void atualizaPessoa(Pessoa pessoa);
	public void excluirPEssoa(Pessoa pessoa);
	public ArrayList<Pessoa> getPessoas();
}
