/**
    02 - Escreva um programa que permita ao usuário digitar um valor inteiro não negativo. O programa deve calcular e apresentar o fatorial do número digitado.

 */
import java.util.Scanner;
public class exercicio02Aula2 {
    public static void main(String[] args) {
     //inicializando import
     Scanner leitor = new Scanner(System.in);
     //declarando variaveis
     int numeroDigitado = 0;
     int fatorial = numeroDigitado ;
     System.out.println("digite um numero inteiro maior que 1 para calcular o seu fatorial ");
     numeroDigitado = leitor.nextInt();
     System.out.println( numeroDigitado + "! e igual a :" );
     System.out.print( numeroDigitado );
     fatorial = numeroDigitado ;
     while (numeroDigitado > 1) {
         fatorial = fatorial * (numeroDigitado - 1);
         numeroDigitado = numeroDigitado - 1;
         System.out.print( " x " + numeroDigitado);

     }
     System.out.print(" = " + fatorial);
     leitor.close();
 }   
}