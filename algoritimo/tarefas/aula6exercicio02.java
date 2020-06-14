//01 - Escreva um programa que permita ao usuário preencher uma matriz de dimensões 3x3 e imprima na tela a matriz e a soma dos elementos de cada linha e de cada coluna. 

import java.util.Scanner;
public class aula6exercicio02 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println(
                        "escreva um numero para preencher o elemento de posicao " + i + "e" + j + "da matriz 3x3");
                matriz[i][j] = leitor.nextInt();
            }
        }
        for (int linha = 0; linha <= matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                
                if (linha == matriz.length) {
                    int soma = 0;
                    for (int i = 0; i < matriz.length; i++) {
                        soma = soma + matriz[i][coluna];
                    }
                    System.out.print(soma+" ");
                } else {
                    System.out.print(matriz[linha][coluna]+"  ");
                }
            }
            System.out.println();
        }
}
}