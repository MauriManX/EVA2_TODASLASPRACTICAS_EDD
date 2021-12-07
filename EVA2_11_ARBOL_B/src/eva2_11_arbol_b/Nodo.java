/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_arbol_b;

/**
 *
 * @author Mauricio
 */
public class Nodo {
   private int datito;
   private Nodo derecha;
   private Nodo izquierda;
   //Constructor
   public Nodo(){//Constructor por defecto
       this.derecha = null;
       this.izquierda = null;
   }
   public Nodo (int datito){
       this.datito = datito;
       this.derecha = null;
       this.izquierda = null;
   }
   //Getters y Setters
    public int getDatito() {
        return datito;
    }
    public void setDatito(int datito) {
        this.datito = datito;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    
}