
package ciclos;

import java.util.Scanner;


public class Ciclo5 {
    
    public static void main(String[] args) {
        
        int num,fac=1,i=0;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num=teclado.nextInt();
        
        for(i=1;i<=num;i++)
        {
            fac *=i;
            
        }
        
        System.out.println("El factorial del el numero es: "+fac);
        
    }
    
}
