/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto126;

/**
 *
 * @author Ignacio Gaynor
 */
public class Socio {
    public String Nombre;
    public int codigo;
    public int edad;  
    public Fecha fechaDeIngreso;

    public Socio(String Nombre, int codigo, int edad, int d, int m, int a) {
        this.Nombre = Nombre;
        this.codigo = codigo;
        this.edad = edad;
        this.fechaDeIngreso = new Fecha (d,m,a);
    }
    //GETTERS

    public String getNombre() {
        return Nombre;
    }

    public int getCodigo() {
        return codigo;
    }
    
}
