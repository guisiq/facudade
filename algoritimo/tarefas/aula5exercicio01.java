//01 - JOGO - O programa deve preencher automaticamente um vetor de 100 posições om valores aleatórios. O usuário terá 10 chances de "chutar" valores e o programa deve contar quantas vezes o usuário chutou um valor que estivesse no vetor. 

import java.util.Scanner;
import java.util.Random;

public class aula5exercicio01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random sorteio = new Random();
        int[] numerosSorteados = new int[100];
        int[] numerosEscolhidos = new int[10];
        int acertos = 0;
        for (int i = 0; i < numerosSorteados.length; i++) {
            numerosSorteados[i] = sorteio.nextInt(100);
        }
        for (int i = 0; i < numerosEscolhidos.length; i++) {
            System.out.println("escolha um numero para o seu palpite " + i);
            numerosEscolhidos[i] = leitor.nextInt();
        }
        for (int i = 0; i < numerosEscolhidos.length; i++) {
            for (int r = 0; r > numerosSorteados.length; r++) {
                if (numerosSorteados[r] == numerosEscolhidos[i]) {
                    acertos++;
                }
            }
        }
        System.out.println(acertos + " dos seus palpites fazem parte dos 100 numeros sorteados");

        leitor.close();
        
    }
}