
package recuperacion;

import java.util.Scanner;


public class Ejercicio7 {
    /*
    Determinar si un número es primo o no.
    */
    public static void main(String[] args) {
        
        int numero, divisores=0; 
        
        Scanner entrada = new Scanner (System.in); 
        
        System.out.println("Ingrese un número");
        numero = entrada.nextInt(); 
        
        for (int i=1; i <= numero; i++){
            if(numero%i == 0){
              divisores++;   
            }
        } 
        if(divisores == 2){
            System.out.println("El número es primo");
        }
        else {
            System.out.println("El número no es primo");
        }
    }
}
