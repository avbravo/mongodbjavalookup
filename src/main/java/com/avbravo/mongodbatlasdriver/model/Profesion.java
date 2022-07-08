/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.mongodbatlasdriver.model;

import com.avbravo.jmoordb.core.annotation.Column;
import com.avbravo.jmoordb.core.annotation.Entity;
import com.avbravo.jmoordb.core.annotation.Id;
import com.avbravo.jmoordb.core.annotation.Referenced;
import java.util.List;

/**
 *
 * @author avbravo
 */
@Entity
public class Profesion {

    @Id
    private String idprofesion;
    @Column
    private String profesion;
    @Referenced(from = "grupoprofesion", localField = "grupoprofesion.idgrupoprofesion", foreignField = "idgrupoprofesion", as = "grupoprofesion")
    private Grupoprofesion grupoprofesion;

    public Profesion() {
    }

    public String getIdprofesion() {
        return idprofesion;
    }

    public void setIdprofesion(String idprofesion) {
        this.idprofesion = idprofesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public Grupoprofesion getGrupoprofesion() {
        return grupoprofesion;
    }

    public void setGrupoprofesion(Grupoprofesion grupoprofesion) {
        this.grupoprofesion = grupoprofesion;
    }

    
}
