
package ciclos;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        //Calcular el promedio de notas definitivas de un grupo de estudiantes
        //ingrese su nombre y su definitiva.El programa se detiene cuando el 
        //usuario no desee ingresar mas registros
        Scanner carro=new Scanner(System.in);
        
        String nombres;
        int respuesta,cont=0,activo=1;
        double Def=0,acum=0,prom;
       
      
        while(activo==1){
            System.out.println("Ingrese el nombre");
            nombres=carro.nextLine();
            carro.nextLine();
            
            System.out.println("Ingrese la nota definitiva");
            Def=carro.nextDouble();
            
            
            
            
            System.out.println("Ingrese 1 si quiere continuar ingrese 2 si no quiere continuar");
            respuesta=carro.nextInt();
            acum=acum+Def;
            
            if(respuesta==2){
                activo=0;   
            }else{
                activo=1;
         
            }
            
            cont++;
            
        }
           prom=(acum/cont);
           System.out.println("el promedio es de: "+prom);
        
    }
    
}
