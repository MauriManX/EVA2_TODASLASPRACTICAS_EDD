/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_stack;

/**
 *
 * @author Mauricio
 */
public class MyStack extends Lista{
    
    public void push(int valor) {
        add(valor);
        System.out.println(valor+" fue agregado en la pila");
    }
    
    public void pop() {
        System.out.println(getFin().getDatito());
        deleteAt(length()-1);
    
}
}
