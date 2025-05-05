package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        // (condição) ? valorCasoTrue : valorCasoFalse
        double salario = 4000;
        String mensagemDoar = "Irei doar!";
        String mensagemNaoDoar = "Não posso doar!";

        String resultado = (salario >= 5000) ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

    }
}
