/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto126;

/**
 *
 * @author Ignacio Gaynor
 */
public class tablaDisperzaenlazada {
    
     int M =97; //tamanio de la tabla
     Elemento [] Tabla;
     double R = 0.618034;
    int numElementos;   
    //CONSTRUCTOR
        public tablaDisperzaenlazada(){
            this.Tabla = new Elemento [this.M];
            
            for(int i = 0 ; i < this.M ; i++){
                this.Tabla[i] = null;
            }
                this.numElementos=0;
        }
        
        
        int dispersion(long P){
            double K;
            int V;
            K = R * P - Math.floor(R * P);
            V = (int) (M * K);
                return V;
        }
        
        
        //AHORA VAMOS A INSERTAR
        public void Insertar(Socio Alfa){
            
            int posicion = this.dispersion(Alfa.getCodigo());
            Elemento nuevo = new Elemento(Alfa);
            nuevo.sgte = this.Tabla[posicion];
            this.Tabla[posicion] = nuevo;
            this.numElementos++;
        }
        
       public Elemento buscar(int codigo) {
    Elemento p = null;
    int posicion = dispersion(codigo);
    
    if (this.Tabla[posicion] != null) {
      p = this.Tabla[posicion];
      while ((p.sgte != null) && p.socio.codigo != codigo){
        p = p.sgte;
      }
      
      if (p.socio.codigo != codigo) {
        p = null;
      }
      
    }
    return p;
  }
        
}
