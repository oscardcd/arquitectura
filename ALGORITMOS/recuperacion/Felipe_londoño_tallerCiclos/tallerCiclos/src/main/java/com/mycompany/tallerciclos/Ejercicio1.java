package com.mycompany.tallerciclos;

//Imprima los números del 1 al 100 de 2 en dos


public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int i = 0;
        
        while(i<100){
            
            if(i==0){
                System.out.println(1);
            }
            
            i = (i+2);
            System.out.println(i);
          
        }
        
    }
}
