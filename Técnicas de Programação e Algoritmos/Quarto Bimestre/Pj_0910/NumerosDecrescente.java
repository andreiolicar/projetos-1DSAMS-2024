
import java.util.Scanner;

public class NumerosDecrescente {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[50];

        System.out.println("Digite 50 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("\nNúmeros em ordem decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
