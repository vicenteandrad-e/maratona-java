package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {

    public static void main(String[] args) {


        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.divideDoisNumeros(2, 1);

        System.out.println(resultado);

        System.out.println(calculadora.divideDoisNumeros(20, 10));

        calculadora.imprimiDivisaoDoisNumeros(20, 0);

    }
}
