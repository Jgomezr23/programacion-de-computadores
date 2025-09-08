import java.util.Scanner;

public class Siglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anho = -1;

        do {
            System.out.print("Ingrese un año positivo: ");
            if (!sc.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor ingrese un número entero positivo.");
                sc.next();
                continue;
            }
            anho = sc.nextInt();
            if (anho <= 0) {
                System.out.println("El año debe ser mayor que cero. Intente de nuevo.");
            }
        } while (anho <= 0);

        int numSiglo = siglo(anho);
        int primerAnhoSiglo = primer_anho(numSiglo);

        System.out.println();
        System.out.println("Resultados:");
        System.out.println("-----------");
        System.out.println("Año ingresado: " + anho);
        System.out.println("Pertenece al siglo: " + numSiglo);
        System.out.println("Primer año del siglo " + numSiglo + ": " + primerAnhoSiglo);

        sc.close();
    }

    public static int siglo(int anho) {
        if (anho <= 0) {
            throw new IllegalArgumentException("El año debe ser un entero positivo.");
        }
        return ((anho - 1) / 100) + 1;
    }

    public static int primer_anho(int siglo) {
        if (siglo <= 0) {
            throw new IllegalArgumentException("El siglo debe ser un entero positivo.");
        }
        return (siglo - 1) * 100 + 1;
    }
}
