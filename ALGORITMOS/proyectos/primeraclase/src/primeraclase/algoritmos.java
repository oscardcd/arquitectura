/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraclase;

import java.util.Scanner;


public class algoritmos 
{

    public static void main(String[] args)
    {
       String tejercicio;
       int ejercicio;
      

       Scanner teclado=new Scanner(System.in);

       secuencial secuencial=new secuencial();
       si_sino si_sino=new si_sino();


       System.out.println("ingrese el tipo de ejercicio:\n -secuencial\n -si_sino");
       tejercicio=teclado.next();
       
       switch(tejercicio)
       {
           case "secuencial":
           {
                System.out.println("ingrese el ejercicio de que desea hacer: 1,2,3,4,5");
                ejercicio=teclado.nextInt();

                switch (ejercicio)
                {
                    case 1:
                        secuencial.ejercicio1();
                        break;
                    case 2: 
                        secuencial.ejercicio2();
                        break;
                    case 3:
                        secuencial.ejercicio3();
                        break;
                    case 4:
                        secuencial.ejercicio4();
                        break;
                    case 5:
                        secuencial.ejercicio5();
                        break;
                    default:
                        System.out.println("ingreso un numero equivocado");

                }

           }

            case "si_sino":
           {
                System.out.println("ingrese el ejercicio de que desea realizar: 1,2,3,4,5");
                ejercicio=teclado.nextInt();

                switch (ejercicio)
                {
                    case 1:
                        si_sino.ejercicio1();
                        break;
                    case 2:
                        si_sino.ejercicio2();
                        break;
                    case 3:
                        si_sino.ejercicio3();
                        break;
                    case 4:
                        si_sino.ejercicio4();
                        break;
                    case 5:
                        si_sino.ejercicio5();
                        break;
                    default:
                         System.out.println("ingreso un numero equivocado");
                }
            }
        }
    }
}

      /*  System.out.println("ingrese el tipo de ejercicio:\n -secuencial\n -si_sino");
       tejercicio=teclado.next();
        System.out.println(tejercicio);

        System.out.println("ingrese el ejercicio de que desea hacer: 1,2,3,4,5");

        ejercicio=teclado.next();
        ejercicio="ejercicio"+ejercicio;
        System.out.println(ejercicio);

        tejercicio+"."+ejercicio+"()";
*/

    


