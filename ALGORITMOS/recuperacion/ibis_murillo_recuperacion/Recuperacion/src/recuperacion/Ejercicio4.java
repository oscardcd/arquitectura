
package recuperacion;


public class Ejercicio4 { 
    
    /*
    Imprima y sume la serie de números múltiplos de 3 en el rango cerrado de 
    3 a 99.
    */
    
    public static void main(String[] args) {
        
        int acumulador=0; 
        
        for (int i=3; i<= 99; i++){
            
            if (i%3 == 0){
                
                System.out.println(i); 
                acumulador = i + acumulador; 
            }  
        } 
        System.out.println("La suma es:" + acumulador);
    }
}
