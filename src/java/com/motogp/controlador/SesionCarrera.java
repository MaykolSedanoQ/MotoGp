/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motogp.controlador;

import com.proyectomotogp.modelo.ClasePiloto;
import com.proyectomotogp.modelo.ListaSE;
import com.proyectomotogp.modelo.Nodo;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Maykol Sedano
 */
@Named(value = "SesionCarrera")
@SessionScoped

public class SesionCarrera implements Serializable{
    private ListaSE listascarrera;
    private ClasePiloto piloto;
    private String Inicio="1";
    private Nodo Ayudante;
    
    //constructor

    public SesionCarrera() {
    }
    
    //get y set

    public ListaSE getListascarrera() {
        return listascarrera;
    }

    public void setListascarrera(ListaSE listascarrera) {
        this.listascarrera = listascarrera;
    }

    public ClasePiloto getPiloto() {
        return piloto;
    }

    public void setPiloto(ClasePiloto piloto) {
        this.piloto = piloto;
    }

    public String getInicio() {
        return Inicio;
    }

    public void setInicio(String Inicio) {
        this.Inicio = Inicio;
    }

    public Nodo getAyudante() {
        return Ayudante;
    }

    public void setAyudante(Nodo Ayudante) {
        this.Ayudante = Ayudante;
    }
    
      public void irSiguiente()
    {
        if(Ayudante.getSiguiente()!=null)
        {
            Ayudante = Ayudante.getSiguiente();
            piloto = Ayudante.getDato();
        }
        
    }
    
}
