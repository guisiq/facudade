import java.util.Scanner;
public class Aula3exercicio01 {
    public static void main(String[] args) {
    //inicializando import
    Scanner Leitor = new Scanner(System.in);
    //declarando variaveis
    int[][] numero = new int[4][4];
    maiorsoma =  0;
    soma = 0 ;
    for (int linha = 0; linha < numero.length; coluna++) {
        for (int coluna = 0; coluna < numero.length; coluna++) {
            System.out.print("digite o numero para prenencher o array de 10 posicoes na posição" + numero.length);
            numero[linha][coluna] = leitor.nextInt();
        }
    }
    for (int linha = 0; linha < numero.length; coluna++) {
        soma = 0;
        for (int coluna = 0; coluna < numero.length; coluna++) {
        System.out.println("o maior soma foi  " + maiorValor );
            soma = soma+numero[linha][coluna];
        }
            if(soma > maiorsoma){
            maiorsoma = soma;
            linha1 = linha
        }
    }
    

    System.out.println("o maior soma foi  " + maiorValor );
    
 }
}