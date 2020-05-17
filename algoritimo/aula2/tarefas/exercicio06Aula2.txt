/**
 *
06 - Escreva um programa que solicite do usuário as duas notas de um aluno para calcular a sua média. O programa deve realizar o tratamento da digitação das notas para aceitar somente valores entre 0 1 10 (inluindo os limites). Caso a nota seja informada fora desse intervalo deve solicitar a digitação novamente. 
 *
 */
import java.util.Scanner;
public class exercicio06Aula2 {
    public static void main(String[] args) {

        Scanner Leitor = new Scanner(System.in);
     //declarando variaveis
        int nota1;
        int nota2;
        boolean intervalo = false;
        
        do{
            System.out.println(" digite a primeira nota do aluno : ");
            nota1 = Leitor.nextInt();
            if (nota1 > 10 || nota1 < 0) {
                intervalo = false;
                System.out.println("a nota que voce digitou esta fora do intervalo posivel digite sua nota entre 0 e 10 ");
            } else {
                intervalo = true;
            }  
        }while (!intervalo) ;

        do{ 
            System.out.println(" digite a segunda nota do aluno : ");
            nota2 = Leitor.nextInt();
            if (nota2 > 10 || nota2 < 0) {
                intervalo = false;
                System.out.println("a nota que voce digitou esta fora do intervalo posivel digite sua nota entre 0 e 10 ");
            } else {
                intervalo = true;
            }  
        } while (!intervalo);
        System.out.println("o calculo de  media dessas notas e igual a  " +((nota1 + nota2 )/ 2 ) );
        Leitor.close();
 }   
}