import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayString {
    public static void main(String[] args) {

        System.out.println("-------------------- \n Array y LinkedList\n--------------------");

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Paco");
        lista.add("Ana");
        lista.add("Jesus");
        lista.add("Lucia");

        LinkedList<String> linkedlist = new LinkedList<String>();

        for (int i = 0; i < lista.size(); i++) {
            linkedlist.add(i, lista.get(i));
        }

        System.out.println("Elementos del Array:");
        for (String elementos : lista) {
            System.out.print(elementos + " ");
        }

        System.out.println("\n\nElementos de la LinkedList:");
        for (String elementos : linkedlist) {
            System.out.print(elementos + " ");
        }
    }
}