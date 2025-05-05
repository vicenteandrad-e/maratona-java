package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao02 {

    // Imprima todos os números pares de 0 até 10000000
    public static void main(String[] args) {

        for(int i = 0; i <= 1000000; i++) {
            if(i % 2 == 0) {
                System.out.println("Número par: " + i);
            }
        }

    }


}
