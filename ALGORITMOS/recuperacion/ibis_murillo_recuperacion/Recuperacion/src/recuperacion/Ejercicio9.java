
package recuperacion;

import java.util.Scanner;


public class Ejercicio9 {
    /*
    Genere las tablas de multiplicar de un número ingresado por el usuario así:
    si ingresa 2, se generan 2 tablas la del 1 y la del 2, cada tabla hasta el 9.
    */
    public static void main(String[] args) {
        
        int num1, tabla; 
        
        Scanner entrada = new Scanner (System.in); 
        
        System.out.println("Ingrese un número");
        num1 = entrada.nextInt(); 
        
        for (int i = num1-1; i <= num1; i++){
            
            for (int j=1; j<=10; j++){
                
                tabla = i * j; 
                
                System.out.println(i + "x" + j + "=" + tabla);
            }
        }
               
    }
    
}
