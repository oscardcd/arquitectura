package com.mycompany.tallerciclos;

//Sumar los números entre el 3 y el 30

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        int acum = 0;
        
        for(int i = 3;i<=30;i++){
            
            System.out.println("I: "+i+"   acum: "+acum);
            acum = acum+i;
        }
    }
    
}
