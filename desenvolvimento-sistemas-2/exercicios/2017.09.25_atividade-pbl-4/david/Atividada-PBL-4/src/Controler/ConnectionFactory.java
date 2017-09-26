/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author davii
 */
public class ConnectionFactory {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/loja_calcados";
    private static final String USER = "root";
    private static final String PASS = "danocritico07.";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);   
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Error na conexão.", ex);
        }
    }
    
    public static void closeConnection(Connection con){
        try{
            if(con!=null){
                con.close();
            }
        } catch (SQLException ex) {
            System.err.println("Error!"+ ex);
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        closeConnection(con);
        try{
            if(stmt!=null){
                stmt.close();
            }
        } catch (SQLException ex) {
            System.err.println("Error!"+ ex);
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        closeConnection(con, stmt);
        try{
            if(rs!=null){
                rs.close();
            }
        } catch (SQLException ex) {
            System.err.println("Error!"+ ex);
        }
    }
}
    