package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao01 {
    public static void main(String[] args) {

        // While, do While, For
        int count = 0;
        while(count < 10) {
            System.out.println(count);
            count++;
        }

        count = 0;
        do {
            System.out.println("dentro do do-while"+ ++count);
        } while(count < 10);

        for(count = 0; count < 10; count++) {
            System.out.println("For " + count);
        }

    }
}
