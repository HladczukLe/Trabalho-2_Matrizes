import java.util.Random;

public class Questao5 {
    public static void main(String[] args) {
        Random valor = new Random();
        // int dimensao = valor.nextInt(3);
        
        int [][] matriz = new int[3][3];
        int determinante=0;
        for (int i = 0; i<matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = valor.nextInt(10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"\t");

            }
            System.out.println(" ");
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                determinante = matriz[0][0]*((matriz[1][1]*matriz[2][2])-(matriz[1][2]*matriz[2][1])) + 
                    (-matriz[1][0]*((matriz[0][1]*matriz[2][2])-(matriz[0][2]*matriz[2][1]))) + 
                    matriz[2][0]*((matriz[0][1]*matriz[1][2])-(matriz[0][2]*matriz[1][1]));
            }
        }
        System.out.print("Determinante da matriz: "+determinante);
    }
}
