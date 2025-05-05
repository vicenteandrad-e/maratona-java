package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao04 {

    public static void main(String[] args) {

        // Dado o valor de uma carro, descubra em quantas ele pode ser parcelado
        // Condição valorParcela >= 1000

        double valotTotal = 40000;
        for(int parcela = 1; parcela <= valotTotal; parcela++) {
            double valorParcela = valotTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }

            System.out.println("Parcela: " + parcela + " R$ " + valorParcela);

        }

    }
}
