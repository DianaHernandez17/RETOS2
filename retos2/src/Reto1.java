import java.util.*;
public class Reto1 {
    /*CREAMOS UNA CLASE */

    public static void main(String[] args) {

        /* INSTANCIAMOS UN CLASE */

        

        /*Programa que solicite la cantidad de notas a evaluar en una materia y el valor de cada dichas nochas
         * calcule el promedio de esas notas para obtener la nota final y agregre lo siguiente:
         * si la nota es menor que 3 REPROBASTE
         * Si la nota está entre 3 y 4.0 PASASTE RASPANDO
         * Si la nota es mayor que 4.0 APROBASTE con buenos resultados*/
        
        Scanner Lectura= new Scanner(System.in);

         /*DECLARACION DE VARIABLES */


        System.out.print("INGRESE LA CANTIDAD DE NOTAS A EVALUAR: ");
        int cantidadNotas = Lectura.nextInt();
        /*En este caso utilice un arrays se identifican de [] */

        double[] notas = new double[cantidadNotas];
        double suma = 0.0;

        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("INGRESE LA NOTA:" + (i+1) + ": ");
            notas[i] = Lectura.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / cantidadNotas;

        String resultado;

        if (promedio <3.0) {
            resultado= "USTED REPROBO LA MATERIA";
        } else if (promedio <4.0) {
            resultado = "PASASTE LA MATERIA RASPANDO";
        } else {
            resultado = "APROBASTE LA MATERIA CON BUENOS RESULTADOS, ¡FELICITACIONES!";

            System.out.println("TÚ NOTA FINAL ES DE: " + promedio + ". " +resultado);
        }

        Lectura.close();

       
    } 
}


    

         

      

       
              
       
   

    





