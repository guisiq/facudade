import java.util.Scanner;
public class Aula3exercicio01 {
    public static void main(String[] args) {
    //inicializando import
    Scanner Leitor = new Scanner(System.in);
    //declarando variaveis
    int[] numero = new int[20];
    numeroinicial =  0;
    razao = 0 ;
    System.out.println("digite o numero inicial " );
    numeroinicial = leitor.nextInt();
    
    System.out.println("digite a razao da PA " );
    Razao = leitor.nextInt();
    numero[0] = numeroinicial + razao;
    for (int linha = 1; linha < numero.length; coluna++) {
        numero[linha] = numero[linha-1] + razao;
        System.out.println(numerolinha[linha] );
    }
 }
}