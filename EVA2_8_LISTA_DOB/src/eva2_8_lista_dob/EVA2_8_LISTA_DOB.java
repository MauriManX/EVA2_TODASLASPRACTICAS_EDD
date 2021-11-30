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
public class EVA2_8_LISTA_DOB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble listaDoble = new ListaDoble();
        listaDoble.add(100);
        listaDoble.add(200);
        listaDoble.add(300);
        listaDoble.add(400);
        listaDoble.add(500);
        System.out.println("Cantidad de Nodos: "+listaDoble.length());
        System.out.println("");
        listaDoble.insertAt(0, 0);
        System.out.println("");
        System.out.println("Cantidad de Nodos: "+listaDoble.length());
        listaDoble.printList();
        System.out.println("");
        listaDoble.DeleteAt(2);
        listaDoble.printList();
        listaDoble.insertAt(2, 4);
        listaDoble.printList();
        
    }
    
}
