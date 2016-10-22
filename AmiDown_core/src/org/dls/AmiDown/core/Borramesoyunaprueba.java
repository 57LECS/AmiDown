/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dls.AmiDown.core;

import org.dls.AmiDown.model.Alumno;
import org.dls.AmiDown.model.Persona;
import org.dls.AmiDown.model.Tutor;

/**
 *
 * @author Manolo
 */
public class Borramesoyunaprueba {
      public static void main(String[] args) 
    {
        ControladorAlumno ca = new ControladorAlumno();
        Alumno alumno = new Alumno();
        Persona personaAlumno,personaTutor;
        Tutor t = new Tutor();
        try 
        {
            personaAlumno= new Persona();
            personaAlumno.setNombre("Manuel");
            personaAlumno.setaMaterno("Castro");
            personaAlumno.setaPaterno("Miranda");
            personaAlumno.setCorreo("manolomirandac@hotmail.com");
            personaAlumno.setTelefono("477456546");
            personaAlumno.setFechaNacimiento("06/06/1997");
            
            personaTutor= new Persona();
            personaTutor.setNombre("Manuel Padre");
            personaTutor.setaMaterno("Castro");
            personaTutor.setaPaterno("Miranda");
            personaTutor.setFechaNacimiento("06/06/1997");
            personaTutor.setTelefono("477456546");
            personaTutor.setCorreo("manolomirandacpadre@hotmail.com");
                    
            alumno.setPersona(personaAlumno);
            t.setPersona(personaTutor);
            alumno.setTutor(t);
            ca.insertarAlumno(alumno);
            System.out.println("El usuario se ha ingresado");
        }
        catch(Exception e){
            
        }
    }
}
