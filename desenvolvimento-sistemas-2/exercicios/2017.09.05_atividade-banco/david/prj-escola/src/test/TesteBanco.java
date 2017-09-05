package test;

import dao.Banco;
import java.util.ArrayList;
import model.Aluno;

public class TesteBanco {
    public static void main(String [] args) {
        Banco b1 = new Banco();
        b1.conectar();
        boolean conectado = b1.conectado();
        
        if(conectado) {
            System.out.println("Conectado!");
        } else {
            System.err.println("Conectado!");
        }
        Aluno aluno = new Aluno();
        aluno.setNome("David");
        aluno.setIdade(19);
        b1.insereAluno(aluno);
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        alunos = b1.listaAluno();
        for(int i = 0; i <alunos.size(); i ++){
            System.out.println("Id: "+alunos.get(i).getId());
            System.out.println("Nome: "+alunos.get(i).getNome());
            System.out.println("Idade: "+alunos.get(i).getIdade());
        }
        b1.excluirAluno(alunos.get(0));
    }
}
