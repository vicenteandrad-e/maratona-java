package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        // Tipos Primitivos
        // int, double, float, chat, byte, short, long, boolean

        int idade = 20;
        long numeroGrande = 100000;
        double salarioDouble = (float) 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        System.out.println("Idade: " + idade);

        // Casting

        System.out.println("Salário: " + salarioDouble);
        int valoreEmLong = (int) 1000000000000L;
        System.out.println("Valor int em long com casting: " + valoreEmLong);

        // Reference Type: String

        String nome = "Vicente";
        System.out.println("Meu nome é: " + nome);

    }
}
