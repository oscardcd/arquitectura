package com.mycompany.tallerciclos;

import java.util.Scanner;
// Leer números y muestra su suma hasta que el usuario pulse S para terminar 

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int num1,num2;
        boolean bandera = true;
        String resp;
        
        while (bandera){
            
            System.out.println("Ingrese un numero entero");
            num1 = teclado.nextInt();
        
            System.out.println("Ingrese otro numero entero");
            num2 = teclado.nextInt();
        
            System.out.println("La suma de los dos numeros es de: " + (num1+num2));
            teclado.nextLine();
            
            System.out.println("Pulsa S para salir o enter para continuar");
            resp = teclado.nextLine();
            
            if(resp.equals("s")){
                bandera = false;
            }
        
            
        }
        
    }
}
