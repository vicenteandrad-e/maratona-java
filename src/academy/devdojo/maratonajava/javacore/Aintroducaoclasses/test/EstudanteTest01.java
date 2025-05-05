package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {

    public static void main(String[] args) {

        Estudante primeiroEstudante = new Estudante();

        // Atributos da classe Estudante
        primeiroEstudante.nome = "Luffy";
        primeiroEstudante.idade = 18;
        primeiroEstudante.sexo = 'M';

        System.out.println(primeiroEstudante.nome);
        System.out.println(primeiroEstudante.idade);
        System.out.println(primeiroEstudante.sexo);


    }

}
