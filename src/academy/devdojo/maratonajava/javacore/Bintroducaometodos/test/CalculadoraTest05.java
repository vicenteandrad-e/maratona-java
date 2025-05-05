package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int[] numeros = {1, 3, 6, 9, 11};

        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6);

    }

}
