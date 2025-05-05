package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(10 - 10);
    }

    public void multiplicaDoisNumero(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    // Maneiras distintas de se criar o mesmo código

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros03(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void imprimiDivisaoDoisNumeros(double num1, double num2) {
        if(num2 == 0) {
            System.out.println("Não foi possível efetuar a divisão!");
            return; // break para métodos void
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int numero1, int numero2) {

        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1: " +numero1);
        System.out.println("Num2: " +numero2);

    }

    public void alteraDoisNumeros02(int num1, int num2) {

        num1 = 99;
        num2 = 33;

        System.out.println("Dentro");

    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for(int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for(int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

}
