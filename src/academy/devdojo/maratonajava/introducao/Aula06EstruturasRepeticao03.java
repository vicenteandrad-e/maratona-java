package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao03 {
    public static void main(String[] args) {

        // Imprima numa sequencia de 0 a 50, os 25 primeiros números.

        for(int i = 0; i <= 50; i++) {
            if(i != 26) {
                System.out.println(i);
            } else {
                break;
            }
        }

    }
}
