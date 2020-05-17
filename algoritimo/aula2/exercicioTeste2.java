import java.util.Scanner;
public class exercicioTeste2
{
    public static void main(String[] args) {
        //inicializando import
        Scanner leitor = new Scanner(System.in);

	//declarando as variaveis 
	String nomeDaCidade1 = "Goiania"; 
	String nomeDaCidade2 = "Palmas";
	Double populacaoDaCidade1 = 100.0 ; 
    Double populacaoDaCidade2 = 30.0 ;
    Double taxaDeCrecimento1 = 0.003 ;
    Double taxaDeCrecimento2 = 0.07 ;
//    Double calculoDePopulacao1 = populacaoDaCidade1 ;
//    Double calculoDePopulacao2 = populacaoDaCidade2 ; 
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

    */
    
    //procesamento de dados 
    while ((populacaoDaCidade1 != populacaoDaCidade2 &&  continuar) && tempo < 20   ) {
        populacaoDaCidade1 = (populacaoDaCidade1 * (1 + taxaDeCrecimento1));
        populacaoDaCidade2 = (populacaoDaCidade2 * (1 + taxaDeCrecimento2));
        
        
        tempo = tempo + 1;
        System.out.println(" em " + tempo + " anos as populacoes das cidades de " + nomeDaCidade1 + " e " + nomeDaCidade2 + " serra respectivamente: " );
        System.out.println(populacaoDaCidade1 + " e " + populacaoDaCidade2);
        
        /**
         *         if ( -0.1 < (populacaoDaCidade1 - populacaoDaCidade2) < 0.1  ) {
            continuar = false;
        }
         * 
         * 
         */
    }
    System.out.println("as populacoes de "  + nomeDaCidade1 + "e" + nomeDaCidade2 +   " se igualaram em aprocimadamente " + tempo + "anos com a populacoes de repectivamente :");
    System.out.println(populacaoDaCidade1 + " e " + populacaoDaCidade2);
    leitor.close();
}
}
