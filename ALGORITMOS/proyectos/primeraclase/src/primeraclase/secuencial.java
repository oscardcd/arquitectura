
package primeraclase;

import java.util.Scanner;

public class secuencial 
{
    

    public void ejercicio1()
        {
        int numero1,numero2,suma;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("ingrese el numero 1");
        numero1=teclado.nextInt();
        
        System.out.println("ingrese el numero 2");
        numero2=teclado.nextInt();
        
        suma=numero1+numero2;
        
        System.out.println("la suma es: "+suma);
        
        }
     
     public void ejercicio2()
     {
         double num1,num2,num3,suma,division;
         
         Scanner teclado=new Scanner(System.in);
         
         System.out.println("ingrese el numero 1");
           num1=teclado.nextInt();         
         System.out.println("ingrese el numero 2");
           num2=teclado.nextInt();
         System.out.println("ingrese el numero 3");
           num3=teclado.nextInt();
           
        suma=num1+num2;
        division=suma/num3;
        
         System.out.println("la suma de los dos primeros numeros es: "+suma);
         System.out.println("la division entre el tercer numero es: "+division);
     }
     public  void ejercicio3()
     {
        double raiz, num;
         
         Scanner teclado=new Scanner(System.in);
         
         System.out.println("ingrese un numero");
         num=teclado.nextInt();
         
         raiz=Math.sqrt(num);
         
         System.out.println("la raiz del numero es: "+raiz);
                 
         
     }
     
     public void ejercicio4()
     {
         /*se necesia tener el promedio de un estudiante a partir de sus tres notas parciales*/
         
         double prom,not1,not2,not3;
         
         Scanner teclado =new Scanner(System.in);
         
         System.out.println("ingrese la nota 1");
         not1=teclado.nextDouble();
         
           System.out.println("ingrese la nota 2");
         not2=teclado.nextDouble();
         
           System.out.println("ingrese la nota 3");
         not3=teclado.nextDouble();
         
         prom=(not1+not2+not3)/3;
         
         System.out.println("el promedio es: "+prom);
         
         
     }
     
     public void ejercicio5()
     {
         /*se requiere un algoritmo para elaborar la plantilla de un empleado para 
         ello se dispone de sus horas laborales en el mes asi como la tarifa por horas*/
        Scanner teclado=new Scanner(System.in);
        
        double hlaboral,tarixhora,total;
        
         System.out.println("ingrese las horas laborales");
         hlaboral=teclado.nextDouble();
         
         System.out.println("ingrese la tarifa por hora");
         tarixhora=teclado.nextDouble();
         
         total=hlaboral*tarixhora;
         
         System.out.println("el total devengado es: "+total);
        
     }
}
        
    
    

