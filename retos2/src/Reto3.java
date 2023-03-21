public class Reto3 {

    /*CREAMOS UNA CLASE */
    public static void main(String[] args) {

        /*Programa que le permita simular un teclado de un computador con matrices []*/

        String[][] teclado = {
            {"Esc " ,"f1 " ,"f2 " ,"f3 " ,"f4 " ,"f5 " ,"f6 " ,"f7 " ,"f8 " ,"f9 " ,"f10 " ,"f11 " ,"f12 " ,"ImpPt " ,"Pausa " ,"Ins " ,"Supr " },
            {"1 " , "2 " , "3 " , "4 " , "5 " , "6 " , "7 " , "8 " , "9 " , "0 " , "? " , "¿ " ,"eliminar " ,"inicio " },
            {"Shif " ,"q " , "w " , "e " , "r " , "t " , "y " , "u " , "i " , "o " , "p " , "´¨ " , "+ " , "+ " , "Enter " , "Fin " },
            {"Bloq Mayus " ,"a " , "s " , "d " , "f " , "g " , "h " , "j " , "k " , "l " , "ñ " , "[  { " , " }  ] " , "RePag "},
            {"sup " , "<  >" ,"z " , "x" , "c " , "v " , "b " , "n " , "m " , " , " , " . " , " - " , "sup " , "flecha hacia arriba " , "AvPag " },
            {"Ctrl " , "Fn " , "Windows " , "Espacio " , "AltGr " , "Boton " , "flecha hacia la izquierda " , "flecha hacia abajo " , "fecha hacia la derecha "}
        };
/*Luego hacemos un for para validar correctamente su funcion */
        for (int i = 0; i < teclado.length; i++) {
            for (int j = 0; j < teclado[i].length; j++) {
                System.out.print(teclado[i][j]);
            }
        }
    }
}
