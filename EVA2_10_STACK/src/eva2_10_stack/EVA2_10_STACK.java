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
public class EVA2_10_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStack myStack = new MyStack();
        
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(1);
        myStack.printList();
        System.out.println("\nAgarramos lo de arriba de la pila y lo eliminamos");
        myStack.pop();
        myStack.printList();
    }
    
}
