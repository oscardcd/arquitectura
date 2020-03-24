package com.mycompany.tallerciclos;
import java.util.Scanner;
//Determinar si un numero es primo o no


public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        int num;
        int acum = 0;
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Por favor Ingrese un numero");
        num = teclado.nextInt();
        
        for(int i = 1;i<=num;i++){
            
            if(num%i == 0){
                acum++;
            }
        }
        
        if (acum == 2) {
            System.out.println("primo");
        }else{
            System.out.println("no es primo");
        }
        
    }
    
}
