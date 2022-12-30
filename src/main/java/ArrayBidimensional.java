public class ArrayBidimensional {
    public static void main(String[] args) {

        Integer[][] numeros = {
                {1, 2, 3},
                {10, 20, 30}
        };

        for (int i = 0; i < numeros.length; i++) {

            for (int y = 0; y < numeros[i].length; y++) {

                System.out.println("row " + (i + 1) + " column " + (y + 1) + " --> " + numeros[i][y]);
            }
        }
    }
}
