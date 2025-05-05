package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class ExercicioFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        double[] salarios = {3500, 6750, 9000};

        funcionario.nome = "Vicente";
        funcionario.idade = 26;
        funcionario.salario = salarios;

        funcionario.imprimeDados();
        double mediaGeralSalario = funcionario.mediaSalario();
        System.out.println(mediaGeralSalario);

    }

}
