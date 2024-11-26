
public class ExercicioCinco {
    public static void main(String[] args) {
        desenharQuadradoCheio();
        System.out.println();
        desenharQuadradoVazio();
        System.out.println();
        desenharTriangulo();
    }

    public static void desenharQuadradoCheio() {
        int tamanho = 4;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void desenharQuadradoVazio() {
        int tamanho = 4;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == 0 || i == tamanho - 1 || j == 0 || j == tamanho - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void desenharTriangulo() {
        int tamanho = 4;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}