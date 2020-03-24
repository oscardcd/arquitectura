package com.mycompany.tallerciclos;

//Genere las tablas de multiplicar de un número ingresado por el usuario así: si ingresa 2.
//se generan dos tablas la del 1 y la del 2 cada tabla hasta el 9


import java.util.Scanner;



public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        int num;
        
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("Ingrese un numero");
        num = teclado.nextInt();
        System.out.println("-------------------------------");

        for (int j = 1; j <= num; j++) {
            System.out.println("-------------------------------");
            for (int i = 1; i <= 10; i++) {
            System.out.println(j + " X " + i + " = " +(j*i));
            }
            System.out.println("-------------------------------");
        }
         System.out.println("-------------------------------");
    }
    
}