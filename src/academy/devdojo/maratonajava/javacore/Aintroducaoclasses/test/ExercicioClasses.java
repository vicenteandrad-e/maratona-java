package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class ExercicioClasses {

    public static void main(String[] args) {

        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Onix";
        carro01.modelo = "Chevrolet";
        carro01.ano = 2018;

        carro02.nome = "Prisma";
        carro02.modelo = "Chevrolet";
        carro02.ano = 2012;

        System.out.println("Carro: " + carro01.nome + "\nModelo: " + carro01.modelo + "\nAno: " + carro01.ano);
        System.out.println("---------------------------------------");
        System.out.println("Carro: " + carro02.nome + "\nModelo: " + carro02.modelo + "\nAno: " + carro02.ano);

    }

}
