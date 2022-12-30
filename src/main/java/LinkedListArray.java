import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListArray {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("hi");
        lista.add("how");
        lista.add("are");
        lista.add("you");

        LinkedList<String> linkedlist = new LinkedList<String>();

        for (int i = 0; i < lista.size(); i++) {
            linkedlist.add(i, lista.get(i));
        }

        System.out.println("Array:");
        for (String elementos : lista) {
            System.out.print(elementos + " ");
        }

        System.out.println("\n\nLinkedList:");
        for (String elementos : linkedlist) {
            System.out.print(elementos + " ");
        }
    }
}
