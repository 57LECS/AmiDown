/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dls.AmiDown.model;

/**
 *
 * @author Manolo
 */
public class Tutor {
    public long idTutor;
    public Persona persona;
    
    public long getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(long idTutor) {
        this.idTutor = idTutor;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
