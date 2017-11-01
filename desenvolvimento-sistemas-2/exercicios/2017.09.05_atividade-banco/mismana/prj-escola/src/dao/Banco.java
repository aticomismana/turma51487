package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Aluno;

public class Banco {
    private Connection conexao = null;
    private Statement declaracao = null;
    private ResultSet resultados = null;
    
    public void conectar() {
        String server = "jdbc:mysql://127.0.0.1:3306/escola";
        String user = "root";
        String senha = "";
        String driver = "com.mysql.jdbc.Driver";
                
        try {
            Class.forName(driver);
            this.conexao = (Connection) DriverManager.getConnection(server, user, senha);
            this.declaracao = (Statement) this.conexao.createStatement();
        } catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
            // sout + tab
        }
    }
    
    public boolean conectado() {
        return (this.conexao != null);
    }
    
    public void insereAlunoBanco(Aluno aluno) {
        try {
            String sql = "INSERT INTO ALUNO (NOME, IDADE) VALUES ('" +
                    aluno.getNome()
                    +"',"
                    + aluno.getIdade()
                    +");";
            this.declaracao.execute(sql);
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    } // end insereAluno
    
    public ArrayList<Aluno> listaAlunos() {
        try{
            String sql = "SELECT * from aluno";
            this.resultados = this.declaracao.executeQuery(sql);
            
            ArrayList<Aluno> alunos = new ArrayList<>();
            while(this.resultados.next()) {
                Aluno a1= new Aluno();
                a1.setId(this.resultados.getInt("id"));
                a1.setNome(this.resultados.getString("nome"));
                a1.setIdade(this.resultados.getInt("idade"));
                alunos.add(a1);
            }
            return alunos;
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        return null;
    }   // end listaAlunos()
    
    public void excluiAlunoBanco(Aluno aluno) {
        try {
            String sql = "DELETE FROM ALUNO WHERE ID=" +
                    aluno.getId()
                    +";";
            this.declaracao.executeUpdate(sql);
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    } // end insereAluno
    
    public void editarAlunoBanco(Aluno aluno) {
        try {
            String sql = "update aluno set ID= where id=" +
                    aluno.getId()
                    +";";
            this.declaracao.executeUpdate(sql);
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    } // end insereAluno
}