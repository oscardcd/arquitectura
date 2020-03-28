
package vectores;

import java.util.Scanner;

public class Ej_vectores 
{
    public static Scanner leer=new Scanner(System.in);
    
    public static void Iejer1()
    {
        int nelementos;
        double resultado = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número de elementos");
        nelementos = entrada.nextInt();

        double sumar[] = new double[nelementos];

        for (int i = 0; i < nelementos; i++)
        {

            System.out.println("Digite un número");
            sumar[i] = entrada.nextInt();
        }

        for (int i = 0; i < nelementos; i++)
        {

            resultado = sumar[i] + resultado;
        }
        System.out.println("La suma de los números ingresados es:" + resultado);
    }
    
    public static void max100()
    {
/*Lea un vector de N elementos para un vector máximo de 100. Si el numero
de elementos ingresado es mayor al vector o menor a 0, debe mostrar un mensaje
que supero el vector o que es un numero negativo. Liste el vector en caso de 
estar dentro del máximo */
    
        int numero,n=100,i = 0;
          
             int[] vector=new int[n];
        
        String ingresar="+";
        
        
        while ( "+".equals(ingresar)) {
          
            System.out.println("ingrese un numero: ");
            numero = leer.nextInt();
            vector[i]=numero;
            if (vector[i] < 0) {
                System.out.println("el numero ingresado es negativo");
            } 
            else 
            {
                
                if (vector.length > 100) {
                    System.out.println("el numero de elementos llego al limite de 100");
                    for (int j = 0; j < vector.length; j++) 
                    {
                        System.out.println(vector[j]);
                    }
                }
            }
            
            i++;
            System.out.println("quiere ingresar otro numero + para si, - para no");
            ingresar=leer.next();

        }
        System.out.println("los valores del vector son: ");
        for (int j = 0; j < vector.length; j++) 
        {
            if (vector[j]!=0) 
            {
                System.out.println(vector[j]);    
            }
        }
    }
    public static void Iejer3()
    {
        int nelementos, cont_pares = 0, cont_impares = 0;
        double suma_pares = 0, suma_impares = 0, acum_ele = 0, prom_pares, prom_impares, prom_ele;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número de elementos");
        nelementos = entrada.nextInt();

        double vector[] = new double[nelementos];
        for (int i = 0; i < nelementos; i++)
        {

            System.out.println("Ingrese un número");
            vector[i] = entrada.nextInt();
            acum_ele = vector[i] + acum_ele;

            if (vector[i] % 2 == 0)
            {
                suma_pares = vector[i] + suma_pares;
                cont_pares = cont_pares + 1;
            } else
            {
                suma_impares = vector[i] + suma_impares;
                cont_impares = cont_impares + 1;
            }
        }
        prom_ele = acum_ele / nelementos;
        prom_pares = suma_pares / cont_pares;
        prom_impares = suma_impares / cont_impares;

        System.out.println("La suma de los pares:" + suma_pares);
        System.out.println("La suma de los impares" + suma_impares);
        System.out.println("El promedio de los elementos:" + prom_ele);
        System.out.println("Promedio de los pares" + prom_pares);
        System.out.println("El promedio de los impares" + prom_impares);

    }
    /* Lea un vector de N elementos y luego imprima cuantos y cuales elementos son múltiplos de 6  */
    public static void mult6()
    {
        int n,cont6=0,mult6;
        
        System.out.println("ingrese el numero de elementos que quiere para el vector");
        n=leer.nextInt();
        
        
        int[] numeros=new int[n];
        
        for (int i = 0; i < numeros.length; i++) 
        {
            System.out.println("ingrese un elemento: ");
            
            numeros[i]=leer.nextInt();
            
            if (numeros[i]%6==0) 
            {
               cont6++;
            }
        }
        System.out.println("el nmero de multiplos es: "+cont6);
        
        for (int j = 0; j < numeros.length; j++) 
        {
          if (numeros[j]%6==0) 
            {
            System.out.print( numeros[j]+"  ");
            }
        }
    }
    
