

package recuperacion;

import java.util.Scanner;


public class Ejercicio6 {
    /*
    Leer números y muestre su suma hasta que el usuario pulse s para terminar.
    */
    public static void main(String[] args) {
        
        double num1, num2, suma;   
        String bandera = "s"; 
        
        Scanner entrada = new Scanner (System.in); 
        
        while ("s".equals(bandera)){
            
            System.out.println("Ingrese un número");
            num1 = entrada.nextDouble();
            
            System.out.println("Ingrese otro número");
            num2 = entrada.nextDouble(); 
            
            suma = num1 + num2; 
            
            System.out.println("La suma es:" + suma);
            
            System.out.println("Escriba s para continuar / p para detener");
            bandera = entrada.next();
        }
}
}