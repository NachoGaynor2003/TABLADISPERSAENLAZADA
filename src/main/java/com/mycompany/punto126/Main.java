/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto126;

/**
 *
 * @author Ignacio Gaynor
 */
public class Main {

    public static void main(String[] args) {
       
        tablaDisperzaenlazada nuevo = new tablaDisperzaenlazada();
        Socio socio1 = new Socio("Walter", 102 , 31,28,05,2020);
        nuevo.Insertar(socio1);
        System.out.println();
        System.out.println("SOCIO:" + socio1.getCodigo() + ":" + nuevo.buscar(socio1.getCodigo()).getSocio().getNombre());
        System.out.println();
        
        try{
            System.out.println("SOCIO " + "1000" + ":" + nuevo.buscar(1000).getSocio().getNombre() );
        }
        catch(NullPointerException e){
            System.out.println("SOCIO " + 1000 + ": ----- NO FUE ENCONTRADO EL SOCIO");
        
        System.out.println();        
        System.out.println();
    }
    finally{
            System.out.println("Muchas gracias por ingresar al codigo, que tenga un excelente dia");
}
}
}