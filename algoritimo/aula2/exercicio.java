import java.util.Scanner;
public class exercicio
{
    public static void main(String[] args) {
        //inicializando import
        Scanner leitor = new Scanner(System.in);

	//declarando as variaveis 
	String nomeDaCidade1 = "Goiania"; 
	String nomeDaCidade2 = "Palmas";
	int populacaoDaCidade1 = 1000000 ; 
    int populacaoDaCidade2 = 300000 ;
    Double taxaDeCrecimento1 = 0.003 ;
    Double taxaDeCrecimento2 = 0.07 ;
    int calculoDePopulacao1 = populacaoDaCidade1 ;
    int calculoDePopulacao2 = populacaoDaCidade2 ; 
    int tempo = 0;
    boolean continuar = true;
    //coletanto dado
    
    
    System.out.println("digite o nome da primeira cidade ");
    nomeDaCidade1 = leitor.next();
    System.out.println("digite a populacao da primeira cidade ");
    populacaoDaCidade1 = leitor.nextInt();
    System.out.println("digite a taxa de crecimento da primeira cidade em % ");
    taxaDeCrecimento1 =( leitor.nextDouble()/1000 );

    System.out.println("digite o nome da segunda cidade ");
    nomeDaCidade2 = leitor.next();
    System.out.println("digite a populacao da segunda cidade ");
    populacaoDaCidade2 = leitor.nextInt();
    System.out.println("digite a taxa de crecimento da segunda cidade");
    taxaDeCrecimento2 = ( leitor.nextDouble()/1000 );

    
    //procesamento de dados 
    while (calculoDePopulacao1 != calculoDePopulacao2 && continuar) {
        calculoDePopulacao1 = (int) (populacaoDaCidade1 * (Math.pow(1 + taxaDeCrecimento1, tempo)));
        calculoDePopulacao2 = (int) (populacaoDaCidade2 * (Math.pow(1 + taxaDeCrecimento2, tempo)));
        tempo = tempo + 1;
        System.out.println(" em " + tempo + " anos as populacoes das cidades de " + nomeDaCidade1 + " e " + nomeDaCidade2 + " serra respectivamente: " );
        System.out.println(calculoDePopulacao1 + " e " + calculoDePopulacao2);
        if ( (populacaoDaCidade1 - populacaoDaCidade2) < 50000  ||  (populacaoDaCidade1 - populacaoDaCidade2) > -50000  ) {
            continuar = false;
        }
    }
    System.out.println("as populacoes de "  + nomeDaCidade1 + "e" + nomeDaCidade2 +   " se igualaram em aprocimadamente " + tempo + "anos com a populacoes de repectivamente :");
    System.out.println(calculoDePopulacao1 + " e " + calculoDePopulacao2);
    leitor.close();
	}
}
