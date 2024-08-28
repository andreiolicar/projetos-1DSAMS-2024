
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao McDonald's!");
        System.out.println("Nosso cardápio de lanches:");
        System.out.println("1. Big Mac");
        String lancheUm = "Big Mac";
        System.out.println("2. Quarteirão");
        String lancheDois = "Quarteirão";
        System.out.println("3. MacChicken");
        String lancheTres = "MacChicken";
        System.out.println("4. Cheddar");
        String lancheQuatro = "Cheddar";
        System.out.println("5. Cheeseburger");
        String lancheCinco = "Cheeseburger";

        System.out.println("Insira um número de 1 a 5 e escolha o seu lanche: ");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Você escolheu o lanche: " + lancheUm + ", obrigado!");
        } else if (escolha == 2) {
            System.out.println("Você escolheu o lanche: " + lancheDois + ", obrigado!");
        } else if (escolha == 3) {
            System.out.println("Você escolheu o lanche: " + lancheTres + ", obrigado!");
        } else if (escolha == 4) {
            System.out.println("Você escolheu o lanche: " + lancheQuatro + ", obrigado!");
        } else if (escolha == 5) {
            System.out.println("Você escolheu o lanche: " + lancheCinco + ", obrigado!");
        } else {
            System.out.println("O valor inserido é inválido, insira um número de 1 a 5.");
        }
        
    }
}
