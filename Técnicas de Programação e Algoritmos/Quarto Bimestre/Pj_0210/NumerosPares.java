import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[100];
        int[] pares = new int[100]; 
        int contadorPares = 0;

        System.out.println("Digite 100 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();

            if (numeros[i] % 2 == 0) {
                pares[contadorPares] = numeros[i];
                contadorPares++;
            }
        }

        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < contadorPares; i++) {
            System.out.println(pares[i]);
        }
    }
}