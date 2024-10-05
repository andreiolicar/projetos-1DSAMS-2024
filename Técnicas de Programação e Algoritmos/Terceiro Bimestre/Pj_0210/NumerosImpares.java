import java.util.Scanner;

public class NumerosImpares {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[100];
        int[] impares = new int[100];
        int contadorImpares = 0;

        System.out.println("Digite 100 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();

            if (numeros[i] % 2 != 0) {
                impares[contadorImpares] = numeros[i];
                contadorImpares++;
            }
        }

        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.println(impares[i]);
        }
    }
}