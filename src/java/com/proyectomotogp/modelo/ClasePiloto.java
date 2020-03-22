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
public class ClasePiloto implements Serializable{

    //Atributos
    public String Nombre;
    public String Nacionalidad;
    public String Moto;
    public int Edad;
    
    //Constructor

    public ClasePiloto(String Nombre, String Nacionalidad, String Moto, int Edad) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.Moto = Moto;
        this.Edad = Edad;
    }
    
    //get y set

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getMoto() {
        return Moto;
    }

    public void setMoto(String Moto) {
        this.Moto = Moto;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    //to string
    
}
