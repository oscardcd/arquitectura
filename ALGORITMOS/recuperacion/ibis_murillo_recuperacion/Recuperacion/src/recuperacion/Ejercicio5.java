

package recuperacion;

import java.util.Scanner;


public class Ejercicio5 {
    
    /*
    Calcular el factorial de un número utilizando los 3 tipos de ciclos.
    */
    public static void main(String[] args) {
        
        int numero, factorial=1; 
        
        Scanner entrada = new Scanner (System.in); 
        
        System.out.println("Ingrese un número");
        numero = entrada.nextInt(); 
        
        for (int i=1; i<= numero; i++){ // aquí uso el para.
            
            factorial *= i; 
        }
        System.out.println("El factorial del número ingresado es:" + factorial);
        
    }
        
}
