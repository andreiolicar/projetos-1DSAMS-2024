
import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro lado em centímetros: ");
        double a = scanner.nextDouble();
        System.out.println("Insira o segundo lado em centímetros: ");
        double b = scanner.nextDouble();
        System.out.println("Insira o terceiro lado em centímetros: ");
        double c = scanner.nextDouble();

        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c) {
                System.out.println("Os lados formam um triângulo equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Os lados formam um triângulo isósceles.");
            } else {
                System.out.println("Os lados formam um triângulo escaleno.");
            }
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

    }
}
