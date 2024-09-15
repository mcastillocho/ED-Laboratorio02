package ucv.codelab;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                INGRESE EL EJERCICIO A EJECUTAR
                ================================
                Ejercicio01  [ 1 ]
                Ejercicio02  [ 2 ]
                Ejercicio03  [ 3 ]
                Ejercicio04  [ 4 ]
                Ejercicio05  [ 5 ]
                """);
        int opcion;
        do {
            System.out.print("Introduzca el numero de un ejercicio: ");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 5);

        switch (opcion) {
            case 1:
                Ejercicio01.iniciar();
                break;
            case 2:
                Ejercicio02.iniciar();
                break;
            case 3:
                Ejercicio03.iniciar();
                break;
            case 4:
                Ejercicio04.iniciar();
                break;
            case 5:
                Ejercicio05.iniciar();
                break;
        }
        System.out.println("Programa finalizado.\nAdios.");
    }
}