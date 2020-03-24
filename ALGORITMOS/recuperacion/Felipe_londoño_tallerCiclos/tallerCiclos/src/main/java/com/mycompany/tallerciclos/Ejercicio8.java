package com.mycompany.tallerciclos;

import java.util.Scanner;

//Genere la tabla de multiplicar de un numero ingresado por el usuario ej: el usuario ingresa 2 debería quedar:
// 2 * 1 hasta llegar a 2 * 10 =


public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        int num;
        
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("Ingrese un numero");
        num = teclado.nextInt();
        System.out.println("-------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " +(num*i));
        }
         System.out.println("-------------------------------");
    }
    
}
