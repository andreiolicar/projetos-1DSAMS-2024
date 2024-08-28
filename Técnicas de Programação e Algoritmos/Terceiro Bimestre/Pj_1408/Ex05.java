
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira sua primeira nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("Insira sua segunda nota: ");
        int nota2 = scanner.nextInt();
        System.out.println("Insira sua terceira nota: ");
        int nota3 = scanner.nextInt();
        System.out.println("Insira sua quarta nota: ");
        int nota4 = scanner.nextInt();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 9) {
            System.out.println("Aluno aprovado! Sua média é de: " + media + ", parábens!");
        } else if (media >= 7 && media < 9) {
            System.out.println("Aluno aprovado! Sua média é de: " + media + ", parábens!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno aprovado! Sua média é de: " + media + ", parábens!");
        } else if (media >= 2.5 && media < 5) {
            System.out.println("Aluno reprovado! Sua média é de: " + media + ", boa sorte!");
        } else if (media < 2.5) {
            System.out.println("Aluno reprovado! Sua média é de: " + media + ", boa sorte!");
        } else {
            System.out.println("Não foi possível calcular sua média, insira valores válidos");
        }

    }
}
