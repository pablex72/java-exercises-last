import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Ficheros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ubicacion de el fichero de origen: ");
        String fileIn = scanner.nextLine();
        System.out.println("Ubicacion de el fichero de destino: ");
        String fileOut = scanner.nextLine();
        copiar(fileIn, fileOut);
    }

    private static void copiar(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Existe una Excepcion: " + e.getMessage());
        }
    }

}

