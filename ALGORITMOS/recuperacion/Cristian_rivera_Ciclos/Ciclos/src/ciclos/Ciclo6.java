
package ciclos;

import java.util.Scanner;


public class Ciclo6 {
    
    public static void main(String[] args) {
        
        int num1,num2,suma;
        String bandera="s";
        
        Scanner teclado=new Scanner(System.in);    
        
        
        
        while("s".equals(bandera))
        {
            System.out.println("Ingrese el primer numero");
            num1=teclado.nextInt();
                
            System.out.println("Ingrese el segundo numero");
            num2=teclado.nextInt();
            
            suma=num1+num2;
            
            System.out.println("El resultado de la suma es: "+suma);
            
            System.out.println("Desea volver hacer la suma s para continuar o n para parar");
            bandera=teclado.next();
        }
        
        
        
        
       
        
    }
    
}
