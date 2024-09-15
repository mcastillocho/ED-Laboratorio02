package ucv.codelab;

public class Ejercicio04 {

    public static void iniciar() {
        // Pedir números al usuario
        System.out.println("""

                =========================
                Ejercicio número 04
                =========================
                            """);

        int n;
        do {
            System.out.print("Introduzca numero > 0: ");
            n = Main.sc.nextInt();
        } while (n <= 0);

        // Muestra el resultado en pantalla
        System.out.println("Ese número tiene " + contarCifras(n) + " cifras");
    }

    public static int contarCifras(int numero) {
        // Si el numero es menor que 10, deja de contar las cifras
        if (numero < 10)
            return 1;
        // Añade 1 a la cuenta y vuelve a ejecutar la función
        return 1 + contarCifras(numero / 10);
    }
}
