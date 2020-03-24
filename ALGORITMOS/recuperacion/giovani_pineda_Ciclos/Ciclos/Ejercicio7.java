
package ciclos;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner dog=new Scanner(System.in);
        
        //Determinar si un numero es primo o no 
        
       
           int contador,I,numero;
           System.out.println("Ingrese un numero");
           numero=dog.nextInt();
           
           contador=0;
                   for(I=1;I<=numero;I++)
                   {
                       contador++;
                   
                   }
                   if(contador<=2){
                       
                   
                       System.out.println("no es primo");
                     }else{
                       
                        System.out.println(" es primo");
        }
    }
}



    

