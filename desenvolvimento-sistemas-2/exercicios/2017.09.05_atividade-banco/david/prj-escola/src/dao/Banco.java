package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
        if(this.conexao == null) {
            return false;
        } else {
            return true;
        }
    }
    public void insereAluno(Aluno aluno){
        try{
            String sql = "INSERT INTO ALUNO (NOME, IDADE) VALUES ('"
                    +aluno.getNome()+"', "
                    +aluno.getIdade()+");";
            this.declaracao.executeUpdate(sql);
        }catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
    public ArrayList<Aluno> listaAluno(){
        ArrayList<Aluno> alunos = new ArrayList<Aluno>(); 
        try{
            String sql = "SELECT * FROM ALUNO";
            this.resultados = this.declaracao.executeQuery(sql);
            while(this.resultados.next()){
                Aluno a1 = new Aluno();
                a1.setNome(this.resultados.getString("nome"));
                a1.setIdade(this.resultados.getInt("idade"));
                a1.setId(this.resultados.getInt("id"));
                
                alunos.add(a1);
            }
        }catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        return alunos;
    } 
    public void excluirAluno(Aluno aluno){
        try{
            String sql = "DELETE FROM ALUNO WHERE ID = "+aluno.getId()+";";
            this.declaracao.executeUpdate(sql);
        }catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}
