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
public class ArbolBinario {
    private Nodo root;

    public ArbolBinario() {
        this.root = null;//Árbol vacío
    }
    
    //A partir de aquí TODOOOO será recursivo
    //Agregar un nodo:
    public void add(int valor){
        Nodo nuevo = new Nodo(valor);
        //Verificamos si hay nodos en el arbol
        if (root == null){//No hay árbol
            root=nuevo;
        }else{
            addRecu(root,nuevo);
        }
    }
    
    public void addRecu(Nodo actual, Nodo nuevo){
        //Se verifica a que lado irá el nodo
          if(nuevo.getDatito() < actual.getDatito()){//Izq: Valor nuevo menor a nodo actual
              if(actual.getIzquierda()==null){
                  actual.setIzquierda(nuevo);
              }else{
                  addRecu(actual.getIzquierda(),nuevo);
              }
              //Derecha
          }else if(nuevo.getDatito() > actual.getDatito()){
              if(actual.getDerecha()==null){
                  actual.setDerecha(nuevo);
              }else{
                  addRecu(actual.getDerecha(),nuevo);
              }
              
          }else{
              System.out.println("Ese valor ya existe en el arbol");
          }      
    }
    
    public void printPreOrder(){
        preOrder(root);//Se llama al metodo recursivo
    }
    
    private void preOrder(Nodo actual){
        if(actual != null){
            System.out.print("["+actual.getDatito()+"]");//Visit node
            preOrder(actual.getIzquierda());//Traverse left subtree
            preOrder(actual.getDerecha());//Traverse right subtree
}
 }
    public void printInOrder(){
        inOrder(root);//Se llama al metodo recursivo
    }
    
    private void inOrder(Nodo actual){
        if(actual != null){
            inOrder(actual.getIzquierda());//Traverse left subtree
            System.out.print("["+actual.getDatito()+"]");//Visit node
            inOrder(actual.getDerecha());//Traverse right subtree
}
 }
    public void printPostOrder(){
        postOrder(root);//Se llama al metodo recursivo
    }
    
    private void postOrder(Nodo actual){
        if(actual != null){
            postOrder(actual.getIzquierda());//Traverse left subtree
            postOrder(actual.getDerecha());//Traverse right subtree
            System.out.print("["+actual.getDatito()+"]");//Visit node
}
 }
}