
import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int somaImpares = 0;
        int[] somaColunas = new int[5];
        int[] somaLinhas = new int[5];

        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }
            }
        }

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                somaColunas[j] += matriz[i][j];
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                somaLinhas[i] += matriz[i][j];
            }
        }

        System.out.println("\nSoma dos números ímpares: " + somaImpares);
        System.out.println("\nSoma das colunas:");
        for (int j = 0; j < 5; j++) {
            System.out.println("Coluna " + j + ": " + somaColunas[j]);
        }
        System.out.println("\nSoma das linhas:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Linha " + i + ": " + somaLinhas[i]);
        }

        input.close();
    }
}
