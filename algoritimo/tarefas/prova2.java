import java.util.Scanner;
public class Aula3exercicio01 {
    public static void main(String[] args) {
        //inicializando import
        Scanner Leitor = new Scanner(System.in);
        //declarando variaveis
        int[] numero = new int[10]
        maiorValor ;
        menorValor ;
        soma = 0 ;
        System.out.print("digite o numero para prenencher o array de 10 posicoes na posição" + numero.length);
        numero[0] = leitor.nextInt();
        maiorValor =  numero[0];
        menorValor =  numero[0];
        for (int coluna = 1; coluna < numero.length; coluna++) {
            System.out.print("digite o numero para prenencher o array de 10 posicoes na posição" + numero.length);
            numero[coluna] = leitor.nextInt90;
            if(numero[coluna] < menorValor){
                menorValor = numero[coluna];
            }else if(numero[coluna] > maiorValor){
                maiorValor =numero[coluna] 
            }
            soma = soma+ numero[coluna];
        }
        System.out.println("o maior valor foi " + maiorValor );
        System.out.println("o menor valor foi " + nenorValor );
        System.out.println("o maior valor foi " + soma/10 );
    }
}