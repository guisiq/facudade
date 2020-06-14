//01 - Escreva um programa que permita ao usuário preencher uma matriz de dimensões 3x3 e imprima na tela a matriz e a soma dos elementos de cada linha e de cada coluna. 

import java.util.Scanner;
public class aula6exercicio01 {
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
        for (int linha = 0; linha < matriz.length; linha++) {
            int soma = 0;
            for (int coluna = 0; coluna <= matriz[0].length; coluna++) {
                if (coluna < matriz[0].length) {
                    System.out.print(matriz[linha][coluna] );
                    soma = soma + matriz[linha][coluna];
                    if (coluna < matriz[0].length-1) {
                        System.out.print("+");
                    }
                } else {
                    System.out.print("="+soma);
                }
            }
            System.out.println();
        }
}
}