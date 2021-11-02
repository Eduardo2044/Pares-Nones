package paresnones;

import java.util.Random;
import java.util.Scanner;

public class ParesNones {

    public static void main(String[] args) {

        //https://github.com/Eduardo2044/Pares-Nones
        //Creamos el Scanner
        Scanner teclado = new Scanner(System.in);

        //Variables
        int opcion;
        int dedosJ1;
        int dedosJ2;
        int aux; // Variable auxiliar para calculos
        String J1;
        String J2;
        
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

            switch (opcion) { //Bucle que repita el programa hasta que el usuario decida salir
                case 1:
                    do {
                        System.out.println("Jugador 1");
                        teclado.nextLine();
                        //Preguntamos si quiere ser pare o none
                        System.out.println("Elige pare o none: ");
                        J1 = teclado.nextLine();
                        if (J1.equalsIgnoreCase("pare")) {
                            J1 = "pare";
                            J2 = "none";
                        } else {
                            J1 = "none";
                            J2 = "pare";
                        }
                        //Pedimos el numero de dedos del J1 hasta que este en rango
                        System.out.println("¿Cuántos dedos vas a sacar? ");
                        dedosJ1 = teclado.nextInt();

                    } while (dedosJ1 < 0 || dedosJ1 > 10);

                    do {
                        System.out.println("Jugador 2");
                        //Pedimos el numero de dedos del J2 hasta que este en rango
                        System.out.println("¿Cuántos dedos vas a sacar? ");
                        dedosJ2 = teclado.nextInt();

                    } while (dedosJ2 < 0 || dedosJ2 > 10);

                    //Empezamos a resolver
                    aux = dedosJ1 + dedosJ2;
                    if (aux % 2 == 0) {
                        if (J1.equalsIgnoreCase("pare")) {
                            System.out.println("Ha ganado el J1.");
                        } else {
                            System.out.println("Ha ganado el J2.");
                        }
                    } else {
                        if (J1.equalsIgnoreCase("pare")) {
                            System.out.println("Ha perdido el J1.");
                        } else {
                            System.out.println("Ha perdido el J2.");
                        }
                    }
                    break;
                case 2:
                    do {
                        System.out.println("Jugador 1");
                        teclado.nextLine();
                        //Preguntamos si quiere ser pare o none
                        System.out.println("Elige pare o none: ");
                        J1 = teclado.nextLine();
                        if (J1.equalsIgnoreCase("pare")) {
                            J1 = "pare";
                            J2 = "none";
                        } else {
                            J1 = "none";
                            J2 = "pare";
                        }
                        //Pedimos el numero de dedos del J1 hasta que este en rango
                        System.out.println("¿Cuántos dedos vas a sacar? ");
                        dedosJ1 = teclado.nextInt();

                    } while (dedosJ1 < 0 || dedosJ1 > 10);

                    System.out.println("La máquina elige un número de dedos");
                    //Generamos un numero aleatorio
                    Random aleatorio = new Random();
                    dedosJ2 = aleatorio.nextInt(10);
                    System.out.println("La máquina ha elegido: " + dedosJ2 + " dedos.");

                    //Empezamos a resolver
                    aux = dedosJ1 + dedosJ2;
                    if (aux % 2 == 0) {
                        if (J1.equalsIgnoreCase("pare")) {
                            System.out.println("Ha ganado el J1.");
                        } else {
                            System.out.println("Ha ganado la máquina.");
                        }
                    } else {
                        if (J1.equalsIgnoreCase("pare")) {
                            System.out.println("Ha perdido el J1.");
                        } else {
                            System.out.println("Ha perdido la máquina.");
                        }
                    }
                    break;
                case 3:
                    break;
            }
        } while (opcion != 3);
    }
}

//                //Opcion 1
//                if (opcion == 1) {
//                    do {
//                        System.out.println("Jugador 1");
//                        teclado.nextLine();
//                        //Preguntamos si quiere ser pare o none
//                        System.out.println("Elige pare o none: ");
//                        J1 = teclado.nextLine();
//                        if(J1.equalsIgnoreCase("pare")){
//                            J1 = "pare";
//                            J2 = "none";
//                        }else{
//                            J1 = "none";
//                            J2 = "pare";
//                        }
//                        //Pedimos el numero de dedos del J1 hasta que este en rango
//                        System.out.println("¿Cuántos dedos vas a sacar? ");
//                        dedosJ1 = teclado.nextInt();
//
//                    } while (dedosJ1 < 0 || dedosJ1 > 10);
//
//                    do {
//                        System.out.println("Jugador 2");
//                        //Pedimos el numero de dedos del J2 hasta que este en rango
//                        System.out.println("¿Cuántos dedos vas a sacar? ");
//                        dedosJ2 = teclado.nextInt();
//
//                    } while (dedosJ2 < 0 || dedosJ2 > 10);
//                    
//                    //Empezamos a resolver
//                    aux = dedosJ1 + dedosJ2;
//                    if(aux%2==0){
//                        if(J1.equalsIgnoreCase("pare")){
//                            System.out.println("Ha ganado el J1.");
//                        }else{
//                            System.out.println("Ha ganado el J2.");
//                        }
//                    }else{
//                        if(J1.equalsIgnoreCase("pare")){
//                            System.out.println("Ha perdido el J1.");
//                        }else{
//                            System.out.println("Ha perdido el J2.");
//                        }
//                    }
//                    
//                } else { //Opcion 2
//                    
//                    do {
//                        System.out.println("Jugador 1");
//                        teclado.nextLine();
//                        //Preguntamos si quiere ser pare o none
//                        System.out.println("Elige pare o none: ");
//                        J1 = teclado.nextLine();
//                        if(J1.equalsIgnoreCase("pare")){
//                            J1 = "pare";
//                            J2 = "none";
//                        }else{
//                            J1 = "none";
//                            J2 = "pare";
//                        }
//                        //Pedimos el numero de dedos del J1 hasta que este en rango
//                        System.out.println("¿Cuántos dedos vas a sacar? ");
//                        dedosJ1 = teclado.nextInt();
//
//                    } while (dedosJ1 < 0 || dedosJ1 > 10);
//                    
//                    System.out.println("La máquina elige un número de dedos");
//                    //Generamos un numero aleatorio
//                    Random aleatorio = new Random();
//                    dedosJ2 = aleatorio.nextInt(10);
//                    System.out.println("La máquina ha elegido: " + dedosJ2 + " dedos.");
//                    
//                    //Empezamos a resolver
//                    aux = dedosJ1 + dedosJ2;
//                    if(aux%2==0){
//                        if(J1.equalsIgnoreCase("pare")){
//                            System.out.println("Ha ganado el J1.");
//                        }else{
//                            System.out.println("Ha ganado la máquina.");
//                        }
//                    }else{
//                        if(J1.equalsIgnoreCase("pare")){
//                            System.out.println("Ha perdido el J1.");
//                        }else{
//                            System.out.println("Ha perdido la máquina.");
//                        }
//                    }
//                }
//              
//            }
//
//        } while (opcion != 3);
//        
//    }

