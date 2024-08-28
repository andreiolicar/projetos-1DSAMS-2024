
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira sua idade: ");
        int idade = scanner.nextInt();
        
        if (idade >= 5 && idade <= 7) {
            System.out.println("Você pertence à categoria: Infantil A – de 5 à 7 anos.");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Você pertence à categoria: Infantil B – de 8 à 10 anos.");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Você pertence à categoria: Juvenil A - de 11 à 13 anos.");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Você pertence à categoria: Juvenil B - de 14 à 17 anos.");
        } else if (idade >18) {
            System.out.println("Você pertence à categoria: Senior – a partir de 18 anos.");
        } else {
            System.out.println("Não foi possível calcular sua categoria, insira valores válidos para a sua idade");
        }
        
        
    }
}
