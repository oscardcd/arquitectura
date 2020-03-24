package com.mycompany.tallerciclos;

//Cálculo del factorial de un número realizado con los tres tipos de ciclos: Mientras, Haga y para.

import java.util.Scanner;



public class Ejercicio5 {
    
      static int fact;
      
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
       
        
        System.out.println("Ingrese un numero para ccalcular factorial");
        fact = teclado.nextInt();
        
        System.out.println("---------------------------------");
        System.out.println("Factorial con PARA");
        cicloFor();
        
        System.out.println("---------------------------------");
        System.out.println("Factorial con MIENTRAS");
        cicloWhile();
        
        System.out.println("---------------------------------");
        System.out.println("Factorial con HAGA");
        cicloDoWhile();
        
    }
    
    //CICLO FOR o PARA
    static int cicloFor(){
        int acum = 1;
        for(int i = 1;i<=fact;i++){
            
            acum = i*acum;
        }
        System.out.println(acum);
        return 0;
    }
    
    //CICLO WHILE o MIENTRAS
    static int cicloWhile(){
        int i = 1;
        int acum = 1;
        while(i<=fact){
         
            acum = i*acum;
            i++;
        }
        System.out.println(acum);
        return 0;
    }
    
    //CICLO DO WHILE o HAGA
    static int cicloDoWhile(){
        int i = 1;
        int acum = 1;
        
        do{
            acum = i*acum;
            i++;            
        }
        while(i<=fact);
        System.out.println(acum);
        return 0;
    }
        
    }
