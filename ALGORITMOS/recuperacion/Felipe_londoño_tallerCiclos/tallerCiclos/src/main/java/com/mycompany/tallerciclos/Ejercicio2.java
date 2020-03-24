package com.mycompany.tallerciclos;

import java.util.Scanner;

//Calcular el promedio de notas definitivas de un grupo de estudiantes. 
//Ingrese nombre, y definitiva. El programa se detiene cuando el 
//usuario no desee ingresar mas registros.


public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
                
        String nombre;
        int resp, activo = 1, cont = 0;
        double acum = 0.0, prom, notaDef;
        
        while(activo == 1){
            
            System.out.println("Ingrese su nombre");//Capturo el Nombre
            nombre = teclado.nextLine();
            teclado.nextLine();
            
            System.out.println("Ingrese la nota definitiva");//Capturo la nota Definitiva
            notaDef = teclado.nextDouble();
            
            acum = acum+notaDef;
            
            System.out.println("Si quiere agregar otro registro ingresea 1 si no ingrese 0");//el usuario dice si quiere seguir o no
            resp = teclado.nextInt();
            
            if(resp == 0){
                activo = 0;
            }else{
                activo = 1;
            }
            cont++;
        }
        
        prom = (acum/cont);
        
        System.out.println("El promedio es de: " + prom);
    }
    
}
