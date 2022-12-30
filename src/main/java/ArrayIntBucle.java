import java.util.ArrayList;

public class ArrayIntBucle {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = 1; i < 11; i++) {
            lista.add(i);

            for (int num = 0; num < lista.size(); num++) {

                if (lista.get(num) % 2 == 0) {
                    lista.remove(num);
                }
            }
        }
        System.out.println(lista);
    }
}
