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
public class ClaseEquipo {
    
    //Atributos
    private int NumeroDeIntegrantes;
    public String NombreDelEquipo;
    
    //Construcotor

    public int getNumeroDeIntegrantes() {
        return NumeroDeIntegrantes;
    }

    public void setNumeroDeIntegrantes(int NumeroDeIntegrantes) {
        this.NumeroDeIntegrantes = NumeroDeIntegrantes;
    }

    public String getNombreDelEquipo() {
        return NombreDelEquipo;
    }

    public void setNombreDelEquipo(String NombreDelEquipo) {
        this.NombreDelEquipo = NombreDelEquipo;
    }
    
    //to string

    @Override
    public String toString() {
        return "ClaseEquipo{" + "NumeroDeIntegrantes=" + NumeroDeIntegrantes + ", NombreDelEquipo=" + NombreDelEquipo + '}';
    }
    
}
