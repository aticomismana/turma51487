/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.DriverManager;

/**
 *
 * @author fran
 */
public class Conexao {
  
	public Connection getConnection() {
	     try {
	    	Class.forName("com.mysql.jdbc.Driver");
	         return (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/loja", "root", "");
	     } catch (Exception e) {
	         throw new RuntimeException(e);
	     }
	 }   
}

