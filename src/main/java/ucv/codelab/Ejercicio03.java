package ucv.codelab;

public class Ejercicio03 {

    public static void iniciar() {
        // Pedir números al usuario
        System.out.println("""

                =========================
                Ejercicio número 03
                =========================
                            """);
        int n1, n2;
        System.out.print("Introduzca dividendo: ");
        n1 = Main.sc.nextInt();
        do {
            System.out.print("Introduzca divisor (>0): ");
            n2 = Main.sc.nextInt();
        } while (n2 <= 0);
        //Muestra el resultado en pantalla
        System.out.printf("%d/%d %% %d %n", n1, n2, residuo(n1, n2));
    }

    public static int residuo(int a, int b) {
        // Si el dividendo es mayor o igual que el divisor, continua restando
        if (a >= b)
            return residuo(a - b, b);
        // Caso contrario, el numero restante es el residuo
        return a;
    }
}
