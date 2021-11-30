/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_queue;

/**
 *
 * @author Mauricio
 */
public class MyQueue extends Lista {
    //Es como una fila de supermercado o cuando van a repartir dulces de la piñata, e incluso cuando vas a comprar boletos para Spider-Man No Way Home, no te puedes meter al frente
    //Los elementos se agregan al final de la lista
    //Método Add de la lista --> Sin cambios
    //Solo podemos acceder a los elementos al inicio de la lista
    
    public int peek() throws Exception{//Regresa el valor del elemento al inicio de la lista
        return get(0);
    }
    public int poll() throws Exception{//Regresa y elimina el elemento al inicio de la lista
        //Guardar el valor
        int iVal = get(0);
        //Eliminamos el valor
        deleteAt(0);
        //Imprimimos el valor
        return iVal;
        
    }
}
