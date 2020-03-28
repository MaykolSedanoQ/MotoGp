/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectomotogp.modelo;

/**
 *
 * @author Maykol Sedano
 */
public class ClaseConfiguracionCarrera {
    
    //atributos
    public int NumeroVueltas;
    public int Corredores;
    
    //Constructor

    public ClaseConfiguracionCarrera(int NumeroVueltas, int Corredores) {
        this.NumeroVueltas = NumeroVueltas;
        this.Corredores = Corredores;
    }
    
    //get y set

    public int getNumeroVueltas() {
        return NumeroVueltas;
    }

    public void setNumeroVueltas(int NumeroVueltas) {
        this.NumeroVueltas = NumeroVueltas;
    }

    public int getCorredores() {
        return Corredores;
    }

    public void setCorredores(int Corredores) {
        this.Corredores = Corredores;
    }
    
    //to string

    @Override
    public String toString() {
        return "ClaseConfiguracionCarrera{" + "NumeroVueltas=" + NumeroVueltas + ", Corredores=" + Corredores + '}';
    }
    
    
}
