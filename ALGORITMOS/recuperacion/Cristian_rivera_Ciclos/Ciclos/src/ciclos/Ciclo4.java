
package ciclos;


public class Ciclo4 { 
    
    public static void main(String[] args) {
        
        
        int acunum=0,i=0;
        
        for(i=3;i<=99;i++)
        {
            if(i%3==0)
            {
                System.out.println(i);
                acunum=acunum+i;
                
            }
            
        }
        
        System.out.println("La suma es: "+acunum);
    }
    
    
}
