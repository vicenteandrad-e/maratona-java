package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioCorrigido {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimeDados() {
        System.out.println("------------");

        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios != null) {
            for (double salarios : this.salarios) {
                System.out.print(salarios + " ");
            }
        }
        System.out.println("Media salarial: " + mediaSalario());
    }

    public double mediaSalario() {

        if (salarios == null) {
            return 0;
        }

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        return media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
