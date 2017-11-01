/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Controler.ConnectionFactory;
import Model.bean.Auxiliar;
import Model.bean.Comissionado;
import Model.bean.Diretor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author davii
 */
public class DiretorDAO {
    
    private Connection con = null;
    
    public DiretorDAO(){
        con = ConnectionFactory.getConnection();
    }
    
    public boolean createDir(Diretor dir){
        String sql = "INSERT INTO diretor (nome, cpf, salario) VALUES (?,?,?);";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, dir.getNome());
            stmt.setInt(2, dir.getCpf());
            stmt.setDouble(3, dir.getSalario());
            stmt.executeUpdate();
            JOptionPane.showConfirmDialog(null, "Salvo com sucesso!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Erro ao salvar: " + ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean createCom(Comissionado comi){
        String sql = "INSERT INTO diretor (nome, cpf, salario, tempo_empresa) VALUES (?,?,?,?);";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, comi.getNome());
            stmt.setInt(2, comi.getCpf());
            stmt.setDouble(3, comi.getSalario());
            stmt.setInt(4, comi.getTempoEmpresa());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error!"+ ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean createAux(Auxiliar aux){
        String sql = "INSERT INTO diretor (nome, cpf, salario, tempo_contrato) VALUES (?,?,?,?);";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, aux.getNome());
            stmt.setInt(2, aux.getCpf());
            stmt.setDouble(3, aux.getSalario());
            stmt.setInt(4, aux.getTempoContrato());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error!"+ ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Diretor> buscarDir(){
        
        String sql = "SELECT * FROM diretor;";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Diretor> diretores = new ArrayList<Diretor>();
        
        try {
            
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Diretor dir = new Diretor();
                
                dir.setId(rs.getInt("id_diretor"));
                dir.setNome(rs.getString("nome"));
                dir.setCpf( rs.getInt("cpf"));
                dir.setSalario(rs.getDouble("salario"));
                diretores.add(dir);
            }
            
        } catch (SQLException ex) {
            System.err.println("Error!" + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return diretores;
    }
    
    public List<Auxiliar> buscarAux(){
        
        String sql = "SELECT * FROM auxiliar;";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Auxiliar> auxiliares = new ArrayList<Auxiliar>();
        
        try {
            
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Auxiliar aux = new Auxiliar(rs.getString("nome"), rs.getInt("cpf"), rs.getDouble("salario"), rs.getInt("tempo_contrato"));
                auxiliares.add(aux);
            }
            
        } catch (SQLException ex) {
            System.err.println("Error!" + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return auxiliares;
    }
    
    public List<Comissionado> buscarCom(){
        
        String sql = "SELECT * FROM comissionado;";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Comissionado> comissionados = new ArrayList<Comissionado>();
        
        try {
            
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Comissionado com = new Comissionado(rs.getString("nome"), rs.getInt("cpf"), rs.getDouble("salario"), rs.getInt("teempo_empresa"));
                comissionados.add(com);
            }
            
        } catch (SQLException ex) {
            System.err.println("Error!" + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return comissionados;
    }
    
    public boolean updateDir(Diretor dir){
        
        String sql = "UPDATE diretor SET nome = ?, cpf = ?, salario = ? WHERE id_diretor = ?; ";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, dir.getNome());
            stmt.setInt(2, dir.getCpf());
            stmt.setDouble(3, dir.getSalario());
            stmt.setInt(4, dir.getId());
            stmt.executeUpdate();
            JOptionPane.showConfirmDialog(null, "Atualizado com sucesso!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error ao atualizar: " + ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean calcularBonificacaoDir(Diretor dir){
        
        String sql = "SELECT salario = ? FROM diretor WHERE id_diretor = ?; ";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setDouble(1, dir.getSalario());
            stmt.setInt(2, dir.getId());
            stmt.executeQuery();
            DecimalFormat decimal = new DecimalFormat("0.00");
            String valorFormatado = decimal.format(dir.calcularBonificacao());
            JOptionPane.showConfirmDialog(null, "A bonificação do Diretor: "+ dir.getNome()+ " é de -> " + valorFormatado + "!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error ao calcular: " + ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean calcularComissaoDir(Diretor dir){
        
        String sql = "SELECT salario = ? FROM diretor WHERE id_diretor = ?; ";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setDouble(1, dir.getSalario());
            stmt.setInt(2, dir.getId());
            stmt.executeQuery();
            
            double venda = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da venda."));
            
            DecimalFormat decimal = new DecimalFormat("0.00");
            String valorFormatado = decimal.format(dir.calcularComissao(venda));
            
            JOptionPane.showConfirmDialog(null, "A comissão do Diretor: "+ dir.getNome()+ " é de -> " + valorFormatado + "!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error ao calcular: " + ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public boolean updateCom(Comissionado com){
        
        String sql = "UPDATE diretor SET nome = ?, cpf = ?, salario = ?, tempo_empresa = ? WHERE id_diretor = ?; ";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, com.getNome());
            stmt.setInt(2, com.getCpf());
            stmt.setDouble(3, com.getSalario());
            stmt.setInt(4, com.getTempoEmpresa());
            stmt.setInt(5, com.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error!"+ ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean updateAux(Auxiliar aux){
        
        String sql = "UPDATE diretor SET nome = ?, cpf = ?, salario = ?, tempo_contrato = ? WHERE id_diretor = ?; ";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, aux.getNome());
            stmt.setInt(2, aux.getCpf());
            stmt.setDouble(3, aux.getSalario());
            stmt.setInt(4, aux.getTempoContrato());
            stmt.setInt(5, aux.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error!"+ ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean deleteDir(Diretor dir){
        
        String sql = "DELETE FROM diretor WHERE id_diretor = ?;";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt (1, dir.getId());
            stmt.executeUpdate();
            JOptionPane.showConfirmDialog(null, "Deletado com sucesso!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error ao deletar!" + ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean deleteCom(Comissionado com){
        
        String sql = "DELETE FROM comissionado WHERE id_comissionado = ?;";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt (1, com.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error!"+ ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean deleteAux(Auxiliar aux){
        
        String sql = "DELETE FROM auxiliar WHERE id_auxiliar = ?;";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt (1, aux.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error!"+ ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
