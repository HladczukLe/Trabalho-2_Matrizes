import javax.swing.JOptionPane;

public class Questao1 {
    public static void main(String[] args) {
        int linha = Integer.parseInt(JOptionPane.showInputDialog("Quantas linhas? "));
        int coluna = Integer.parseInt(JOptionPane.showInputDialog("Quantas colunas? "));
        int [][] matriz = new int[linha][coluna];
        for (int i = 0; i<matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Valor: "));
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println(" ");
        }

        int somaLinha = 0;
        int somaColuna = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
        }
        if (somaLinha==0 && somaColuna==0) {
            System.out.println("Matriz nula");
        } else  if (linha==coluna) {
            System.out.println("Matriz quadrada");
            
        }
    }
}
