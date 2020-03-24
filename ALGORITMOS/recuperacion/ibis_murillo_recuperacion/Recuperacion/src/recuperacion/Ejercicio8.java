
package recuperacion;

import java.util.Scanner;


public class Ejercicio8 {
    /*
    Genere la tabla de multiplicar de un número ingresado por el usuario hasta el 10.
    */
    public static void main(String[] args) {
        
        double tabla, numero; 
        
        Scanner entrada = new Scanner (System.in); 
        
        System.out.println("Ingrese un número");
        numero = entrada.nextDouble(); 
        
        for (int i= 1; i<=10; i++){ 
            
            tabla = numero*i; 
            System.out.println(numero + "x" + i + "=" + tabla);
        }
        
    }
}
