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
            System.err.println("Não Conectado!");
        }
        
        Aluno aluno = new Aluno();
        aluno.setNome("Mismana");
        aluno.setIdade(28);
        b1.insereAlunoBanco(aluno);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Vivian");
        aluno1.setIdade(4);
        b1.insereAlunoBanco(aluno1);
        
        ArrayList<Aluno> alunos = b1.listaAlunos();
        
        for(Aluno a : alunos) {
            System.out.println("Id: " + a.getId());
            System.out.println("Nome: " + a.getNome());
            System.out.println("Idade: " + a.getIdade());
        }

        b1.excluiAlunoBanco(alunos.get(0));
        
        for(Aluno a : alunos) {
            System.out.println("Id: " + a.getId());
            System.out.println("Nome: " + a.getNome());
            System.out.println("Idade: " + a.getIdade());
        }
        
//        String sql = "INSERT INTO ALUNO (NOME, IDADE) VALUES ('" +
//                    aluno.getNome()
//                    +"',"
//                    + aluno.getIdade()
//                    +");";
//        System.out.println(sql);
    }   // end main
}