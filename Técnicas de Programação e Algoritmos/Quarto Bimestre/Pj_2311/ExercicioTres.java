
import java.util.Scanner;
import java.util.HashSet;

public class ExercicioTres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][5];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        HashSet<Integer> elementosUnicos = new HashSet<>();
        boolean temRepetidos = false;
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (!elementosUnicos.add(elemento)) {
                    temRepetidos = true;
                    break;
                }
            }
            if (temRepetidos) {
                break;
            }
        }

        int pares = 0, impares = 0;
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        System.out.println("A matriz possui elementos repetidos? " + temRepetidos);
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
