package ucv.codelab;

public class Ejercicio02 {

    public static void iniciar() {
        // Pedir números al usuario
        System.out.println("""

                =========================
                Ejercicio número 02
                =========================
                            """);
        int n1, n2;
        System.out.print("Introduzca dividendo: ");
        n1 = Main.sc.nextInt();
        do {
            System.out.print("Introduzca divisor (>0): ");
            n2 = Main.sc.nextInt();
        } while (n2 <= 0);

        // Imprime los datos en pantalla usando los valores obtenidos
        System.out.printf("%d/%d = %d %n", n1, n2, cociente(n1, n2));
    }

    public static int cociente(int a, int b) {
        // Si el dividendo es menor que el divisor finaliza las restas
        if (a < b)
            return 0;
        // Caso contrario el cociente aumenta en 1 y se disminuye el valor del divisor
        // al dividendo en la siguiente vuelta
        return 1 + cociente(a - b, b);
    }
}
