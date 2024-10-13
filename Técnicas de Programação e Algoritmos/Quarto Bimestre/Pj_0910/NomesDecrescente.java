
import java.util.Scanner;

public class NomesDecrescente {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[15];

        System.out.println("Digite 15 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = input.nextLine();
        }

        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = 0; j < nomes.length - i - 1; j++) {
                if (nomes[j].compareTo(nomes[j + 1]) < 0) {
                    String temp = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = temp;
                }
            }
        }

        System.out.println("\nNomes em ordem decrescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
