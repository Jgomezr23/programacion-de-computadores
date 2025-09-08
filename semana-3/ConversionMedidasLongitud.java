import java.util.Scanner;

public class ConversionMedidasLongitud {

    public static double metrosACentimetros(double m) {
        return m * 100;
    }

    public static double centimetrosAMetros(double cm) {
        return cm / 100;
    }

    public static double pulgadasACentimetros(double in) {
        return in * 2.54;
    }

    public static double centimetrosAPulgadas(double cm) {
        return cm / 2.54;
    }

    public static double piesACentimetros(double ft) {
        return ft * 30.48;
    }

    public static double centimetrosAPies(double cm) {
        return cm / 30.48;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CONVERSIÓN DE MEDIDAS DE LONGITUD");
        System.out.println("--------------------------------");
        System.out.println("1. Metros a Centímetros");
        System.out.println("2. Centímetros a Metros");
        System.out.println("3. Pulgadas a Centímetros");
        System.out.println("4. Centímetros a Pulgadas");
        System.out.println("5. Pies a Centímetros");
        System.out.println("6. Centímetros a Pies");
        System.out.print("Seleccione una opción: ");

        int opcion = sc.nextInt();
        double valor, resultado;

        switch (opcion) {
            case 1:
                System.out.print("Ingrese metros: ");
                valor = sc.nextDouble();
                resultado = metrosACentimetros(valor);
                System.out.println("Resultado: " + resultado + " cm");
                break;
            case 2:
                System.out.print("Ingrese centímetros: ");
                valor = sc.nextDouble();
                resultado = centimetrosAMetros(valor);
                System.out.println("Resultado: " + resultado + " m");
                break;
            case 3:
                System.out.print("Ingrese pulgadas: ");
                valor = sc.nextDouble();
                resultado = pulgadasACentimetros(valor);
                System.out.println("Resultado: " + resultado + " cm");
                break;
            case 4:
                System.out.print("Ingrese centímetros: ");
                valor = sc.nextDouble();
                resultado = centimetrosAPulgadas(valor);
                System.out.println("Resultado: " + resultado + " in");
                break;
            case 5:
                System.out.print("Ingrese pies: ");
                valor = sc.nextDouble();
                resultado = piesACentimetros(valor);
                System.out.println("Resultado: " + resultado + " cm");
                break;
            case 6:
                System.out.print("Ingrese centímetros: ");
                valor = sc.nextDouble();
                resultado = centimetrosAPies(valor);
                System.out.println("Resultado: " + resultado + " ft");
                break;
            default:
                System.out.println("Opción inválida.");
        }

        sc.close();
    }
}
