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
    private Nodo fin;
    
    public Lista(){
        inicio = null; //Lista vacia
        fin = null;
    }
    
    //Agregar nodos
    public void add(Nodo nuevo){
        
        if(inicio==null){
            inicio=nuevo; //Se conecta el primer nodo a la lista
            fin = nuevo;
        }
        else{//Cuando la lista con nodos...
            //Se debe ir hasta el final de la lista
            //Usando temp se recorrerá nodo por nodo hasta llegar al final
            
            
            /*Nodo temp = inicio;//Desde aqui se empieza
            //while
            while(temp.getSiguiente() != null){//Mientras temp.siguiente != seguiremos avanzando nodo tras nodo
                temp = temp.getSiguiente();//Se mueve temp al nodo siguiente
      
            }
            temp.setSiguiente(nuevo);//Conectamos el nodo nuevo al final de la lista*/
            
            //Agregar nodo al final de la lista
            fin.setSiguiente(nuevo);
            fin = nuevo; // Nos movemos hacia el final de la lista
        }
    }
    //Imprimir Lista
    public void printList(){
        Nodo temp = inicio;//Desde aqui se empieza
            //while
            while(temp != null){//Mientras temp != seguiremos avanzando
                System.out.print(temp.getDatito() + " - ");
                temp = temp.getSiguiente();//Temo se mueve al siguiente nodo
            }
    }
    //Borrar la lista
    public void clear(){
        inicio = null;
        fin = null;
    }
    
    //Contar los nodos
    public int length(){
        int iCont = 0;
        Nodo temp = inicio;//Desde aqui se empieza
            //while
            while(temp != null){//Mientras temp != seguiremos avanzando
                iCont++;
                temp = temp.getSiguiente();//Temo se mueve al siguiente nodo
            }
            return iCont;
    }
    
    //La lista está vacía: True, con Nodos: False
    public boolean isEmpty(){
        //Verificacion
        if(inicio == null)
            return true;
        else
            return false;
    }
    
    //Recuperar un valor de la lista
    public int get(int pos) throws Exception{
        //verificacion
        if(isEmpty()){//Lista vacía
            throw new Exception("No hay valores almacenados en la lista");
        }else{//Posicion que no exista: Posicion negativa o que nos pasemos
            //pos tiene que estar entre 0 y n-1 --> n es el tamaño (length)
            if((pos < 0) || (pos >= length() ))//Si pod es menor a cero o por es mayor o igual a n
              throw new Exception("Esa posicion no existe dentro de la lista");  
        }
     
        Nodo temp = inicio;
        for(int i = 0; i < pos ;i++){
            temp = temp.getSiguiente();//Temo se mueve al siguiente nodo
        }
        return temp.getDatito();
    }
    
    public void insertAtBegining(Nodo nuevo){
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
    }
    public void insertAt (int pos,Nodo nuevo){
        //Validar
        
        //Situaciones
        //Insertar al inicio
        if(pos == 0){
            insertAtBegining(nuevo);
        }else{//Cualquier otro caso
            Nodo temp = inicio;//Desde aqui se empieza
            for (int i = 0; i<(pos-1); i++){
                temp = temp.getSiguiente();//Mover temp al siguiente nodo
            }
    }
    }
}
