package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {

    public static void main(String[] args) {

        // + - * /
        int numero01 = 10;
        int numero02 = 20;
        int soma = numero01 + numero02;
        // int div = numero01 / numero02; -> Divisão entre números inteiros, resultado em inteiro.
        double divisao = numero01 / (double) numero02;
        System.out.println("Somatório: " + (numero01 + numero02));
        System.out.println("Somatório: " + soma);
        System.out.println(divisao);

        // %

        int restoDivisao = 20 % 2;
        System.out.println(restoDivisao);

        // > < => <= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 20 < 20;
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezMenorQueVinte);

        // AND(&&), OR(||) e NOT(!)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;


        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorContaCorrente = 200;
        double valorContaPoupanca = 10000;
        boolean isPlaystaitonCincoCompravel = valorContaPoupanca >= 5000 || valorContaCorrente >= 5000;
        System.out.println(isPlaystaitonCincoCompravel);

        // = += -= *= /=

        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);

    }

}
