/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dls.AmiDown.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Manolo
 */
public class ConexionSQLServer {
    Connection conn;
    String userName;
    String password;
    String host;
    String nombreBD;
    String url;
    String puerto;
    
    public ConexionSQLServer() 
    {
        try {
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }          
    }
    
    
    
        /**
         * Este método para abir y devolver una conexión con SQL server
         */
    
    public Connection abrir() throws Exception{
     
        userName = "sa";
        password ="12341234";
        puerto = "1434";
        host = "localhost";
        nombreBD = "AmiDown";
        url = "jdbc:sqlserver://"+host+":"+puerto+";databaseName="+nombreBD;
        conn = DriverManager.getConnection(url, userName, password);
        return conn;
    }
    
    /**
     * este metodo sirve para cerrar la conexión
     */
    
    public void cerrar()
    {
        //Validamos que existe una conexión
        try {
            conn.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
