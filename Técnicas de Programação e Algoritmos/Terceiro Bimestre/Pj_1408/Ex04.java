
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 12 para o mês: ");
        int mes = scanner.nextInt();

        if (mes == 1) {
            System.out.println("O mês corresponde a Janeiro!");
        } else if (mes == 2) {
            System.out.println("O mês corresponde a Fevereiro!");
        } else if (mes == 3) {
            System.out.println("O mês corresponde a Março!");
        } else if (mes == 4) {
            System.out.println("O mês corresponde a Abril!");
        } else if (mes == 5) {
            System.out.println("O mês corresponde a Maio!");
        } else if (mes == 6) {
            System.out.println("O mês corresponde a Junho!");
        } else if (mes == 7) {
            System.out.println("O mês corresponde a Julho!");
        } else if (mes == 8) {
            System.out.println("O mês corresponde a Agosto!");
        } else if (mes == 9) {
            System.out.println("O mês corresponde a Setembro!");
        } else if (mes == 10) {
            System.out.println("O mês corresponde a Outubro!");
        } else if (mes == 11) {
            System.out.println("O mês corresponde a Novembro!");
        } else if (mes == 12) {
            System.out.println("O mês corresponde a Dezembro!");
        } else {
            System.out.println("O número inserido é inválido, insira um número de 1 a 12.");
        }

}

}
