
/**
5 - Escreva um programa que permita ao usuário simular um jogo do tipo "21" para dois jogadores. Para cada jogador o programa deve selecionar randomicamente valores entre 0 e 10 e apresentar ao usuário. Cada valor será adicionado à pontuação do jogador até que ele deseje encerrar (ou até que ultrapasse o valor de 21). O vencedor será o jogador cuja pontuação mais se aproximar de 21 (caso tenham a mesma pontuação ou caso os dois extrapolem o valor 21, será considerado empate).
 */
import java.util.Random;
import java.util.Scanner;

public class Aula3exercicio05 {
    public static void main(String[] args) {

        //inicializando import
        Scanner Leitor      = new Scanner(System.in);
        Random aleatorio    = new Random();
        byte ptsPlayer1     = 0 ;
        byte ptsPlayer2     = 0 ;
        byte vencedor = 0;
        char continuar1 = 'c' ;
        char continuar2 = 'c' ;
        while (vencedor == 0 ) {
            //jogador1
            if (ptsPlayer1 > ptsPlayer2 && continuar2 != 'c' ) {
                vencedor = 1;
                System.out.println("parabens jogador 1 voce venceu ");
            }
            if (continuar1 == 'c') {

                System.out.println("jogardo 1 deseja continuar ou deseja encerar ? [c]continuar [e]encerar  ");
                continuar1 = Leitor.next().charAt(0);
                if (continuar1 == 'c') {
                    ptsPlayer1 = (byte) (ptsPlayer1 + aleatorio.nextInt(10) + 1);
                }
                if (ptsPlayer1 > 21) {
                    System.out.println("voce utrapaçou os 21 pontos e perdeu ");
                    vencedor = 2;              
                }else if (ptsPlayer1 == 21  ) {
                    System.out.println("voce chegou primeiro aos 21 pontos e venceu parabens ");
                    vencedor = 1;
                    
                } else {
                    System.out.println("voce essta agora com "+ptsPlayer1 +"pontos "  );
                }
            }

            //jogador 2
            if (ptsPlayer2 > ptsPlayer1 && continuar1 != 'c' ) {
                vencedor = 2;
            }        
            if (continuar2 == 'c') {
                System.out.println("jogardo 2 deseja continuar ou deseja encerar ? [c]continuar [e]encerar  ");
                continuar2 = Leitor.next().charAt(0);
                if (continuar2 == 'c') {
                    ptsPlayer2 = (byte) (ptsPlayer2 + aleatorio.nextInt(10) + 1);
                }
                if (ptsPlayer2 > 21) {
                    System.out.println("voce utrapaçou os 21 pontos e perdeu ");
                    vencedor = 1;
                } else if (ptsPlayer2 == 21) {
                    System.out.println("voce chegou primeiro aos 21 pontos e venceu parabens ");
                    vencedor = 2;

                } else {
                    System.out.println("voce essta agora com " + ptsPlayer2 + "pontos ");
                }
            }
            


        }       
        Leitor.close();

    }
        
}