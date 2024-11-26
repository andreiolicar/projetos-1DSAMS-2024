
import java.util.Scanner;

public class ExercicioNove {

    public static char[][] tabuleiro = new char[3][3];

    public static void main(String[] args) {
        inicializaTabuleiro();
        boolean jogadorX = true;

        Scanner scanner = new Scanner(System.in);

        while (!verificaFimDeJogo()) {
            imprimeTabuleiro();

            System.out.print("Jogador " + (jogadorX ? "X" : "O") + ", digite a linha (1-3): ");
            int linha = scanner.nextInt() - 1;
            System.out.print("Digite a coluna (1-3): ");
            int coluna = scanner.nextInt() - 1;

            if (fazJogada(linha, coluna, jogadorX)) {
                jogadorX = !jogadorX;
            } else {
                System.out.println("Posição inválida! Tente novamente.");
            }
        }

        imprimeTabuleiro();
        
        if (verificaGanhador('X')) {
            System.out.println("O jogador X venceu!");
        } else if (verificaGanhador('O')) {
            System.out.println("O jogador O venceu!");
        } else {
            System.out.println("Empate!");
        }
    }

    static void inicializaTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    static void imprimeTabuleiro() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    static boolean fazJogada(int linha, int coluna, boolean jogadorX) {
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
            return false;
        }
        tabuleiro[linha][coluna] = jogadorX ? 'X' : 'O';
        return true;
    }

    static boolean verificaFimDeJogo() {
        return verificaGanhador('X') || verificaGanhador('O') || tabuleiroCheio();
    }

    static boolean verificaGanhador(char jogador) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
                return true;
            }
        }
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }
        return false;
    }

    static boolean tabuleiroCheio() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
