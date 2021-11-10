/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_lista_simple;

/**
 *
 * @author Mauricio
 */
public class Lista { //Lista simplemente enlazada
    private Nodo inicio;//Es el punto de incio y acceso a la lista
    
    public Lista(){
        inicio = null; //Lista vacia
    }
    
    //Agregar nodos
    public void add(Nodo nuevo){
        
        if(inicio==null){
            inicio=nuevo; //Se conecta el primer nodo a la lista
        }
        else{//Cuando la lista con nodos...
            //Se debe ir hasta el final de la lista
            //Usando temp se recorrerá nodo por nodo hasta llegar al final
            Nodo temp = inicio;//Desde aqui se empieza
            
            
        }
    }
    //Imprimir Lista
}
