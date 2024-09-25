import java.util.Scanner;

public class ClassificacaoCampeonato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de vitórias: ");
        int vitorias = scanner.nextInt();

        System.out.print("Digite o número de derrotas: ");
        int derrotas = scanner.nextInt();

        System.out.print("Digite o saldo de gols: ");
        int saldoGols = scanner.nextInt();

        int vitoriasMinimas = 5;
        int derrotasMaximas = 3;
        int saldoGolsMinimo = 10;

        boolean classificado = (vitorias >= vitoriasMinimas && derrotas <= derrotasMaximas && saldoGols >= saldoGolsMinimo);

        if (classificado) {
            System.out.println("O time se classificou!");
        } else {
            System.out.println("O time não se classificou.");
        }
    }
}
