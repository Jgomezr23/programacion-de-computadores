package Semana_7;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Programa para calcular la mediana de un arreglo de números reales
 * Politécnico Grancolombiano - Programación de Computadores
 * Entrega Final - Semana 7
 *
 * La mediana es el valor que se encuentra en la posición central de un
 * conjunto de datos ordenados. Si el conjunto tiene un número par de elementos,
 * la mediana es el promedio de los dos valores centrales.
 *
 * @author [TU NOMBRE COMPLETO]
 * @author [Nombre Compañero 2 - si aplica]
 * @author [Nombre Compañero 3 - si aplica]
 * @version 1.0
 * @date Octubre 2025
 */
public class Mediana {

    /**
     * Método principal que ejecuta el programa de cálculo de mediana
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // ENTRADA: Declaración de variables y lectura de datos
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();

        // Declarar el arreglo de números reales con el tamaño especificado
        double[] x = new double[n];

        // Solicitar al usuario que ingrese cada elemento del arreglo
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            x[i] = sc.nextDouble();
        }

        // PROCESO: Calcular la mediana
        // Paso 1: Ordenar el arreglo de menor a mayor
        Arrays.sort(x);

        // Mostrar el arreglo ordenado para verificación
        System.out.println("\nArreglo ordenado: " + Arrays.toString(x));

        // Variable para almacenar el resultado de la mediana
        double mediana;

        // Paso 2: Determinar si el número de elementos es par o impar
        if (n % 2 == 0) {
            // Si es par: mediana es el promedio de los dos elementos centrales
            // Posiciones: n/2-1 y n/2
            mediana = (x[n/2 - 1] + x[n/2]) / 2.0;
        } else {
            // Si es impar: mediana es el elemento central
            // Posición: n/2
            mediana = x[n/2];
        }

        // SALIDA: Mostrar el resultado
        System.out.println("\n========================================");
        System.out.println("RESULTADO:");
        System.out.println("========================================");
        System.out.println("Cantidad de elementos: " + n);
        System.out.println("La mediana es: " + mediana);
        System.out.println("========================================");

        // Cerrar el objeto Scanner para liberar recursos
        sc.close();
    }
}