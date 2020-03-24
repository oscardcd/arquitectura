package com.mycompany.tallerciclos;

//Imprima y sume la serie de números múltiplos de 3 en el rango cerrado de 3 a 99


public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        int acum = 0, suma;
        for(int i = 3;i<=99;i=i+3){
            suma = acum +i;
            System.out.println(i + " + " + acum + " = "+ suma);
            acum = acum + i;
        }
        
    }
    
}
