import javax.swing.JOptionPane;

public class ExercicioSete {

    public static void main(String[] args) {
        double[][] matriz = {
            {4.5, 5.2},
            {4.2, 1.0}
        };

        JOptionPane.showMessageDialog(
            null, 
            """
            ***** Imprimindo a Matriz *****
            Exibindo os valores armazenados na matriz.
            """
        );

        // Exibindo os valores da matriz
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.println(
                    String.format(
                        "matriz[%d][%d] = %.1f", 
                        linha, coluna, matriz[linha][coluna]
                    )
                );
            }
        }
    }
}
