/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_gcd;

/**
 *
 * @author Mauricio
 */
public class EVA2_4_GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El maximo comun divisor de 48 y 180 es " + gcd(48,180));
    }
    public static int gcd(int iDividendo, int iDivisor){
        
        if(iDivisor == 0)//Para finalizar
            return iDividendo;
        else{
        //¿Cómo calculamos el residuo?
        //Modulo --> %
        int iResi = iDividendo%iDivisor;
        //¿Cómo se hace al metodo recursivo?
     
        return gcd(iDivisor,iResi);//Se llama a sí mismo
        } 
    }
}
