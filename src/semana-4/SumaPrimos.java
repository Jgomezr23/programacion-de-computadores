import java.util.Scanner;

/**
 * SumaPrimos.java
 *
 * Programa para la "Entrega Previa 2 - Semana 5" (ejercicio: Suma de números primos).
 * Lee un entero n (n >= 1) y calcula la suma de todos los números primos <= n.
 *
 * Uso:
 *   javac SumaPrimos.java
 *   java SumaPrimos
 *
 * El programa valida la entrada y maneja casos límite (n < 2 -> suma = 0).
 */
public class SumaPrimos {

    /**
     * Implementación del criba de Eratóstenes que devuelve la suma de primos <= n.
     * @param n límite superior (n >= 0)
     * @return suma (long) de todos los primos <= n
     */
    public static long sumaPrimosHasta(int n) {
        if (n < 2) return 0L;

        boolean[] esCompuesto = new boolean[n + 1]; // false -> potencial primo
        int limite = (int) Math.sqrt(n);
        for (int i = 2; i <= limite; i++) {
            if (!esCompuesto[i]) {
                // marcar múltiplos de i como compuestos
                for (int j = i * i; j <= n; j += i) {
                    esCompuesto[j] = true;
                }
            }
        }

        long suma = 0L;
        for (int i = 2; i <= n; i++) {
            if (!esCompuesto[i]) suma += i;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Suma de números primos <= n ===");
        System.out.print("Ingrese un número entero positivo n: ");
        // Validar entrada
        if (!sc.hasNextLong()) {
            System.out.println("Error: Debe ingresar un número entero. Programa terminado.");
            sc.close();
            return;
        }

        long nLong = sc.nextLong();
        if (nLong < 0) {
            System.out.println("Error: n debe ser un entero no negativo. Programa terminado.");
            sc.close();
            return;
        }
        if (nLong > Integer.MAX_VALUE) {
            System.out.println("Error: n es demasiado grande. Ingrese un valor <= " + Integer.MAX_VALUE);
            sc.close();
            return;
        }

        int n = (int) nLong;
        long suma = sumaPrimosHasta(n);
        System.out.println("La suma de todos los números primos menores o iguales a " + n + " es: " + suma);

        sc.close();
    }
}


