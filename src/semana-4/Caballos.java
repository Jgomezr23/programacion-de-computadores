import java.util.Scanner;

/**
 * Caballos.java
 *
 * Solución para el ejercicio "Caballos" (Entrega Previa 2 - Semana 5).
 *
 * El programa:
 *  - Implementa el método 'atacaCaballo' que determina si un caballo en (fila_cab, col_cab)
 *    ataca a un rey en (fila_rey, col_rey).
 *  - Pide al usuario las posiciones (fila, columna) para caballo y rey (valores 1..8).
 *  - Valida la entrada y muestra un mensaje indicando si el rey está atacado.
 *
 * Uso:
 *   javac Caballos.java
 *   java Caballos
 */
public class Caballos {

    /**
     * Determina si un caballo en (fila_cab, col_cab) ataca a un rey en (fila_rey, col_rey).
     *
     * Reglas:
     *  - Un caballo se mueve en 'L': 2 en una dirección y 1 en la otra.
     *  - Si la posición del caballo es igual a la del rey, no se considera "ataque" (pieza en misma casilla).
     *
     * @param fila_cab fila del caballo (1..8)
     * @param col_cab  columna del caballo (1..8)
     * @param fila_rey fila del rey (1..8)
     * @param col_rey  columna del rey (1..8)
     * @return true si el caballo ataca al rey; false en caso contrario.
     */
    public static boolean atacaCaballo(int fila_cab, int col_cab, int fila_rey, int col_rey) {
        // Si están en la misma casilla, no es un ataque válido
        if (fila_cab == fila_rey && col_cab == col_rey) return false;

        int df = Math.abs(fila_cab - fila_rey);
        int dc = Math.abs(col_cab - col_rey);

        // Movimientos de caballo: (2,1) o (1,2)
        return (df == 2 && dc == 1) || (df == 1 && dc == 2);
    }

    /**
     * Valida que una fila o columna esté en el rango 1..8 (tablero estándar).
     */
    private static boolean esPosicionValida(int v) {
        return v >= 1 && v <= 8;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Caballos: ¿el caballo ataca al rey? ===");
        System.out.println("Ingrese valores de filas y columnas entre 1 y 8 (tablero 8x8).");

        try {
            System.out.print("Fila del caballo (1-8): ");
            if (!sc.hasNextInt()) { System.out.println("Error: debe ingresar un entero. Fin."); return; }
            int filaCab = sc.nextInt();

            System.out.print("Columna del caballo (1-8): ");
            if (!sc.hasNextInt()) { System.out.println("Error: debe ingresar un entero. Fin."); return; }
            int colCab = sc.nextInt();

            System.out.print("Fila del rey (1-8): ");
            if (!sc.hasNextInt()) { System.out.println("Error: debe ingresar un entero. Fin."); return; }
            int filaRey = sc.nextInt();

            System.out.print("Columna del rey (1-8): ");
            if (!sc.hasNextInt()) { System.out.println("Error: debe ingresar un entero. Fin."); return; }
            int colRey = sc.nextInt();

            // Validación de rango
            if (!esPosicionValida(filaCab) || !esPosicionValida(colCab) ||
                    !esPosicionValida(filaRey) || !esPosicionValida(colRey)) {
                System.out.println("Error: todas las filas y columnas deben estar en el rango 1 a 8.");
                return;
            }

            boolean ataca = atacaCaballo(filaCab, colCab, filaRey, colRey);
            if (ataca) {
                System.out.println("Resultado: El caballo ATACA al rey.");
            } else {
                System.out.println("Resultado: El caballo NO ataca al rey.");
            }
        } finally {
            sc.close();
        }
    }
}
