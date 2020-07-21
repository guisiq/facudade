import java.util.Scanner;
//04 - Escreva um progama que efetue a soma de duas matrizes de com as dimensões e valores definidos pelo usuário e apresente o resultado. 
public class aula6exercicio04{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dimensao = 0;
        System.out.println("digite a dimensao para a criacao de duas matrizes quadraticas ");
        dimensao = leitor.nextInt();
        int[][][] matriz = new int[2][dimensao][dimensao];
        for (int e = 0; e < 2; e++) {
            for (int i = 0; i < matriz[0].length; i++) {
                for (int j = 0; j < matriz[0][0].length; j++) {
                    System.out.println("escreva um numero para preencher o elemento de posicao " + i + "e" + j
                            + "da matriz " + e + " de " + dimensao + "x" + dimensao);
                    matriz[e][i][j] = leitor.nextInt();
                }
            }
        }
        System.out.println("a soma das matrizes e igual a :");
        for (int linha = 0; linha <= matriz[0].length-1; linha++) {
            for (int coluna = 0; coluna < matriz[0][0].length; coluna++) {

                    int soma = 0;
                    soma = matriz[1][linha][coluna] + matriz[0][linha][coluna];
                    System.out.print(soma+"  ");
            }
            System.out.println();
        }
}
}