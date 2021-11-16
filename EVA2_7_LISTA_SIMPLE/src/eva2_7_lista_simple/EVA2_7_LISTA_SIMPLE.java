package eva2_7_lista_simple;

/**
 *
 * @author Mauricio
 */
public class EVA2_7_LISTA_SIMPLE {
    
//Se necesitan dos clases, una lista y una nodo

    public static void main(String[] args) {
        // TODO code application logic here
        //Crear una lista
        Lista miLista = new Lista();//Se crea lista vacía}
        /*miLista.printList();
        Nodo nodoNuevo = new Nodo(100);
        miLista.add(nodoNuevo);
        miLista.add(new Nodo(200));
        miLista.add(new Nodo(300));
        miLista.add(new Nodo(400));
        miLista.add(new Nodo(500));
        miLista.printList();*/
        
        /*int [] miArreglo = new int [1000000];
        for(int i = 0; i<miArreglo.length;i++){
            miArreglo[i] = (int) (Math.random()*1000);
        }
        
        for(int i = 0; i<1000000;i++){
            miLista.add(new Nodo ((int) (Math.random()*1000)));
        }*/
        
        miLista.add(new Nodo(100));
        miLista.add(new Nodo(200));
        miLista.add(new Nodo(300));
        miLista.add(new Nodo(400));
        miLista.add(new Nodo(500));
        miLista.printList();
        System.out.println("\nCantidad de nodos: "+miLista.length());
        try{
        System.out.println("Posicion: " + miLista.get(10));
        }catch (Exception ex){//Aqui se reseulve el error
            ex.printStackTrace();//Imprime el error
        }
    }
    
}
