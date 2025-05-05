package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salario;

    public void imprimeDados() {
        System.out.println("------------");

        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double num: this.salario) {
            System.out.println(num);
        }
    }

    public double mediaSalario() {

        double media = 0;
        double aux = 0;
        for(double num: this.salario) {
            aux += num;
        }

        media = aux / 3;

        return media;
    }

}
