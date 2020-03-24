
package ciclos;

import java.util.Scanner;


public class Ciclo10 {
    
    
    public static void main(String[] args) {
      
         double prom,defi,acu=0;
         
         int i=0;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese la nota definitiva");
        defi=teclado.nextDouble();
        
        for(i=1;i<=25;i++)
        {
            System.out.println("Ingrese la nota definitiva");
            defi=teclado.nextDouble();
            
            acu=acu+defi;
        }
        
        prom=defi/acu;
        
        System.out.println("El promedio es: "+prom);
        
   
    }
    
}
