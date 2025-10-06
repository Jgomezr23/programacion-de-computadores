package Semana_7;
import java.util.Scanner;
/**
 * Programa para validar si una contraseña es segura
 * Politécnico Grancolombiano - Programación de Computadores
 * Entrega Final - Semana 7
 *
 * @author [Jennifer Gómez Romero]
 * @version 1.0
 * @date Octubre 2025
 */
public class ContrasenaSegura {
    /**
     * Método principal que ejecuta el programa de validación de contraseñas
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Declaración de variables para entrada de datos
        Scanner sc = new Scanner(System.in);
        // Solicitar al usuario que ingrese la contraseña a validar
        System.out.print("Ingrese una contraseña: ");
        String password = sc.nextLine();
        // Variables booleanas para verificar cumplimiento de criterios
        boolean tieneLetra = false;
        boolean tieneDigito = false;
        boolean tieneSimbolo = false;
        // Recorrer cada carácter de la contraseña para validar criterios
        for (char c : password.toCharArray()) {
            // Verificar si el carácter es una letra (A-Z, a-z)
            if (Character.isLetter(c)) {
                tieneLetra = true;
                // Verificar si el carácter es un dígito (0-9)
            } else if (Character.isDigit(c)) {
                tieneDigito = true;
                // Si no es letra ni dígito, entonces es un símbolo
            } else {
                tieneSimbolo = true;
            }
        }
        // Validar si cumple TODOS los criterios: longitud >= 10, letra, dígito y símbolo
        if (password.length() >= 10 && tieneLetra && tieneDigito && tieneSimbolo) {
            System.out.println("La contraseña es SEGURA.");
        } else {
            System.out.println("La contraseña NO es segura.");
        }
    }
}
