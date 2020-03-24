
package recuperacion;

import java.util.Scanner;


public class Ejercicio2 {
    
    /*
    Calcular el promedio de notas definitivas de un grupo de estudiantes.
    Ingrese nombre y definitiva. El programa se detiene cuando el usuario
    no desee ingresar más registros.
    */
    public static void main(String[] args) {
        
        int bandera = 1; 
        double promedio, definitiva, contador=0, acumulador=0;
        String nombre; 
        
        Scanner entrada = new Scanner (System.in);
         
        
        while (bandera == 1){
            
            System.out.println("Ingrese su nombre");
            nombre = entrada.next(); 
            
            System.out.println("Ingrese su nota definitiva");
            definitiva = entrada.nextDouble();
            
            contador++; 
            acumulador = definitiva + acumulador; 
            
            System.out.println("Ingrese 1 para seguir / 0 para parar");
            bandera = entrada.nextInt();
        }
       
        promedio = acumulador / contador; 
        
        System.out.println("El promedio de notas definitivas del grupo es:" + promedio);
      
        
        
    }
}
