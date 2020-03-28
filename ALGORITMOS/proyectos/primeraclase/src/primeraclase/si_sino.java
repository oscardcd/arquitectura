
package primeraclase;

import java.util.Scanner;

public class si_sino 
{
     Scanner teclado=new Scanner(System.in);
    /*Diga si una persona es mayor de edad*/
    public void ejercicio1()
    {
        int edad;
        
        System.out.println("ingrese su edad");
        
        edad=teclado.nextInt();
        
        if(edad>18)
        {
            System.out.println("usted es mayor de edad");
        }
        else
        {
            System.out.println("usted es menor de edad");
        }
    }
    
    //Leer dos datos numéricos enteros. Imprimirlos en forma ascendente 
    
    public void ejercicio2()
    {
        int num1,num2;
        
        System.out.println("ingrese un numero");
        num1=teclado.nextInt();
        System.out.println("ingrese nuevamene un numero");
        num2=teclado.nextInt();
        
        if(num1>num2)
        {
            System.out.println(num2+", "+num1);
            
            
        }
        else
        {
            System.out.println(num1+", "+num2);
        }
    }
    //Diseñar un algoritmo que lea un valor numérico y diga que si dicho valor es mayor o no que 100.

    public void ejercicio3()
    {
        int numero;
        
        System.out.println("ingrese un numero");
        
        numero=teclado.nextInt();
        
        if(numero>100)
        {
            System.out.println("el numero es mayor que 100");
        }
        else
        {
            System.out.println("el numero es menor que 100");
        }
    }
    
    //construye un algoritmo que diga si un numero es positivo o negativo:

    public void ejercicio4()
    {
        int numero;
        
        System.out.println("ingrese un numero");
        
        numero=teclado.nextInt();
        
        if(numero>=0)
        {
            System.out.println("el numero es positivo");
        }
        else
        {
            System.out.println("el numero es negativo");
        }
    }
    
    //Imprima si una persona recibe bono, si sus ventas son mayores a 5000000.ublic void ejercicio5()
    public void ejercicio5()
    {
        int ventas;
        
        System.out.println("ingrese el valor de sus ventas");
        ventas=teclado.nextInt();
        
        if(ventas>= 500)
        {
            System.out.println("usted tiene derecho a un bono");
        }
        else
        {
            System.out.println("usted no a sido merecedor de un bono");
        }
    }
    
  /*  public static void main(String[] args) {
        si_sino ejercicios=new si_sino();
        ejercicios.ejercicio1();
    }*/
}
