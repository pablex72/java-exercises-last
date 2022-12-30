import java.util.Scanner;

public class Reverse {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String texto;
            System.out.println("Introduce the String");
            texto = scanner.nextLine();

            StringBuilder inversa = new StringBuilder(texto);
            texto = inversa.reverse().toString();

            System.out.println(texto);
        }
}
