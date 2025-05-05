package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{2, 3, 4, 5, 6, 7, 8};

        int[][] arrayInt2 = {{1, 2}, {4, 5, 7}, {10, 9, 8, 6, 0}};

        for(int[] arrBase : arrayInt2) {
            System.out.println("\n------");
            for (int valores : arrBase) {
                System.out.println(valores + " ");
            }
        }

    }
}
