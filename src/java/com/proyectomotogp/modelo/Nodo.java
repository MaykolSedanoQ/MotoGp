/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectomotogp.modelo;

import java.io.Serializable;

/**
 *
 * @author Maykol Sedano
 */
public class Nodo implements Serializable{
    
    private ClasePiloto Dato;
    private Nodo siguiente;

    public Nodo(ClasePiloto Dato) {
        this.Dato = Dato;
    }

    
    

    public ClasePiloto getDato() {
        return Dato;
    }

    public void setDato(ClasePiloto Dato) {
        this.Dato = Dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
}
