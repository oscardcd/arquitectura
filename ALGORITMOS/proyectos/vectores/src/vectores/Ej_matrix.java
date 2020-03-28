  
    package vectores;

import java.util.Scanner;

    public class Ej_matrix {
        
        
        public static int[][] matriz=new int[0][0];
        public static Scanner keyboard=new Scanner(System.in);
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
        public static void ejemplo()
        {
            int[][] matriz=new int [3][2];

            matriz[0][0]=6;
            matriz[0][1]=12;

            matriz[1][0]=16;
            matriz[1][1]=20;

            matriz[2][0]=50;
            matriz[2][1]=30;

            int[][] matriz1={{20,10,99},{60,80,21},{40,78,22}};

                System.out.println(matriz1.length);
                System.out.println("");
                System.out.println("Tamano de la columna");
                System.out.println(matriz1[0].length);
                System.out.println("");

                for (int i=0;i<matriz1.length;i++){
                    System.out.println("");
                    for (int j=0;j<matriz1[i].length;j++){
                        System.out.print(matriz1[i][j]+" ");

                    }
                }

                // listar primera fila
                System.out.println("");
                System.out.println("");
                for (int i=0;i<matriz1[0].length;i++){
                    System.out.print(matriz1[0][i]+" ");

                }

                // listar primera columna
                System.out.println("");
                System.out.println("Lista de la primera columna");
                for (int i=0;i<matriz.length;i++){
                    System.out.println(matriz1[i][0]);


                }
                 
               
                /*TAREA 
                1 listar el resto de filas. 
                2 listar el resto de columnas
                3 sumar fila por fila
                4 sumar cada columna
                5 sumar toda la matriz
                6 listar la diagonal
                7 listar la diagonal inversa
                8. sumar la diagonal
                */

        }


        public static void main(String[] args) {
            
            Ej_matrix.nXm();
        }

    
}
