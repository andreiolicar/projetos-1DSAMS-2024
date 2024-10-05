import java.util.Arrays;
import java.util.Scanner;

public class NomesCrescente {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[10];

        System.out.println("Digite 10 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = input.nextLine();
        }

        Arrays.sort(nomes);

        System.out.println("\nNomes em ordem crescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}