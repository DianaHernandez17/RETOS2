import java.util.*;

public class Reto2 {
    public static void main(String[]args) {

        int jugador;
        int tiempo=0;
        double resultado;
        int i=0;

        Scanner Lectura = new Scanner(System.in);

    
    
        do{
           
        System.out.println("Por favor ingrese el número de jugadores para la competencia");
        jugador=Lectura.nextInt();
        
        System.out.println("Por favor digite el tiempo final más corto del jugador para saber el ganador");
        tiempo=Lectura.nextInt();
        

        resultado=jugador+tiempo;

        System.out.println("El tiempo final más corto del jugador es:"+tiempo);

        System.out.println("El ganador es:"+jugador);
    i++;

    }while(i<=1);

Lectura.close();
 
 System.out.println("El ganador es:"+jugador+"Su tiempo es:"+tiempo+"El resultado final es:"+resultado);
 
    }
}