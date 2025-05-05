package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {

    public static void main(String[] args) {

        int[] numeros1 = {1, 2, 3, 4, 5}; // Inicialização já com valores adicionados.
        int[] numeros2 = new int[]{1, 2, 3, 4, 5}; // Também um modelo de inicialização

        for (int i = 0; i < numeros1.length; i++) {
            System.out.println(numeros1[i]);
        }

        for(int num:numeros2) {
            System.out.println(num);
        }

    }
}
