
package ciclos;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Leer numeros y muestra la suma hasta que el usuario pulse S para terminar
        
        Scanner casa=new Scanner(System.in);
        
        int num1,num2,seguir=1,suma;
       
        double acum=0;
        while(seguir==1){
           System.out.println("Ingrese el primer numero");
           num1=casa.nextInt();
           
            System.out.println("Ingrese el segundo numero");
           num2=casa.nextInt();
           
          acum=num1+num2;
           
            System.out.println("Ingrese 1 para parar, Ingrese 0 para seguir ");
            seguir=casa.nextInt();
            if(seguir==1){
                seguir=0;
            }else{
                seguir=1;
                
            }
            
            
            System.out.println("la suma es "  +acum);
            
            acum++;
        } 
        
       
        
    }
    
}
