
package recuperacion;

import java.util.Scanner;


public class Ejercicio5parte3 { 
    
    public static void main(String[] args) {
        
        int numero, i=1, factorial=1; 
        
        Scanner entrada = new Scanner (System.in); 
        
        System.out.println("Ingrese un número");
        numero = entrada.nextInt(); 
        
        while (i<= numero){ //Aquí uso el Mientras.
            factorial *= i; 
            i++; 
        } 
        System.out.println("El factorial es:" + factorial);
        
   
}
}