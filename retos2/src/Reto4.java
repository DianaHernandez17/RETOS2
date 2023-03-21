import java.util.*;
public class Reto4 {
/*CREAMOS UNA CLASE */

        public static void main(String[] args) {
            int a,suma=0;

             /* INSTANCIAMOS UN CLASE */
             
             /*Programa que haga la simulacion de un sudoku mostrar la suma de todos su lados filas y columnas. */
            Scanner lectura=new Scanner(System.in);

            /*SOLICITAMOS LOS DATOS */


        System.out.print("INGRESE LA CANTIDAD DE FILAS Y COLUMNAS: ");
        a=lectura.nextInt();

        /*INSTANCIAMOS */
        int[][] sudoku = new int[a][a];

        
        System.out.println("INGRESE LOS VALORES QUE DESEA ALMACENAR EN EL SUDOKU:");
        for (int i=0; i<a; i++) {
            for (int x=0; x<a; x++) {
                sudoku[i][x] = lectura.nextInt();
            }
        }
        System.out.println("LO QUE ALMACENA EN EL SUDOKU ES:");
        for (int i=0; i<a; i++) {
            for (int x=0; x<a; x++) {
                System.out.print(sudoku[i][x] + " ");
            }
            System.out.println();
            }
        for(int i=0;i<a;i++){
            for (int x=0; x<a; x++) {
                suma += +sudoku[i][x];
            System.out.println("LA SUMA DE TODOS LOS LADOS ES: "+suma);
            }
        }
           lectura.close();
        } 
        }

