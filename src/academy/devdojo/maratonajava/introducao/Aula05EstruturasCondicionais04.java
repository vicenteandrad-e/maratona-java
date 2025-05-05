package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {

    public static void main(String[] args) {

        // Taxes Nethelands 2025

        double value = 70000;
        double tax;
        double valueTax;


        if(value <= 38441) {
            tax = 35.82;
        } else if (value >= 38441 && value <= 76817) {
            tax = 37.48;
        } else {
            tax = 49.5;
        }

        valueTax = (value * tax) / 100;

        System.out.println("Tax: " + valueTax);

    }
}
