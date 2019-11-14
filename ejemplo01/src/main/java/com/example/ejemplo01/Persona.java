/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ejemplo01;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Bryan
 */
@Entity
@Table(name = "persona")

public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "perId")
    private Integer perId;

    @Column(name = "perCedula")
    private int perCedula;


    @Column(name = "perNombres")
    private String perNombres;

    @Column(name = "perApellidoPaterno")
    private String perApellidoPaterno;
    
    @Column(name = "perApellidoMaterno")
    private String perApellidoMaterno;

    @Column(name = "perTelefonoConvencional")
    private int perTelefonoConvencional;

    @Column(name = "perTelefonoCelular")
    private int perTelefonoCelular;

    @Column(name = "perCorreo")
    private String perCorreo;

    @Column(name = "perCiudad")
    private String perCiudad;

    @Column(name = "perEstadoCivil")
    private String perEstadoCivil;

    public Persona() {
    }

    public Persona(Integer perId) {
        this.perId = perId;
    }

    public Persona(Integer perId, int perCedula, String perNombres, String perApellidoPaterno, String perApellidoMaterno, int perTelefonoConvencional, int perTelefonoCelular, String perCorreo, String perCiudad, String perEstadoCivil) {
        this.perId = perId;
        this.perCedula = perCedula;
        this.perNombres = perNombres;
        this.perApellidoPaterno = perApellidoPaterno;
        this.perApellidoMaterno = perApellidoMaterno;
        this.perTelefonoConvencional = perTelefonoConvencional;
        this.perTelefonoCelular = perTelefonoCelular;
        this.perCorreo = perCorreo;
        this.perCiudad = perCiudad;
        this.perEstadoCivil = perEstadoCivil;
    }

    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    public int getPerCedula() {
        return perCedula;
    }

    public void setPerCedula(int perCedula) {
        this.perCedula = perCedula;
    }

    public String getPerNombres() {
        return perNombres;
    }

    public void setPerNombres(String perNombres) {
        this.perNombres = perNombres;
    }

    public String getPerApellidoPaterno() {
        return perApellidoPaterno;
    }

    public void setPerApellidoPaterno(String perApellidoPaterno) {
        this.perApellidoPaterno = perApellidoPaterno;
    }

    public String getPerApellidoMaterno() {
        return perApellidoMaterno;
    }

    public void setPerApellidoMaterno(String perApellidoMaterno) {
        this.perApellidoMaterno = perApellidoMaterno;
    }

    public int getPerTelefonoConvencional() {
        return perTelefonoConvencional;
    }

    public void setPerTelefonoConvencional(int perTelefonoConvencional) {
        this.perTelefonoConvencional = perTelefonoConvencional;
    }

    public int getPerTelefonoCelular() {
        return perTelefonoCelular;
    }

    public void setPerTelefonoCelular(int perTelefonoCelular) {
        this.perTelefonoCelular = perTelefonoCelular;
    }

    public String getPerCorreo() {
        return perCorreo;
    }

    public void setPerCorreo(String perCorreo) {
        this.perCorreo = perCorreo;
    }

    public String getPerCiudad() {
        return perCiudad;
    }

    public void setPerCiudad(String perCiudad) {
        this.perCiudad = perCiudad;
    }

    public String getPerEstadoCivil() {
        return perEstadoCivil;
    }

    public void setPerEstadoCivil(String perEstadoCivil) {
        this.perEstadoCivil = perEstadoCivil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perId != null ? perId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.perId == null && other.perId != null) || (this.perId != null && !this.perId.equals(other.perId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.ejemplo01.Persona[ perId=" + perId + " ]";
    }
    
}
