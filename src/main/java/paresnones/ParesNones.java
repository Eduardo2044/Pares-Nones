
package paresnones;

import java.util.Random;
import java.util.Scanner;

public class ParesNones {

    public static void main(String[] args) {
        
        //Creamos el Scanner
        Scanner teclado = new Scanner(System.in);
        
        //Variables
        int opcion;
        int dedosJ1;
        
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

            if (opcion != 3) {
                //Opcion 1
                if (opcion == 1) {
                    do {
                        //Pedimos el numero de dedos del J1 hasta que este en rango
                        System.out.println("¿Cuántos dedos vas a sacar? ");
                        dedosJ1 = teclado.nextInt();

                    } while (dedosJ1 < 0 || dedosJ1 > 10);

                    
                } else { //Opcion 2
                    
                }
              
            }

        } while (opcion != 3);
        
    }
    
}
