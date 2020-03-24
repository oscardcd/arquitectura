
package recuperacion;

import java.util.Scanner;


public class Ejercicio10 {
    /*
    Realice un algoritmo que permita calcular y dar como salida el promedio 
    general de una sección, tomando en cuenta que está compuesta por 25 estudiantes
    y que se tiene la nota definitiva de cada uno de ellos.
    */
    public static void main(String[] args) {
        
        double promedio, definitiva, contador= 0, acumulador=0; 
        
        Scanner entrada = new Scanner (System.in);  
        
        for (int i=1; i<= 25; i++){
            System.out.println("Ingrese la nota definitiva");
            definitiva = entrada.nextDouble();
            acumulador = definitiva + acumulador; 
            
        }
        promedio = acumulador / contador; 
        System.out.println("El promedio general es:" + promedio);
        
    }
}
