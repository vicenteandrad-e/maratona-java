package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;


import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioCorrigido;

public class ExercicioFuncionarioCorrigido {

    public static void main(String[] args) {

        FuncionarioCorrigido funcionario = new FuncionarioCorrigido();

        double[] salarios = {3500, 6750, 9000};

        funcionario.setNome("Vicente");
        funcionario.setIdade(26);
        funcionario.setSalarios(salarios);

        funcionario.imprimeDados();

    }
}
