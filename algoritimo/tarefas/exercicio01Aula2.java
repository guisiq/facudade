/**
 * 01 - Escreva um programa que solicite do usuário um valor inteiro não negativo e apresente na tela o somatório desse valor. Exemplo:
 *
 * Valor = 5
 *
 * Somatório = 5+4+3+2+1 = 15
 *
 */
import java.util.Scanner;
public class exercicio01Aula2 {
    public static void main(String[] args) {
     //inicializando import
     Scanner Leitor = new Scanner(System.in);
     //declarando variaveis
     int numeroDigitado = 0;
     int soma = numeroDigitado ;
     System.out.println("digite um numero inteiro maior que 1 para calcular a soma de uma PA de 1 ate o numero   ");
     numeroDigitado = Leitor.nextInt();
     System.out.println( numeroDigitado + "! e igual a :" );
     System.out.print( numeroDigitado );
     soma = numeroDigitado ;
     while (numeroDigitado > 1) {
         soma = soma + (numeroDigitado - 1);
         numeroDigitado = numeroDigitado - 1;
         System.out.print( " + " + numeroDigitado);

     }
     System.out.print(" = " + soma);
     Leitor.close();
 }   
}