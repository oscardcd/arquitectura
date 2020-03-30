  
    package vectores;

import java.util.Scanner;

    public class Ej_matrix {
        
        
        public static int[][] matriz=new int[0][0];
        public static Scanner keyboard=new Scanner(System.in);
        
        public static void ibis1()
        {
              int[][] matriz1 = {{2, 3, 5, 4}, {4, 5, 6, 3}, {1, 2, 3, 6}, {4, 5, 6, 7}};

            for (int i = 0; i < 4; i++)
            {
                System.out.println(" ");
                for (int j = 0; j < 4; j++)
                {

                    System.out.print(matriz1[i][j]);
                }

            }
        }
         /*Crear una matriz 3X 2, con elementos ingresados por el usuario, imprima la matriz */
        public static void matriz3_2()
        {
           int f=3,c=2;
            Ej_matrix.matriz=new int[f][c];
            
            for (int i = 0; i < matriz.length; i++)
            {
                 for (int j = 0; j < matriz[0].length; j++)
                {
                    System.out.println("ingrese los elementos de la columna "+j+" de la fila "+i);
                    matriz[i][j]=keyboard.nextInt();
                }
                
            }
            for (int i = 0; i < matriz.length; i++)
            {
                System.out.println(" ");
                 for (int j = 0; j < matriz[0].length; j++)
                {
                    System.out.print(matriz[i][j]+" ");
                }
                
            }
        }
        
        public static void ibis3()
        {
            int matriz[][], n_filas, n_columnas, suma =0, a;
        Scanner entrada = new Scanner (System.in); 
        
        System.out.println("Ingrese el número de filas");
        n_filas = entrada.nextInt(); 
        System.out.println("Ingrese el número de columnas");
        n_columnas = entrada.nextInt(); 
        
        matriz = new int [n_filas][n_columnas]; 
        
        for (int i = 0; i < n_filas; i++){
            for (int j = 0; j < n_columnas; j++){
                System.out.println("matriz ["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt(); 
            
                suma += matriz[i][j];
                System.out.println("La suma es:" + suma); 
            }
        
        }  
        }
        
        /*Genere una matriz de 3 X 3 imprima los números mayores a 8  */
        public static void matriz3_3()
        {
            int f=3,c=3;
            
           Ej_matrix.matriz=new int[f][c];
           
            for (int i = 0; i < matriz.length; i++)
            {
                for (int j = 0; j < matriz[0].length; j++)
                {
                    System.out.println("ingrese los numeros para la fila "+i);
                    matriz[i][j]=keyboard.nextInt();
                }
            }
            for (int i = 0; i < matriz.length; i++)
            {
                System.out.println(" ");
                for (int j = 0; j < matriz[0].length; j++)
                {
                    if (matriz[i][j]>=8)
                    {
                        System.out.print(matriz[i][j]+" ");
                    }
                    if(matriz[i][j]<8)
                    {
                        matriz[i][j]=0;
                        
                         System.out.print(matriz[i][j]+" ");
                    }
                }
            } 
        }
        
        /*
        6. Genere una matriz 6 x 6. Realice los siguientes cálculos; 
        a. Promedio matriz b. Suma matriz c. Suma de la última fila 
        */
        public static void matriz6_6()
        {
            
            Scanner leer=new Scanner(System.in);
            int[][] matriz=new int[6][6];
            
            int prome,conta = 0,acumulador = 0,sumafila = 0;
            
            for (int i = 0; i < matriz.length; i++)
            {
              for (int j = 0; j < matriz[0].length; j++)
                {
                    System.out.println("ingrese el dato para asignar en la fila "+i+" en el espacio "+j);
                    matriz[i][j]= leer.nextInt();
                    
                     conta++;
                     acumulador= acumulador+matriz[i][j];
                     
                    sumafila=sumafila+matriz[5][j];
                }
            }
            
            for (int i = 0; i < matriz.length; i++)
            {
                System.out.println(" ");
                for (int j = 0; j < matriz[0].length; j++)
                {
                    System.out.print(matriz[i][j]+" ");
                }
                
            }
            
            prome=acumulador/conta;
            System.out.println(" ");
            System.out.println("el promedio de la matriz es: "+prome);
            System.out.println("la suma de la matriz es: "+acumulador);
            System.out.println("la suma de la ultima fila es: "+sumafila);
        }
         public static void ibis5()
         {
              int matriz[][] = new int [5][5], suma_filas;
        
        Scanner teclado = new Scanner (System.in);
        
        for (int i= 0; i< 5; i++){
            for (int j= 0; j< 5; j++ ){
                System.out.print("Ingrese los números ["+i+"]["+j+"]");
                matriz[i][j] = teclado.nextInt();
                
            }
        }
        for (int i= 0; i< 5; i++){
            suma_filas=0;
            for (int j= 0; j<5; j++){
                suma_filas += matriz[i][j]; 
           
            }
            System.out.println("/n la suma de la fila ["+i+"] es:" + suma_filas);
        
        }
         }
        /*8. Genere dos matrices A y B de igual tamaño. Sume las dos matrices */
        
        public static void matrizA_B()
        {
            int f=0,c=0,sumMa=0,sumMb=0, sumAB;
            
            System.out.print("ingrese el valor para las filas de las matrices: ");
            f=keyboard.nextInt();
            
            System.out.print("ingrese el valor para las columnas de las matrices: ");
            c=keyboard.nextInt();
            
            int[][] mA=new int[f][c];
            int[][] mB=new int[f][c];
            
            System.out.println("ingrese los numeros para la matriz A");

            for (int i = 0; i < mA.length; i++)
            {
                for (int j = 0; j < mA[0].length; j++)
                {
                    System.out.println( "num f: "+i+" c: "+j);
                    mA[i][j]= keyboard.nextInt();
                    sumMa=sumMa+mA[i][j];
                    
                }
                
            }
            System.out.println("ingrese los numeros para la matriz B");
            for (int i = 0; i < mB.length; i++)
            {
                for (int j = 0; j < mB[0].length; j++)
                {
                    System.out.println( "num f: "+i+" c: "+j);
                    mB[i][j]= keyboard.nextInt();
                    sumMb=sumMb+mB[i][j];
                    
                }
            }
            sumAB=sumMa+sumMb;
            
            System.out.println(" la suma de las matrices es: "+sumAB);
            
        }
        public static void ibis7()
        {
             Scanner entrada = new Scanner (System.in); 
        int matriz [][] = new int [3][3]; 
        
        System.out.println("Digite la matriz");
        for (int i= 0; i< 3; i++){
            for (int j=0; j< 3; j++){
                System.out.println("Matriz ["+i+"]["+j+"]:");
                matriz[i][j] = entrada.nextInt(); 
            
            }
        
        }int aux; 
                for (int i= 0; i< 3; i++){
                    for (int j= 0; j< i; j++){
                        aux = matriz[i][j];
                        matriz[i][j] = matriz[j][i];
                        matriz[j][i]= aux; 
                    
                    }
                
                }System.out.println("/n La matriz transpuesta es:");
                for(int i=0; i<3; i++){
                    for(int j=0;j<3;j++){ 
                        System.out.println(matriz[i][j]+" ");
                    
                    }
                    System.out.println("");
                
                }
        
        }
        //Se tiene una matriz n X m ingresada por el usuario. Averiguar si es cuadrada  
        public static void nXm()
        {

            int n = 0, m = 0;

            System.out.print("ingrese el numero de  filas para la matriz: ");
            n = keyboard.nextInt();

            System.out.print("ingrese el numero de columnas: ");
            m = keyboard.nextInt();

            int[][] Mnxm = new int[n][m];

            for (int i = 0; i < Mnxm.length; i++)
            {
                for (int j = 0; j < Mnxm[0].length; j++)
                {
                    System.out.println("ingrese los valores da la matriz");
                    Mnxm[i][j] = keyboard.nextInt();
                }
            }

            if (Mnxm.length == Mnxm[0].length)
            {
                for (int i = 0; i < Mnxm.length; i++)
                {
                    for (int j = 0; j < Mnxm[0].length; j++)
                    {
                        System.out.println(Mnxm[i][j]);

                    }
                }
            }
        }
        
        public static void ibis9()
        {
              int[][] matriz1 = {{2, 3, 5, 4}, {4, 5, 6, 3}, {1, 2, 3, 6}, {4, 5, 6, 7}};

            for (int i = 0; i < 4; i++)
            {
                System.out.println(" ");
                for (int j = 0; j < 4; j++)
                {

                    System.out.print(matriz1[i][j]);
                }

            }
        }
        
        public static void ibis11() {
            Scanner entrada = new Scanner(System.in);

            int matriz[][] = new int[3][3];

            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    System.out.println("Ingrese un número [" + i + "][" + j + "]");
                    matriz[i][j] = entrada.nextInt();

                    if (matriz[i][j] != 0)
                    {
                        System.out.println("La matriz no es nula");
                    }
                }
            }
        }
        public static void main(String[] args) 
        {
            
            Ej_matrix.nXm();
        }

    
}
