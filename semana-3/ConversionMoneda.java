import java.util.Scanner;

public class ConversionMoneda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("CONVERSIÓN DE MONEDA");
        System.out.println("--------------------");
        System.out.println("1. Convertir de Pesos a Dólares");
        System.out.println("2. Convertir de Dólares a Pesos");
        System.out.print("Seleccione una opción (1 o 2): ");
        opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese cantidad en pesos: ");
            double pesos = sc.nextDouble();
            System.out.println("Equivale a " + pesosADolares(pesos) + " dólares.");
        } else if (opcion == 2) {
            System.out.print("Ingrese cantidad en dólares: ");
            double dolares = sc.nextDouble();
            System.out.println("Equivale a " + dolaresAPesos(dolares) + " pesos.");
        } else {
            System.out.println("Opción inválida.");
        }

        sc.close();
    }

    private static final double TASA_DOLAR = 3968.24;

    public static double pesosADolares(double pesos) {
        return Math.round(pesos / TASA_DOLAR);
    }

    public static double dolaresAPesos(double dolares) {
        return Math.round(dolares * TASA_DOLAR);
    }
}
