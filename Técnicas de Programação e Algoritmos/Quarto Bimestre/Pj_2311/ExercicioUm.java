public class ExercicioUm {

    public static void main(String[] args) {
        exibirMatrizA();
        System.out.println(); 
        exibirMatrizB();
        System.out.println();
        exibirMatrizC();
    }

    public static void exibirMatrizA() {
        char[][] matriz = {
                {'a', 'b', 'c', 'd', 'e'},
                {'f', 'g', 'h', 'i', 'j'},
                {'l', 'm', 'n', 'o', 'p'},
                {'q', 'r', 's', 't', 'u'}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void exibirMatrizB() {
        int[][] matriz = {
                {19, 25, 100, 99},
                {10, 7, 25, 14},
                {35, 2, 47, 74}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void exibirMatrizC() {
        double[][] matriz = {
                {1.9, 2.5, 10.0},
                {1.0, 7.8, 2.5},
                {3.5, 2.2, 4.7}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}