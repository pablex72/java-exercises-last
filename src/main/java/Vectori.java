import java.util.Vector;

public class Vectori {
    public static void main(String[] args) {

        Vector vector = new Vector();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        System.out.println("Initial state: " + vector);

        vector.remove(2);
        vector.remove(1);

        System.out.println("After delete: " + vector);

        System.out.println("4. Due to memory because the capacity is the double");
    }
}
