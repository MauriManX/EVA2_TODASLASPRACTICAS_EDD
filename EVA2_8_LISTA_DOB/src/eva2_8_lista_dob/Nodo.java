/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_lista_dob;

/**
 *
 * @author Mauricio
 */
public class Nodo {
   private int datito;
   private Nodo siguiente;
   private Nodo previo;
   //Constructor
   public Nodo(){//Constructor por defecto
       this.siguiente = null;
       this.previo = null;
   }
   public Nodo (int datito){
       this.datito = datito;
       this.siguiente = null;
   }
   //Getters y Setters
    public int getDatito() {
        return datito;
    }
    public void setDatito(int datito) {
        this.datito = datito;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    public Nodo getPrevio() {
        return previo;
    }
    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
   
   
    
}
