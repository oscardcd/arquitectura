
package recuperacion;

import java.util.Scanner;


public class Ejercicio5parte2 {
    
    public static void main(String[] args) {
        
        int numero, i=1, factorial=1;
        
        Scanner entrada = new Scanner (System.in); 
        
        System.out.println("Ingrese un número");
           numero = entrada.nextInt();
        
          do {                         //aquí uso el Haga Mientras. 
           factorial *= i;
           i++;
       } while (i<= numero); 
       
        System.out.println("El factorial del número es:" + factorial);
    }
    }

