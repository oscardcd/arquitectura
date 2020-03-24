
package ciclos;

import java.util.Scanner;


public class Ciclo2 {
    
    
    public static void main(String[] args) {
        
        double defi,acunotas=0,conest=0,pronotas;
        int ban=1;
        String nombre;
        
        
        Scanner teclado=new Scanner(System.in);
        
        while(ban==1)
        {
            System.out.println("Ingrse el nombre del estudiante");
            nombre=teclado.next();
            
            System.out.println("Ingrese la nota definitava del estudiante");
            defi=teclado.nextDouble();
            
            acunotas=acunotas+defi;
            conest++;
            
            System.out.println("Para ingresar otro estudiante ingrese 1 o 0 para parar");
            ban=teclado.nextInt();
        }
        
        pronotas=acunotas/conest;
        
        System.out.println("El promedio del grupo es: "+pronotas);
        
    }
    
}
