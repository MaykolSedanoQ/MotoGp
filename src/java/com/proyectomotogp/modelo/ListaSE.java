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
public class ListaSE implements Serializable{
    
    private Nodo Cabeza;

    //constructor vacio
    public ListaSE() {
    }
    
    //get y set

    public Nodo getCabeza() {
        return Cabeza;
    }

    public void setCabeza(Nodo Cabeza) {
        this.Cabeza = Cabeza;
    }
    
    //metodos
    
    public void adicionarNodoAlInicio(ClasePiloto infante)
    {
        if(Cabeza ==null)
        {
            Cabeza = new Nodo(infante);
        }
        else
        {
            Nodo temp= new Nodo(infante);
            temp.setSiguiente(Cabeza);
            Cabeza= temp;
        }
    }
    
       public void adicionarNodo(ClasePiloto piloto)
    {
        if(Cabeza ==null)
        {
            Cabeza = new Nodo(piloto);
        }
        else
        {
            //Lamo a mi ayudante
            Nodo temp= Cabeza;
            while(temp.getSiguiente()!=null) //Mientras que en siguiente exista algo
            {
                temp= temp.getSiguiente();
            }
            //temp va estar ubicado en el ultimo nodo
            temp.setSiguiente(new Nodo(piloto));
        }
        
    }
    
}
