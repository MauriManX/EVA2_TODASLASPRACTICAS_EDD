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
public class ListaDoble { //Lista simplemente enlazada
    private Nodo inicio;//Es el punto de incio y acceso a la lista
    private Nodo fin;
    private int tama;

    public ListaDoble() {
        inicio = null; //Lista vacia
        fin = null;
        tama= 0;
    }
    
    public void add(int valor){
        Nodo nuevo = new Nodo(valor);
        if(inicio==null){ //Lista vacía
            inicio=nuevo; //Se conecta el primer nodo a la lista
            fin = nuevo;
        }else{//Lista con nodos
            //Agregar un nodo al final de la lista
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo; // Nos movemos hacia el final de la lista
        }
        tama++;
    }
    
}
