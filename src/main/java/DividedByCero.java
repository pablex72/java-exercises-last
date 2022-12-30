import java.util.Scanner;

public class DividedByCero {
    private static int Dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica los numeros que quieres dividir: ");
        System.out.print("Ingrese el dividendo: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el divisor: ");
        int b = scanner.nextInt();
        try {
            System.out.println("El resultado es: " + Dividir(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Surge una ArithmeticException, esta es: " + e.getMessage());
        } finally {
            System.out.println("Se completaron todas las funciones");
        }
}}
