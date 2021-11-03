/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_24_for_each;

/**
 *
 * @author Mauricio
 */
public class EVA1_24_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] iArreglo = new int[10];
        
        for(int i= 0; i<iArreglo.length; i++){
            iArreglo [i]= 1;
        }
        
        //for-each  ---> Para leer, no para modificar
        //Variable que almacena el valor de cada posicion || Arreglo que se va a leer
        for(int temp : iArreglo){//Valor desde el primer elemento hasta el ultimo
            System.out.print("["+temp+"]");
        }
        
        //Declara y se ponen valores en el arreglo
        int[] iDatos = new int[]{1,2,3,4,5,6,7,8,9,10};
        String[]sCadenas = new String[]{"Lunes","Martes","Miercoles","Jueves","Viernes"};
        for(String sCadena:sCadenas){
            System.out.println(sCadena);
        }
        System.out.println("Un día de la semana "+ sCadenas[2]);
    }
    
}
