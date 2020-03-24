
package ciclos;

import java.util.Scanner;

public class Ciclo8 {
    
    public static void main(String[] args) {
        
        int num,i=0;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num=teclado.nextInt();
        
        for(i=1;i<=10;i++)
        {
            System.out.println(num + "x" + i +"=" +num*i);
        }
    }
    
}
