/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraclase;

import java.util.Scanner;

/**
 *
 * @author OSCAR
 */
public class si_anidados 
{
    Scanner teclado=new Scanner(System.in);
    
    //Ingrese un numero muestre un mensaje que diga si se encuentra entre el rango de 1 a 100
    public void ejercicio1()
    {
        int numero;
        
        System.out.println("ingrese un numero");
        numero=teclado.nextInt();
        
        if(numero<=100)
        {
            if(numero>=1)
            {
                System.out.println("el numero se encuentra en el rando de 1 a 100");
            }
            else
            {
                System.out.println("no se encuentra en el rango de 1 a 100");
            }
        }
    }
    
    //Leer tres números diferentes e imprimir solo el número mayor de los tres.
    
    public void ejercicio2()
    {
        int num1,num2,num3;
        
        System.out.println("ingrese tres numeros por favor");
        System.out.print("numero 1: ");        
        num1=teclado.nextInt();
        System.out.print("numero 2: ");        
        num2=teclado.nextInt();      
        System.out.print("numero 3: ");
        num3=teclado.nextInt();
        
        if(num1>num2)
        {
            if(num1>num3)
            {
                System.out.println("el numero mayor es: "+num1);
            }
        }
        else
        {
            if(num2>num1)
            {
                if(num2>num3)
                {
                    System.out.println("el numero mayor es: "+num2);
                }
                else
                {
                    System.out.println("el numero mayor es: "+num3);
                }
            }
        }
    }
    //Leer 2 números; si son iguales que los multiplique, si el primero es mayor 
    //que el segundo que los reste y si no que los sume.
    public void ejercicio3()
    {
        int num1,num2,multi,resta,suma;
        
        System.out.println("ingrese un numero");
        num1=teclado.nextInt();
        System.out.println("ingrese otro numero");
        num2=teclado.nextInt();
        
        if(num1==num2)
        {
            multi=num1*num2;
            System.out.println("los numeros se multiplicaron, el total es: "+multi);
            
        }
        else
        {
            if(num1>num2)
            {
                resta=num1-num2;
                System.out.println("los numeros se restaron, el total es: "+resta);
            }
            else
            {
                suma=num1+num2;
                System.out.println("los numeros se sumaron, el todal es: "+suma);
            }
        }
    }   
    /* En una tienda de descuento se efectúa una promoción en la cual se hace 
    un descuento sobre el valor de la compra total según el color de la bolita 
    que el cliente saque al pagar en caja. Si la bolita es de color blanco no se
    le hará descuento alguno, si es verde se le hará un 10% de descuento, 
    si es amarilla   un 25%, si es azul un 50% y si es roja un 100%. 
    Determinar la cantidad final que el cliente deberá pagar por su compra 
    se sabe que solo hay bolitas de los colores mencionados.*/
    
    public void ejercicio4()
    {
        
        double valcom,totalv,desc1=0.10,desc2=0.25,desc3=0.50;
        String bola;
        
        System.out.println("ingrese el valor de la compra: ");
        valcom=teclado.nextInt();
        
        System.out.println("ingrese el color de su bolita: "); 
        bola=teclado.next();
        
        if(bola=="blanco")
        {
            System.out.println("el valor de su compra es: "+valcom);
        }
        else
        {
            if(bola=="verde")
            {
                totalv=valcom+(valcom*desc1);
                System.out.println("el valor de su compra es: "+totalv);
            }
            else
            {
                if(bola=="amarilla")
                {
                    totalv=valcom+(valcom*desc2);
                    System.out.println("el valor de su compra es: "+totalv);
                }
                else
                {
                    if(bola=="azul")
                    {
                        totalv=valcom+(valcom*desc3);
                        System.out.println("el valor de su compra es: "+totalv);
                    }
                    else
                    {
                        if(bola=="rojo")
                        {
                            System.out.println("su compra es gratuita");
                        }
                    }
                }
            }
        }
    }   
    
    /**Calcular la utilidad que un trabajador recibe en el reparto anual 
     * de utilidades si este se le asigna como un porcentaje de su salario 
     * mensual que depende de su antigüedad en la empresa de acuerdo 
     * con la siguiente tabla:
     * 
     * menos de 1 año utilidad 5%
     * 1-2 años 7%
     * 2-5 años 10%
     * 5-10 años 15%
     * mas de 10 20%
     * */
    
    public void ejercicio5()
    {
        double tiempo,salario,totaldev;
        
        System.out.println("ingrese el tiempo laborado en meses");
        tiempo=teclado.nextDouble();
        
        System.out.println("ingrese su salario mensual");
        salario=teclado.nextDouble();
        
        if(tiempo<12)
        {
            totaldev=(salario+(salario*0.5))*12;
            System.out.println("el salario con utilidad sera: "+totaldev);
        }
        else
        {
            if(tiempo>=12 && tiempo<24)
            {
                totaldev=(salario+(salario*0.7))*12;
                System.out.println("el salario con utilidad sera: "+totaldev);
            }
            else
            {
                if(tiempo>=24 && tiempo <(12*5))
                {
                     totaldev=(salario+(salario*0.10))*12;
                     System.out.println("el salario con utilidad sera: "+totaldev);
                }
                else
                {
                     if(tiempo>=(12*5)&& tiempo <(12*10))
                     {
                         totaldev=(salario+(salario*0.15))*12;
                         System.out.println("el salario con utilidad sera: "+totaldev);
                     }
                     else
                     {
                         if(tiempo>=(12*10))
                         {
                              totaldev=(salario+(salario*0.20))*12;
                              System.out.println("el salario con utilidad sera: "+totaldev);
                         }
                     }
                }
            }
        }
        
    }
}
