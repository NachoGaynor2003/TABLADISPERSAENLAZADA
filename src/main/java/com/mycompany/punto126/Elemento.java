/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto126;

/**
 *
 * @author Ignacio Gaynor
 */
public class Elemento {
    
    public Socio socio;
    public Elemento sgte;
    
    
    
    public Elemento (Socio Alfa){
    socio = Alfa;
    sgte = null; 
    }

    public Socio getSocio() {
        return socio;
    }
    
     
    
}
