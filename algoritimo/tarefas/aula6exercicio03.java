import java.util.Scanner;
//03 - Escreva um programa que permita ao usuário preencher as duas primeiras colunas de uma matriz de dimensões 3x3. O programa deve preencher automaticamente a terceira coluna com a soma dos elementos correspondentes das colunas anteriores. 
public class aula6exercicio03{
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < matriz.length-1; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println(
                        "escreva um numero para preencher o elemento de posicao " + i + "e" + j + "da matriz 3x3");
                matriz[i][j] = leitor.nextInt();
            }
        }
        for (int linha = 0; linha <= matriz.length-1; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                
                if (linha == matriz.length-1) {
                    int soma = 0;
                    for (int i = 0; i < matriz.length; i++) {
                        soma = soma + matriz[i][coluna];
                    }
                    matriz[linha][coluna] = soma;
                    System.out.print(soma+" ");
                } else {
                    System.out.print(matriz[linha][coluna]+"  ");
                }
            }
            System.out.println();
        }
}
}