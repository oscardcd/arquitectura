
package primeraclase;

import java.util.Scanner;

public class ciclo_mientras 
{
    Scanner teclado=new Scanner(System.in);
    /*Leer números y muestra su suma hasta que el usuario pulse S para terminar */
    public void ejercicio1()
    {
        double numero,acunum=0;
        String letra="+";
        while("+".equals(letra))
        {
            System.out.println("ingrese un numero para sumar");
            numero=teclado.nextDouble();
            acunum=acunum+numero;
            
            System.out.println(acunum);
            
            System.out.println("para ingresar otro numero presione +, para tertinar ingrese S");
            letra=teclado.next();
                       
        }
        System.out.println(letra);
    }
    
    //Determinar si un numero es primo o no
    public void ejercicio2()
    {
        int numero,verificar;
        String continuar="si";
        
        while(continuar=="Si" || continuar=="si")
        {
            System.out.println("ingrese un numero para verificar si es primo o no");
            numero=teclado.nextInt();
            
           verificar =numero/numero;
           
           if(verificar==1)
           {
               System.out.println("es un numero primo");
           }
           else
           {
               System.out.println("no es un numero primo");
           }
           
            System.out.println("si quiere ingresar otro numero escriba Si, para terminar escriba no");
            continuar=teclado.next();
        }
    }
    
    public static void main(String[] args) {
        ciclo_mientras ciclos=new ciclo_mientras();
        
        ciclos.ejercicio1();
    }
}