    public static void Iejer5()
    {
    int mayor=0, posicion=0;
        
        Scanner entrada = new Scanner (System.in);
        
        int vector []= new int [20];
        
        for (int i=0; i<20; i++){
            
            System.out.println("Ingrese un número");
            vector [i]= entrada.nextInt(); 
            
            if (vector [i]>mayor){
                
                mayor = vector[i];
                posicion = i; 
            }
            
        }
        System.out.println("El número mayor es:" + mayor);
        System.out.println("La mayor posición es:" + posicion);
        
    }
    /* Dado el vector A de dimensión 1000 imprimir el menor y el mayor valor, 
        indicando su ubicación dentro del arreglo. */
    
    
        
    public static void maymen()
    {   
        int valor,mayval=0,menval=0,ubi=0,ubic=0;
        int[] vectorA=new int[1000];
        
        for (int i = 0; i < vectorA.length; i++) 
        {
            System.out.println("ingrese valores para el vector");
            
            vectorA[i]=leer.nextInt();
            
            if(mayval<vectorA[i])
            {
                mayval=vectorA[i];
                ubi=i;
            }
            else{
            if ( menval<vectorA[i]*(-1)) 
            {
                menval=vectorA[i];
                ubic=i;
            }
            }
            System.out.println("el valor mayor es: "+mayval+" y su ubicacion es: "+ubi);
            System.out.println("el valor menor es: "+menval+" y su ubicacion es: "+ubic);
           
        }
       
        
    }
    
    /*Vector con 10 números enteros.  Mostrar la suma de los valores en las 
    posiciones pares.  Mostrar al final la lista de los números pares. */
    
    public static void enteros()
    {
        int suma = 0;
        int[] vector=new int[10];
        
        for (int i = 0; i < 10; i++) 
        {
        System.out.println("ingrese un valor: ");
            vector[i]=leer.nextInt();
            
            if(i%2==0)
            {
                suma=suma+vector[i];
            }
                
        }
        
        System.out.println("la suma de las pocisiones pares es: "+suma);
        
        System.out.println("la lista de los numeros pares es");
        
        for (int j = 0; j < 10; j++) 
        {
            if (vector[j]%2==0) 
            {
                System.out.println(vector[j]);
            }
        }
    }
    
    /*Diseñar un programa que permita cargar los nombres de 5 personas y sus 
    sueldos respectivos. Mostrar el sueldo mayor y el nombre del empleado.
    */
    public static void sueldos()
    {
        int maysueldo=0;
        String[] nombre=new String[5];
        String maynombre = null;
        int[] sueldo=new int[5];
        
        for (int i = 0; i < 5; i++)
        {
            System.out.print("ingrese su nombre: ");
            nombre[i]=leer.next();
            
            System.out.print("ingrese su sueldo: ");
            sueldo[i]=leer.nextInt();
            
            if(sueldo[i]>maysueldo)
            {
                maysueldo=sueldo[i];
                maynombre=nombre[i];
            }
            
        }
        System.out.println("la persona con mayor sueldo es: "+maynombre+" y su sueldo es: "+maysueldo);
        
    }

    public static void main(String[] args) 
    {
        String ejercicio = "";
        System.out.print("ingrese el ejercicio que quiere realizar: "
                + "\n*Iejer1\n*max100\n*Iejer3\n*mult6\n*Iejer5\n*maymen\n*enteros\n*sueldos\n-");
        ejercicio=leer.next();
        
        switch(ejercicio)
        {
            case "Iejer1":
            {
                Ej_vectores.Iejer1();
            }
                break;
            case "max100":
            {
              Ej_vectores.max100();
            }
                break;
            case "Iejer3":
            {
                Ej_vectores.Iejer3();
            }
            break;
            case "mult6":
            {
                Ej_vectores.mult6();
            }
                break;
            case "Iejer5":
            {
                Ej_vectores.Iejer5();
            }
            case "maymen":
            {
                Ej_vectores.maymen();
            }
             break;
            case "enteros":
            {
                Ej_vectores.enteros();
            }
                break;
            case "sueldos":
            {
                Ej_vectores.sueldos();
            }
                break;
            default:
                System.out.println("ingreso algo incorrecto");
                break;
        }
    }
}
