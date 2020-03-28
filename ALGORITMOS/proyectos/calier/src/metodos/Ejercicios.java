
package metodos;

import java.util.Scanner;


public class Ejercicios 
{
      /*
A una fiesta asisten persona de diferente edad y sexo.
Haga un algoritmo con varios métodos e imprima la siguiente información:
Total de personas que asistieron a la fiesta
Promedio de edad por sexo
Nombre de la persona de más edad que asistió.
Nota: A la fiesta no se permite el ingreso a personas menores de edad.
*/
public int edad;
public String sexo,name;
 
public static Ejercicios obj=new Ejercicios();

public static Scanner leer=new Scanner(System.in);
  
      public static void leerdatos()
   {
       
       //leer el nombre
       System.out.println("ingrese su nombre");
       obj.name=leer.next();
       //lee la edad
       System.out.println("ingrese su edad");
       obj.edad= leer.nextInt();
       //lee el sexo
       System.out.println("ingrese su sexo, m para masculino o f femenino");
       obj.sexo=leer.next();      
   }
      
  
   public static void proceso()
   {
       double contaper=0,acuhom=0,acumuj=0,contah=0,contam=0,promedhom,promedadmuj,edadpermay=0;
       String ingresar="si",Gnombre;
        Gnombre = "";

       while("si".equals(ingresar) || "Si".equals(ingresar))
       {
           
        Ejercicios.leerdatos();
        
        if(obj.edad>=18)
        {
            contaper++;
            if(obj.edad>edadpermay)
            {
                edadpermay=obj.edad;
                Gnombre=obj.name;
            }
           
           if("m".equals(obj.sexo)||"M".equals(obj.sexo) )
           {
               contah++;
               acuhom=acuhom+obj.edad;
           }
           else
           {
               contam++;
               acumuj=acumuj+obj.edad;
           }
        }
        else
        {
            System.out.println("la persona no puede ingresar");
        }
           System.out.println("para ingresar otra persona ingrese si, para terminar no");
           ingresar=leer.next();
      }
      promedhom=acuhom/contah;
      promedadmuj=acumuj/contam;
      
       
       
       Ejercicios.mostrar(contaper,promedhom, promedadmuj, Gnombre);
     
   }
   
    public static void mostrar(double totalper,double prom1, double prom2 , String nombre)
   {
       
       System.out.println("el total de las personas es: "+totalper);
       System.out.println("el promedio de edad por hombres es: "+prom1+"\n el promedio de edad de las mujeres es: "+prom2);
       System.out.println("el nombre de la persona de mayor edad es: "+ nombre);  
   }
   
    
    /*
    En un grupo de estudiantes se almacena el numero de carnet, nombre, 
    apellido y 5 notas por cada estudiante. Calcular la nota definitiva de cada 
    estudiante y luego mostrarla con los datos de dicho estudiante
    
    -ingresar, mostrar y calcular
    -nombre,carnet y not_Def
    */
    public int num_carnet;
    public double acunotas,notas, notdef;
    public String nombre, apellido,ingr_est="si";
    
    public static void ingresar()
    {
        int i;
        obj.acunotas=0;
        System.out.println("ingrese su numero de carnet");
        obj.num_carnet=leer.nextInt();
        
        System.out.println("ingrese su nombre: ");
        obj.nombre=leer.next();
        
        System.out.println("ingrese su apellido: ");
        obj.apellido=leer.next();
        
        for(i=1;i<=5;i++)
        {
            System.out.println("ingrese nota "+i);
            obj.notas=leer.nextDouble();
            
            obj.acunotas=obj.acunotas+obj.notas;
        }
        
    }
    
    public static void calcular()
    {
        
        while(obj.ingr_est.equals("si"))
        {
            Ejercicios.ingresar();
        
            obj.notdef=obj.acunotas/5;
            
            Ejercicios.mostrar();
            
            System.out.println("quiere ingresar otro estudiante 'Si' para continuar y 'No' para terminar");
            obj.ingr_est=leer.next();
        }
    }
    
    public static void mostrar()
    {
        System.out.println(obj.nombre+" "+obj.apellido);
        System.out.println("numero de carnet: "+obj.num_carnet);
        System.out.println("la nota definitiva del estudiante es: "+obj.notdef);
    }
    
    public static void main(String[] args) {
       int ejercicio;
       String N_ejercicio="si";
        
       
        while("si".equals(N_ejercicio))
        {
                System.out.println("ingrese el ejercicio  que desea realizar: 1, 2, 3");
            ejercicio=leer.nextInt();
            switch(ejercicio)
            {
            case 1:
                Ejercicios.proceso();
                break;
            case 2:
                Ejercicios.calcular();
                break;
            default:

                System.out.println("ingreso un numero incorrecto");

                break;
            }
            
            System.out.println("desea realizar otro ejercicio: si, para uno nuevo; no, para terminar");
            N_ejercicio=leer.next();
        }
    }
}
