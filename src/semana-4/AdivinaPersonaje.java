import java.util.Scanner;

/**
 * Programa que simula un juego de adivinanza de personajes.
 * El usuario debe pensar en un personaje de una lista predefinida.
 * El programa, a través de un máximo de 5 preguntas de tipo Sí/No,
 * intentará adivinar cuál fue el personaje elegido.
 *
 * Personajes posibles:
 * - Radamel Falcao García
 * - Goku
 * - Michael Jordan
 * - Eminem
 * - Darth Vader
 * - Adam Sandler
 * - Bruce Wayne
 * - Tin Tin
 * - Ayudante de Santa
 * - Joe Biden
 * - José Saramago
 * - Günter Grass
 * - Kim Jong Un
 */
public class AdivinaPersonaje {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Piensa en uno de estos personajes:");
        System.out.println("Radamel Falcao García, Goku, Michael Jordan, Eminem, Darth Vader, Adam Sandler, Bruce Wayne, Tin Tin, Ayudante de Santa, Joe Biden, José Saramago, Günter Grass y Kim Jong Un.");
        System.out.println("Yo intentaré adivinar quién es con preguntas de Sí/No.");
        System.out.println("Responde con 's' para Sí y 'n' para No.");

        // Primera pregunta: ¿Es un personaje ficticio?
        System.out.print("¿Es un personaje ficticio? (s/n): ");
        String resp1 = sc.nextLine().toLowerCase();

        if (resp1.equals("s")) {
            // Pregunta 2: ¿Es un superhéroe?
            System.out.print("¿Es un superhéroe? (s/n): ");
            String resp2 = sc.nextLine().toLowerCase();

            if (resp2.equals("s")) {
                // Puede ser Goku o Bruce Wayne
                System.out.print("¿Es del universo de DC Comics? (s/n): ");
                String resp3 = sc.nextLine().toLowerCase();
                if (resp3.equals("s")) {
                    System.out.println("¡Tu personaje es Bruce Wayne!");
                } else {
                    System.out.println("¡Tu personaje es Goku!");
                }
            } else {
                // No es superhéroe
                System.out.print("¿Es un villano? (s/n): ");
                String resp3 = sc.nextLine().toLowerCase();
                if (resp3.equals("s")) {
                    System.out.println("¡Tu personaje es Darth Vader!");
                } else {
                    // Posibles: Tin Tin o Ayudante de Santa
                    System.out.print("¿Es un personaje de historietas/cómics europeos? (s/n): ");
                    String resp4 = sc.nextLine().toLowerCase();
                    if (resp4.equals("s")) {
                        System.out.println("¡Tu personaje es Tin Tin!");
                    } else {
                        System.out.println("¡Tu personaje es el Ayudante de Santa!");
                    }
                }
            }

        } else {
            // Personaje real
            System.out.print("¿Es un deportista? (s/n): ");
            String resp2 = sc.nextLine().toLowerCase();

            if (resp2.equals("s")) {
                // Falcao o Jordan
                System.out.print("¿Es futbolista? (s/n): ");
                String resp3 = sc.nextLine().toLowerCase();
                if (resp3.equals("s")) {
                    System.out.println("¡Tu personaje es Radamel Falcao García!");
                } else {
                    System.out.println("¡Tu personaje es Michael Jordan!");
                }
            } else {
                // No deportista
                System.out.print("¿Es un político? (s/n): ");
                String resp3 = sc.nextLine().toLowerCase();

                if (resp3.equals("s")) {
                    // Biden o Kim Jong Un
                    System.out.print("¿Es presidente de EE.UU.? (s/n): ");
                    String resp4 = sc.nextLine().toLowerCase();
                    if (resp4.equals("s")) {
                        System.out.println("¡Tu personaje es Joe Biden!");
                    } else {
                        System.out.println("¡Tu personaje es Kim Jong Un!");
                    }
                } else {
                    // Puede ser escritor, actor o cantante
                    System.out.print("¿Es un cantante famoso? (s/n): ");
                    String resp4 = sc.nextLine().toLowerCase();
                    if (resp4.equals("s")) {
                        System.out.println("¡Tu personaje es Eminem!");
                    } else {
                        System.out.print("¿Es escritor? (s/n): ");
                        String resp5 = sc.nextLine().toLowerCase();
                        if (resp5.equals("s")) {
                            System.out.print("¿Es portugués? (s/n): ");
                            String resp6 = sc.nextLine().toLowerCase();
                            if (resp6.equals("s")) {
                                System.out.println("¡Tu personaje es José Saramago!");
                            } else {
                                System.out.println("¡Tu personaje es Günter Grass!");
                            }
                        } else {
                            System.out.println("¡Tu personaje es Adam Sandler!");
                        }
                    }
                }
            }
        }

        sc.close();
    }
}
