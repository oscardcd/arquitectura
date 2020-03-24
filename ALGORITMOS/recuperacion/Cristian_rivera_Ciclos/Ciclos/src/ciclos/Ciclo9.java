
package ciclos;

import java.util.Scanner;


public class Ciclo9 {
    
    public static void main(String[] args) {
         
        int num1,tabla,i=0,j=0;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num1=teclado.nextInt();
        
        for(i=num1-1;i<=num1;i++)
        {
            for ( j = 1; j < 10; j++) 
            {
                tabla=j*i;
                System.out.println(i+ "x"+ j+ "="+tabla);
            }
        }
    }
    
}
