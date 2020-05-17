/**
 *04 - Escreva um programa que permita ao usuário digitar valores numéricos enquanto quiser e ao encerrar deve apresentar a quantidade de valores digitados, o maior valor, o menor valor e a média dos valores informados. 
 *
 */
import java.util.Scanner;
public class exercicio04Aula2 {
    public static void main(String[] args) {
     //inicializando import
     Scanner leitor = new Scanner(System.in);
     //declarando variaveis
     int numeroDigitado = 0;
     int quantidadeNumeroDigitado = 0;
     int maiorNumero = 0 ;
     int menorNumero  ;
     int media = 0 ;
     int soma = 0  ;
     char continuar = 's' ;
     
  
     System.out.print(" digite um numero : ");
     numeroDigitado = leitor.nextInt();
     ++quantidadeNumeroDigitado;
     soma = soma + numeroDigitado;
     maiorNumero = numeroDigitado;
     menorNumero = numeroDigitado;
     
     System.out.print(" deseja continuar [s] sim [n] não ");
     continuar = (char) leitor.next().charAt(0);

   
    while  (continuar == 's') {

         
        System.out.print(" digite um numero : ");
        numeroDigitado = leitor.nextInt();
        ++quantidadeNumeroDigitado;

         soma = soma + numeroDigitado;
         if (numeroDigitado > maiorNumero) {
             maiorNumero = numeroDigitado;
         }
         if (numeroDigitado < menorNumero) {
             menorNumero = numeroDigitado;
            }
         System.out.print(" deseja continuar [s] sim [n] não ");
         continuar = (char) leitor.next().charAt(0);


        }
 /**
 *04 - Escreva um programa que permita ao usuário digitar valores numéricos enquanto quiser e ao encerrar deve apresentar a quantidade de valores digitados, o maior valor, o menor valor e a média dos valores informados. 
 *
 */
     media = soma / quantidadeNumeroDigitado;
     System.out.println("voce digitou "+quantidadeNumeroDigitado +"valores" );
     System.out.println("o maior valor que vc digitou foi :" + maiorNumero);
     System.out.println("o menor valor que vc digitou foi :" + menorNumero);
     System.out.println("a media de valores que voce digitou foi :" + media);
    
     leitor.close();
    }   
}