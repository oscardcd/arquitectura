/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.util.Scanner;

/**
 *
 * @author OSCAR
 */
public class Vectores {

   

    public static void ejercicioejem()
    {
        Scanner leer=new Scanner(System.in);
        
        int vector[]=new int[3];
        
        
        for(int i=0; i< vector.length;i++)
        {
            System.out.println("ingrese un numero");
            vector[i]=leer.nextInt();
        }
        
        System.out.println(" ");
        
        for(int i=0; i> vector.length;i++)
        {
            
        }
    }
    
    public static void ejerciciopro()
    {
        //calcular el promedio de un vector tipo entero de n elementos
        
        int n=0,acumuval=0;
        double promedio;
        
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("ingrese el numero de elementos del vector");
        n=teclado.nextInt();
        int[] vector1=new int[n];
        
        for(int i=0;i<vector1.length;i++)
        {
            System.out.println("ingrese un valor para el espacio: "+i);
            vector1[i]=teclado.nextInt();
            acumuval=acumuval+vector1[i];
  
        }
        promedio=acumuval/n;
        
        System.out.println("el promedio de elementos del vector es: "+promedio);

    }
    
    //listar el resto de filas, listar el resto de colunas
    
    
    public static void ejercicio1()
    {
        //Lea un vector de N elementos y luego imprima la suma de ellos
        
       int n,suma;

    }
    
    public static void ejemplo()
    {
         //declarar vecto
        
        
       
        
        int vector[];
        //declarando el tamaño del vector
        vector=new int[3];
        
        //declaramos y damos tamaño
        
       
        double[] numeros;
        String[] nombres;
                
             
         int[] vector2=new int[6];
         
         
         int[] nomvect= new int[9];
                 
         String[] vec4=new String[3];
        vector2[0]=8;
        vector2[1]=52;
        vector2[2]=234;
        vector2[3]=36;
        vector2[4]=386;
        vector2[5]=346;
        
        double[] vec3=new double[100];
        
        vec3[100]=3;
        vec3[774]=2;
        vec3[2]=1;
        vec3[3]=1;
        vec3[4]=1;
        vec3[5]=1;
        vec3[9]=25;
        vec3[68]=545;
        
        
      
        
        
         
       // System.out.println(vector2[1]);
        
        int[] vector3={21,25,65,87};
        // length nos da el tamaño del vector
        
        System.out.println(vector2[4]);
    }
    public static void main(String[] args) {
       
        Vectores.ejerciciopro();
        
    }
    
}
