
package paresnones;

import java.util.Random;
import java.util.Scanner;

public class ParesNones {

    public static void main(String[] args) {
        
        //Creamos el Scanner
        Scanner teclado = new Scanner(System.in);
        
        //Variables
        int opcion;
        
        //Bucle que repita el programa hasta que el usuario decida salir
        do {
            //Menu
            do {
                System.out.println("¿Quiere jugar contra otro jugador "
                        + "o contra la maquina?");
                System.out.println("<----------------------------------------->");
                System.out.println("1.Otro jugador");
                System.out.println("2.Máquina");
                System.out.println("3.Salir");

                opcion = teclado.nextInt();

            } while (opcion < 1 || opcion > 3);


        } while (opcion != 3);
        
    }
    
}
