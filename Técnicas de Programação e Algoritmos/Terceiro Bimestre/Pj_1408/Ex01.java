
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora de início do turno de trabalho: ");
        int HoraInicio = scanner.nextInt();

        if (HoraInicio >= 5 && HoraInicio < 13) {
            System.out.println("Turno da manhã.");
        } else if (HoraInicio >= 13 && HoraInicio < 21) {
            System.out.println("Turno da tarde.");
        } else if (HoraInicio >= 21 && HoraInicio < 5) {
            System.out.println("Turno da Noite.");
        } else {
            System.out.println("O horário inserido é inválido, insira um novo horário que seja válido.");
        }
    }
}
