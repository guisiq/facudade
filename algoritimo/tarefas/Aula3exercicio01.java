/**
 1 - Escreva um programa que permita ao usuário informar três valores correspondentes aos lados de um triângulo e informe se esses lados são válidos para a formação dessa figura geométrica.
*
 */
import java.util.Scanner;
public class Aula3exercicio01 {
    public static void main(String[] args) {

        int ladoAB; 
        int ladoBC;
        int ladoCA;

        //inicializando import
     Scanner Leitor = new Scanner(System.in);
     //declarando variaveis
     System.out.print("digite o valor da medidas de um triangulo que o progama ira falar se e posiveleu um triangulo com tais medidas");
     
     System.out.print("lado AB :");
     ladoAB = Leitor.nextInt(); 
     System.out.print("lado BC :");
     ladoBC = Leitor.nextInt(); 
     System.out.print("lado CA :");
     ladoCA = Leitor.nextInt();
     if (ladoAB > (ladoBC + ladoCA)  ) {
         System.out.println("o lado AB e maior do que a soma dos outros lados logo esse triangulo nao e posivel");
     } else if (ladoBC > (ladoAB + ladoCA)) {
        System.out.println("o lado BC e maior do que a soma dos outros lados logo esse triangulo nao e posivel");
    } else if (ladoCA > (ladoBC + ladoAB)) {
        System.out.println("o lado CA e maior do que a soma dos outros lados logo esse triangulo nao e posivel");
    } else {
        System.out.println("esse triangulo e possivel");
    }
    Leitor.close();
     
 }   
}