package ucv.codelab;

public class Ejercicio01 {

    public static void iniciar() {
        // Pedir números al usuario
        System.out.println("""

                =========================
                Ejercicio número 01
                =========================
                            """);

        int n;
        do {
            System.out.print("Introduzca numero > 0: ");
            n = Main.sc.nextInt();
        } while (n < 0);

        // Imprime los datos en pantalla
        System.out.println();
        System.out.print("Binario: ");
        decBin(n);
        System.out.println();
    }

    public static void decBin(int n) {
        // Si el numero es menor que 2, ya está en binario
        if (n < 2) {
            System.out.print(n);
            return;
        }
        // Si es mayor, ejecuta nuevamente con la mitad del valor e imprime el residuo
        decBin(n / 2);
        System.out.print(n % 2);
        return;
    }
}
