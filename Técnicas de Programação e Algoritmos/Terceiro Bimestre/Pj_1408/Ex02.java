
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu peso em kg: ");
        double peso = scanner.nextInt();
        System.out.println("Insira sua altura em cm: ");
        double altura = scanner.nextInt();

        double alturaMetros = altura / 100.0;

        double imc = peso / (alturaMetros * alturaMetros);

        System.out.println("Seu IMC é: " + imc);

        if (imc < 18) {
            System.out.println("Você está em situação de Magreza!");
        } else if (imc >= 18 && imc < 24.9) {
            System.out.println("Você está Saudável!");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Você está em situação de Sobrepeso!");
        } else if (imc >= 30) {
            System.out.println("Você está em situação de Obesidade!");
        }

    }
}
