
package ciclos;

import java.util.Scanner;


public class Ciclo7 {
    
    public static void main(String[] args) {
        
            int num,divisores=0,i=0;
            
            Scanner teclado=new Scanner(System.in);
            
            System.out.println("Ingrese el primer numero");
            num=teclado.nextInt();
            
            for(i=1;i<=num;i++){
                
                if(num%i==0)
                {
                    divisores++;
                }
            }
            
            if(divisores==2)
            {
                System.out.println("El numero es primo");
            }
            
            else
            {
                System.out.println("El numero no es primo");
            }
         
               
    }
    
}
