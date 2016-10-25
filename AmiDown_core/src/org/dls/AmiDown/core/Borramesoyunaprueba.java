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
            //personaAlumno.setIdPersona(12);            
            personaAlumno.setNombre("a2");
            personaAlumno.setaPaterno("Mirandsssc");
            personaAlumno.setaMaterno("Castrsssssa");     
            personaAlumno.setFechaNacimiento("12/06/1997");
            personaAlumno.setTelefono("477456546a");
            personaAlumno.setCorreo("manolomirandaasc@hotmail.com");
            
            personaTutor= new Persona();
            //personaTutor.setIdPersona(13);
            personaTutor.setNombre("Manuel Padre a1");            
            personaTutor.setaPaterno("Miranda");
            personaTutor.setaMaterno("Castro");
            personaTutor.setFechaNacimiento("11/06/1967");
            personaTutor.setTelefono("477456546");
            personaTutor.setCorreo("manolomirandacpadre@hotmail.com");
                    
            alumno.setPersona(personaAlumno);
            t.setPersona(personaTutor);
            alumno.setTutor(t);
            ca.insertarAlumno(alumno);
            //ca.modificarAlumno(alumno);
            //ca.eliminarAlumno(alumno);
            System.out.println("El usuario se ha ingresado");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
