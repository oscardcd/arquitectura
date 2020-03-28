
package primeraclase;

import java.util.Scanner;

public class ciclo_para 
{
    
    Scanner teclado=new Scanner(System.in);
    /*Imprima los números del 1 al 100 de 2 en dos*/
    public void ejercicio1()
    {
        int numero=0,i=0;
        
        for(i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
    
    /*Calcular el promedio de notas definitivas de un grupo de estudiantes.
    Ingrese nombre, y definitiva. El programa se detiene cuando el usuario 
    no desee ingresar mas registros.*/
    public void ejercicio2()
    {
        double promnotas,acunotas=0,contest=0,definitiva;
        int bandera=1;
        String nombre;
        
        while(bandera==1)
        {
            System.out.println("ingrese el nombre del estudiante: ");
            nombre=teclado.next();
            
            System.out.println("ingrese la nota definitiva: ");
            definitiva=teclado.nextDouble();
            
            acunotas=acunotas+definitiva;
            contest++;
            
            System.out.println("para ingresar un nuevo estudian ingrese 1 o 0 para terminar");
            bandera=teclado.nextInt();
        }
        
        promnotas=acunotas/contest;
        System.out.println("el promedio del grupo es: "+promnotas);
    }
    /*Sumar los números entre el 3 y el 30*/
    public void ejercicio3()
    {
        int acunum=0,i=0;
        
        for(i=3;i<=30;i++)
        {
            acunum=acunum+i;
            System.out.println(acunum); 
        }
        System.out.println(acunum);
    }
    
    /*Imprima y sume la serie de números múltiplos de 3 en el rango cerrado de 3 a 99*/
    public void ejercicio4()
    {
        int acunum=0,i=0;
        
        for(i=3;i<=99;i++)
        {
            acunum=acunum+3;
            System.out.println(acunum);
        }
    }
    
    /*Cálculo del factorial de un número realizado con los tres tipos de ciclos: Mientras, Haga y para: */
    public void ejercicio5()
    {
        int numero,i,result=1;
        
        System.out.println("ingrese un numero para hallar el factorial");
        numero=teclado.nextInt();
        
        for(i=1;i<=numero;i++)
        {
            
            result=result*i;
            System.out.println(result);
        }
    }
    
    public  void ibis()
    {
        int numero,multiplo;
        
        System.out.println("ingrese un numero");
        numero=teclado.nextInt();
        multiplo=numero%10;
        if(multiplo==0)
        {
            System.out.println("sirvio");
        }
    }
    public static void main(String[] args) {
        
        ciclo_para ciclos=new ciclo_para();
        
        ciclos.ejercicio5();
    }
   
    
}
