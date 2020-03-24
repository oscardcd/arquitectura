
package ciclos;

import java.util.Scanner;


public class Ciclo5parte3 {
    
    public static void main(String[] args) {
        
        int num,fac=1,i=1;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num=teclado.nextInt();
        
        do
        {
            fac *=i;
            i++;
        }
        while(i<=num);
        
        System.out.println("El factorial de su numero es: "+fac);
    }
    
}
