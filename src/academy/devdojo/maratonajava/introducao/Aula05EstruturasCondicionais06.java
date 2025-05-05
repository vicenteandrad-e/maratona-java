package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {

        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considere 1 como domingo

        byte dia = 7;
//        switch (dia) {
//            case 1:
//                System.out.println("Final de Semana!");
//                break;
//            case 2:
//                System.out.println("Dia útil");
//                break;
//            case 3:
//                System.out.println("Dia útil");
//                break;
//            case 4:
//                System.out.println("Dia útil");
//                break;
//            case 5:
//                System.out.println("Dia útil!");
//                break;
//            case 6:
//                System.out.println("Dia útil");
//                break;
//            case 7:
//                System.out.println("Final de Semana!");
//                break;
//            default:
//                System.out.println("Inválido");
//                break;
//        }

        // Modelo mais direcionado!
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de Semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil!");
                break;
            default:
                System.out.println("Inválido");
                break;
        }

    }
}
