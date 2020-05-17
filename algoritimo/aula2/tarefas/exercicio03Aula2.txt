/**
 *03 - Usando laços de repetição, escreva um programa que solicite do usuário um valor para a base e um valor para o expoente. O programa deve calcular e apresentar a potência resultante. 
 *
 */
import java.util.Scanner;
public class exercicio03Aula2 {
    public static void main(String[] args) {
     //inicializando import
     Scanner leitor = new Scanner(System.in);
     //declarando variaveis
     int numeroDigitadoBase = 0;
     int numeroDigitadoEspoente = 0;
     int resultado = 0 ;
     System.out.println("digite um numero inteiro para ser a base   ");
     numeroDigitadoBase = leitor.nextInt();

     System.out.println("digite um numero inteiro maior que 1 para ser o expoente   ");
     numeroDigitadoEspoente = leitor.nextInt();
     
     System.out.print(  numeroDigitadoBase );
     resultado = numeroDigitadoBase;
     
     while (numeroDigitadoEspoente > 1) {

         resultado = resultado * numeroDigitadoBase ;
         System.out.print( " x " + numeroDigitadoBase);
         -- numeroDigitadoEspoente; 
     }
     System.out.print(" = " + resultado);
     leitor.close();
 }   
}