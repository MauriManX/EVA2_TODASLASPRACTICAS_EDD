/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_collections_3;

import java.util.ArrayList;

/**
 *
 * @author Mauricio
 */
public class EVA2_16_COLLECTIONS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Muy similar a linkedlist, pero trabaja con arreglos
        //Lo que implica ser menos eficaz para cambiar de tamaño
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        arrayList.add(700);
        System.out.println(arrayList);
        System.out.println(arrayList.get(4));
        arrayList.remove(4);
        System.out.println(arrayList);
        
        for(int i=0; i < arrayList.size(); i++){
            System.out.println("["+arrayList.get(i)+"]");
        }
    }
    
}
