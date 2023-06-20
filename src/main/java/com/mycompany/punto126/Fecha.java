/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto126;

/**
 *
 * @author Ignacio Gaynor
 */
public class Fecha {
    public int dia;
    public int mes;
    public int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    
    @Override
     public String toString(){
         return " " + dia + "-" + mes + "-" + año;
 
     }
}
    
    
    
    

