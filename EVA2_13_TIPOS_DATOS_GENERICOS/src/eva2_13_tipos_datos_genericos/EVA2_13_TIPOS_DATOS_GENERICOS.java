/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_tipos_datos_genericos;

/**
 *
 * @author Mauricio
 */
public class EVA2_13_TIPOS_DATOS_GENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Prueba<Double> prueba = new Prueba();
        prueba.setValor(-15.5);
        System.out.println(prueba.getValor());
        System.out.println(prueba);
        System.out.println(prueba.toString());
    }
    
}


class Prueba<T>{
    private T valor;

    public Prueba() {
    }

    public Prueba(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
}