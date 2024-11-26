
import javax.swing.JOptionPane;

public class ExercicioSeis {

    public static void main(String[] args) {
        final int totalLinhas = 3;
        final int totalColunas = 3;
        int[][] matriz = new int[totalLinhas][totalColunas];

        // Mensagem inicial
        JOptionPane.showMessageDialog(null,
                "***** Cadastro de Dados na Matriz *****\n"
                + "Por favor, insira os valores para cada posição da matriz."
        );

        // Preenchendo a matriz com valores fornecidos pelo usuário
        for (int linha = 0; linha < totalLinhas; linha++) {
            for (int coluna = 0; coluna < totalColunas; coluna++) {
                String mensagem = String.format(
                        "Informe o valor para a posição [%d][%d]:",
                        linha + 1, coluna + 1
                );
                matriz[linha][coluna] = Integer.parseInt(
                        JOptionPane.showInputDialog(mensagem)
                );
            }
        }

        // Exibindo os valores da matriz
        JOptionPane.showMessageDialog(null,
                "***** Exibindo os Dados da Matriz *****"
        );

        System.out.println("Matriz:");
        for (int linha = 0; linha < totalLinhas; linha++) {
            for (int coluna = 0; coluna < totalColunas; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }
    }
}
