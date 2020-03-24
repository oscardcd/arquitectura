
package ciclos;

import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        
       int numero,i,p;
 Scanner car = new Scanner(System.in);
        System.out.print("indica la tabla de multiplicar");
        numero = car.nextInt();
 
        for(i = 1; i<=numero; i++)
        {
            for(p = 1; p <= 10; p++)
            {
                System.out.println(i + " X " + p + " = " + i*p);
            }
            System.out.println();
        }
    }
}
        

