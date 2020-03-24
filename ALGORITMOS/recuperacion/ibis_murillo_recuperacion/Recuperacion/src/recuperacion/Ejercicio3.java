
package recuperacion;


public class Ejercicio3 {
    /*
    sumar los números entre el 3 al 30
    */
    public static void main(String[] args) { 
        
        int suma= 0; 
        
        for (int i=3; i<=33; i++){ 
            
            suma = i + suma;    
        }
        System.out.println("La suma es:" + suma);
        
    }
}
