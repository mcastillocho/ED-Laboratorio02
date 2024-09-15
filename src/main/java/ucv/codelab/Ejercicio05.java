package ucv.codelab;

public class Ejercicio05 {

    public static void iniciar() {
        // Pedir números al usuario
        System.out.println("""

                =========================
                Ejercicio número 05
                =========================
                            """);

        int n;
        do {
            System.out.print("Introduzca numero > 0: ");
            n = Main.sc.nextInt();
        } while (n <= 0);

        System.out.println("La suma de 1 hasta " + n + " es " + suma(n));
    }

    public static int suma(int numero) {
        // Si es 1, lo retorna y finaliza la recursividad
        if (numero == 1)
            return 1;
        // Retorna el número actual + la función con el numero anterior como parámetro
        return numero + suma(--numero);
    }
}
