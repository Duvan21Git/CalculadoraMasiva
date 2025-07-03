import java.util.Scanner;

public class CalculadoraModular {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        mostrarMenu(input);
        input.close();
    }

    private static void mostrarMenu(Scanner sc) {
        var salir = false;
        do {
            System.out.println("BIENVENIDO A LA CALCULADORA MODULAR");
            System.out.println("=============================");
            System.out.println("""
                    1.suma
                    2.resta
                    3.multiplicacion
                    4.division
                    5.residuo de la division
                    0.salir
                    """);

            var opcion = leerEntero(sc, "ingrese su numero: ");

            switch (opcion) {
                case 1:
                    suma(sc);
                    break;
                case 2:
                    resta(sc);
                    break;
                case 3:
                    multiplicacion(sc);
                    break;
                case 4:
                    division(sc);
                    break;
                case 5:
                    modulo(sc);
                    break;
                case 0:
                    System.out.println("saliendo de la aplicacion");
                    salir = true;
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;

            }
        } while (!salir);
        System.out.println("hasta pronto");
    }

    private static int leerEntero(Scanner input, String mesaje) {
        System.out.print(mesaje);
        var entrada = input.nextInt();
        input.nextLine();

        return entrada;

    }

    private static void suma(Scanner input) {
        var num1 = leerEntero(input, "ingrese el num1: ");
        var num2 = leerEntero(input, "ingrese el num2: ");

        var resultado = num1 + num2;
        System.out.printf("la suma es:  %d%n", resultado);
        System.out.println("presione enter pra continuar");
        input.nextLine();
    }

    private static void resta(Scanner input) {
        var num1 = leerEntero(input, "ingrese el num1: ");
        var num2 = leerEntero(input, "ingrese el num2: ");

        var resultado = num1 - num2;
        System.out.printf("la resta es: %d%n", resultado);
        System.out.println("presione enter para continuar");
        input.nextLine();
    }

    private static void multiplicacion(Scanner input) {
        var num1 = leerEntero(input, "ingrese el num1: ");
        var num2 = leerEntero(input, "ingrese el num2: ");

        var resultado = num1 * num2;
        System.out.printf("la multiplicacion es: %d%n", resultado);
        System.out.println("presione enter para continuar");
        input.nextLine();
    }

    private static void division(Scanner input) {
        var num1 = leerEntero(input, "ingrese el num1: ");
        var num2 = leerEntero(input, "ingrese el num2: ");

        if (num2 != 0) {
            var resultado = (double) num1 / num2;
            System.out.printf("la division es: %.2f%n", resultado);
        } else {
            System.out.println("no se puede dividir por cero");
        }

        System.out.println("presione enter para continuar");
        input.nextLine();
    }

    private static void modulo(Scanner input) {
        var num1 = leerEntero(input, "ingrese el num1: ");
        var num2 = leerEntero(input, "ingrese el num2: ");

        if (num2 != 0) {
            var resultado = num1 % num2;
            System.out.printf("el residuo es: %d%n", resultado);
        } else {
            System.out.println("no se puede dividir por cero");
        }

        System.out.println("presione enter para continuar");
        input.nextLine();
    }
}
