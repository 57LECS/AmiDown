/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dls.AmiDown.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import org.dls.AmiDown.db.ConexionSQLServer;
import org.dls.AmiDown.model.Alumno;

/**
 *
 * @author Manolo
 */
public class ControladorAlumno {
    
    public void insertarAlumno(Alumno al) throws Exception
    {
        String query = "EXEC dbo.InsertarAlumno ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?";
        //String query ="EXEC dbo.InsertarAlumno @Matricula = "+al.getMatricula()+",@FechaIngreso ="+al.getFechaIngreso()",@Generacion ="+al.getGeneracion()+",@Estatus"+al.getStatus()+",@Nombre ="+al.getPersona().getNombre()+",@ApellidoPaterno="+al.getPersona().;
        ConexionSQLServer connSQLServer = new ConexionSQLServer();
        Connection conn = connSQLServer.abrir();
        PreparedStatement pstmt = conn.prepareStatement(query);
        
        //Llenamos los parámetro de la consulta 
        //Parametros del alumno
        pstmt.setString(1, al.getPersona().getNombre());
        pstmt.setString(2, al.getPersona().getaPaterno());
        pstmt.setString(3, al.getPersona().getaPaterno());
        pstmt.setString(4, al.getPersona().getCorreo());
        pstmt.setString(5, al.getPersona().getTelefono());
        pstmt.setString(6, al.getPersona().getFechaNacimiento());
        //Parametros del tutor
        pstmt.setString(7, al.getTutor().getPersona().getNombre());
        pstmt.setString(8, al.getTutor().getPersona().getaPaterno());
        pstmt.setString(9, al.getTutor().getPersona().getaMaterno());
        pstmt.setString(10, al.getTutor().getPersona().getFechaNacimiento());  
        pstmt.setString(11, al.getTutor().getPersona().getTelefono());  
        pstmt.setString(12, al.getTutor().getPersona().getCorreo());        
                
        pstmt.executeUpdate(); 
        
        pstmt.close();
        
        connSQLServer.cerrar();
    }
    
    public void modificarAlumno(Alumno al) throws Exception{
       /* String query = "EXEC dbo.InsertarAlumno ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?";
        //String query ="EXEC dbo.InsertarAlumno @Matricula = "+al.getMatricula()+",@FechaIngreso ="+al.getFechaIngreso()",@Generacion ="+al.getGeneracion()+",@Estatus"+al.getStatus()+",@Nombre ="+al.getPersona().getNombre()+",@ApellidoPaterno="+al.getPersona().;
        ConexionSQLServer connSQLServer = new ConexionSQLServer();
        Connection conn = connSQLServer.abrir();
        PreparedStatement pstmt = conn.prepareStatement(query);
        
        //Llenamos los parámetro de la consulta 
        //Parametros del alumno
        pstmt.setString(1, al.getPersona().getNombre());
        pstmt.setString(2, al.getPersona().getaPaterno());
        pstmt.setString(3, al.getPersona().getaPaterno());
        pstmt.setString(4, al.getPersona().getCorreo());
        pstmt.setString(5, al.getPersona().getTelefono());
        pstmt.setString(6, al.getPersona().getFechaNacimiento());
        //Parametros del tutor
        pstmt.setString(7, al.getTutor().getPersona().getNombre());
        pstmt.setString(8, al.getTutor().getPersona().getaPaterno());
        pstmt.setString(9, al.getTutor().getPersona().getaMaterno());
        pstmt.setString(10, al.getTutor().getPersona().getFechaNacimiento());  
        pstmt.setString(11, al.getTutor().getPersona().getTelefono());  
        pstmt.setString(12, al.getTutor().getPersona().getCorreo());        
                
        pstmt.executeUpdate(); 
        
        pstmt.close();
        connSQLServer.cerrar();*/
    }
    
}
