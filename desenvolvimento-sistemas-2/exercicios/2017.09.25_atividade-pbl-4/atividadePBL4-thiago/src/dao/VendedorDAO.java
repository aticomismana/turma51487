/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author fran
 */
public class VendedorDAO {
    Conexao conexao;
    
    public VendedorDAO(){
        conexao = new Conexao();  
    }
    
    public void insereVendedor(String nome, String salario, String mesesContratado, String cpf ){
        try{
            String sql= "INSERT INTO vendedor (nome, salario, mesesContratado, cpf) VALUES (?,?,?,?);";
            Connection con = conexao.getConnection();
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, salario);
            stmt.setString(3, mesesContratado);
            stmt.setString(4, cpf);
            stmt.execute();
            stmt.close();
            con.close();
            System.out.println("here");
                       
        }catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
    
    public ArrayList<Vendedor> listaVendedor(){
        ArrayList listaVendedores = new ArrayList();
        Vendedor vendedor;
        try{
            Connection con = conexao.getConnection();
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("Select * from vendedor");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                vendedor = new Vendedor();
                vendedor.setId(rs.getInt("id"));
                vendedor.setNome(rs.getString("nome"));
                vendedor.setCpf(rs.getString("cpf"));
                vendedor.setSalario(rs.getDouble("salario"));
                vendedor.setMesesContrato(rs.getInt("mesesContratado"));
                listaVendedores.add(vendedor);
            }
            
        }catch(Exception e){
            System.out.println("Erro: "+ e.getMessage());
        } return listaVendedores;
    }
    
    public void editarPessoa(int id, String nome, String nick){
        try{
            String sql = "update funcionario set nome=?, nick=? where id=?";
            Connection conexaobd = conexao.getConnection();
            PreparedStatement ps = (PreparedStatement) conexaobd.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, nick);
            ps.setInt(3, id);
            ps.executeUpdate();
        } catch (Exception e){
            System.out.println("Erro:"+e.getMessage());
            
        }
    }
    
    public void eliminarVendedor(int id){
        try{
            String sql = "DELETE FROM vendedor WHERE id=?";
            Connection conexaobd = conexao.getConnection();
            PreparedStatement ps = (PreparedStatement) conexaobd.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println("Erro:"+e.getMessage());
        }
    }

}
