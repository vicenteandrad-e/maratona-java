package academy.devdojo.maratonajava.introducao;

import java.util.Date;

public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {

        /*
        Prática

        Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

        Eu <nome>, morando no endereço <endereço>
        confirmo que recebi o salário de <salario>, na data <data>.

         */

        String nome = "Vicente";
        String endereco = "Rua Santa Luzia, Ilhotas";
        double salario = 2500;
        String data = "10/04/2025";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco +
                " confirmo que recebi o salário de " + salario + ", na data " + data;

        System.out.println(relatorio);

    }

}
