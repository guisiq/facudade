import java.util.Scanner;
public class desafioAula2
{
    public static void main(String[] args) {
        //inicializando import
        Scanner leitor = new Scanner(System.in);

        //declarando as variaveis 
        String nomeDaCidade1 = "Goiania";
        String nomeDaCidade2 = "Palmas";
        Double populacaoDaCidade1 = 1000000.0;
        Double populacaoDaCidade2 = 300000.0;
        Double taxaDeCrecimento1 = 0.003;
        Double taxaDeCrecimento2 = 0.07;
        Double calculoFaixaDeErro = 1.0;
        Double calculoFaixaDeErro2 = 1.0;       
        int tempo = 0;
        boolean continuar = true;
        //coletanto dado

        /*
        System.out.println("digite o nome da primeira cidade ");
        nomeDaCidade1 = leitor.next();
        System.out.println("digite a populacao da primeira cidade ");
        populacaoDaCidade1 = leitor.nextDouble();
        System.out.println("digite a taxa de crecimento da primeira cidade em % ");
        taxaDeCrecimento1 =( leitor.nextDouble()/1000 );
        
        System.out.println("digite o nome da segunda cidade ");
        nomeDaCidade2 = leitor.next();
        System.out.println("digite a populacao da segunda cidade ");
        populacaoDaCidade2 = leitor.nextDouble();
        System.out.println("digite a taxa de crecimento da segunda cidade");
        taxaDeCrecimento2 = ( leitor.nextDouble()/1000 );
        
        
        System.out.println("digite a taxa de erro em % ");
        taxaDeErro = ( leitor.nextDouble()/100 );
        */

        //procesamento de dados 
        while (populacaoDaCidade1 != populacaoDaCidade2 && continuar) {
            calculoFaixaDeErro2 = calculoFaixaDeErro;

            populacaoDaCidade1 = (populacaoDaCidade1 * (1 + taxaDeCrecimento1));
            populacaoDaCidade2 = (populacaoDaCidade2 * (1 + taxaDeCrecimento2));

            calculoFaixaDeErro =Math.abs((populacaoDaCidade1 - populacaoDaCidade2) / (populacaoDaCidade1 + populacaoDaCidade2));

            if (Math.abs(calculoFaixaDeErro) > Math.abs(calculoFaixaDeErro2)) {
                continuar = false;
            } else {
                tempo = tempo + 1;
                System.out.println(" em " + tempo + " anos as populacoes das cidades de " + nomeDaCidade1 + " e " + nomeDaCidade2 + " serra respectivamente: ");
                System.out.println(populacaoDaCidade1 + " e " + populacaoDaCidade2);
                //calculando a faixa de erro 

                System.out.println("e uma diferenca de  :" + (calculoFaixaDeErro * 100) + "%");
            }

        }

        System.out.println(" em " + tempo + " a populacoe estacao com a menor diferencia de populacao " );
        leitor.close();
    }

}
