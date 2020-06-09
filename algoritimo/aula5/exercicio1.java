import java.util.Scanner;
public class exercicio1{
    public static void main(String[] args) {
        float[] vetor = new float[10];
        String[] nomes = new String[10];
        float nota1, nota2;
        Scanner leitor = new Scanner(System.in);
        for (int posicao = 0; posicao < 10;posicao++) {
            
            System.out.println("digite o nome do aluno  " + posicao );
            nomes[posicao] = leitor.next();

            System.out.println("digite a nota 1 do aluno "+ posicao );
            nota1 = leitor.nextInt();

            System.out.println("digite a nota 2 do aluno "+ posicao );
            nota2 = leitor.nextInt();
            
            vetor[posicao]= (nota1 + nota2)/2;
            
        }

        for (int posicao = 0; posicao < nomes.length; posicao++) {
            System.out.println("a nota do aluno "+nomes[posicao]+"="+vetor[posicao]);
            
        }
    }
}