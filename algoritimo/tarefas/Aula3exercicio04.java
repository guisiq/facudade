
/**
 4 - Considere um programa para avaliação de um rebanho bovino. Ele deve permitir ao usuário informar os seguintes dados de bovinos: peso, idade, altura, sexo. O programa deve apresentar ao final o seguinte relatório:
- Altura do bovino mais alto
- Peso do bovino mais pesado
- A média de peso dos bovinos
- A quantidade de machos e fêmeas no rebanho
- calcula a média de idade e a diferença de idade entre o mais velho e o mais novo.
 */
import java.util.Scanner;

public class Aula3exercicio04 {
    public static void main(String[] args) {

        int idadeDigitada    = 0;
        float aulturaDoBoi   = 0;
        float boiMaisAulto   = 0;
        float pesoDoBoi      = 0;
        float boiMaisPesado  = 0;
        float pesoMedioDoBoi = 0;
        float idademedia     = 0;
        int idadeDoBoi       = 0;
        int boiMaisVelho ;
        int boiMaisjoven ;
        int diferençaDeIdade = 0;
        int quantDeBoiMacho  = 0;
        int quantDeBoiFemea  = 0;
        char sexoDoBoi;
        boolean continuar = true;
        //inicializando import
        Scanner Leitor = new Scanner(System.in);

        //foi preciso rodar a coleta e o procesamento de dados uma vez antes do loop pora atribuir um valor na variavel boiMaisVelho e boiMaisNovo se nao haveria um erro de logica no progama     
        // dados de bovinos: peso, idade, altura, sexo.

        System.out.println("digite o pesso do boi ");
        pesoDoBoi = Leitor.nextFloat();

        System.out.println("digite a idade do boi ");
        idadeDoBoi = Leitor.nextInt();
        boiMaisVelho = idadeDoBoi;
        boiMaisjoven = idadeDoBoi;

        System.out.println("digite a autura do boi ");
        aulturaDoBoi = Leitor.nextFloat();

        System.out.println("digite o sexo do boi [m]macho [f]femea");
        sexoDoBoi = Leitor.next().charAt(0);
        for (boolean continuar1 = true; continuar1 == true;) {
            if (sexoDoBoi != 'm' && sexoDoBoi != 'f') {
                System.out.println(
                        "a letra digitada nao coresponde as auternativa digite [m] para macho ou [f] para femea");
                sexoDoBoi = Leitor.next().charAt(0);
            } else {
                continuar1 = false;

            }
        }

        //- Altura do bovino mais alto
        if (aulturaDoBoi > boiMaisAulto) {
            boiMaisAulto = aulturaDoBoi;
        }
        //- Peso do bovino mais pesado
        if (pesoDoBoi > boiMaisPesado) {
            boiMaisPesado = pesoDoBoi;
        }
        //- A quantidade de machos e fêmeas no rebanho
        if (sexoDoBoi == 'm') {
            quantDeBoiMacho++;
        } else {
            quantDeBoiFemea++;
        }
        //- A média de peso dos bovinos
        pesoMedioDoBoi = (pesoMedioDoBoi * (quantDeBoiMacho + quantDeBoiFemea - 1) + pesoDoBoi) / (quantDeBoiMacho + quantDeBoiFemea);
        //- calcula a média de idade e a diferença de idade entre o mais velho e o mais novo.
        idademedia = (idademedia * (quantDeBoiFemea + quantDeBoiMacho - 1) + idadeDigitada)/ (quantDeBoiMacho + quantDeBoiFemea);
        System.out.println("digite um numero negativo quan perguntar o pesso caso desege parar ");
        
        while (continuar == true) {

            // dados de bovinos: peso, idade, altura, sexo.
            System.out.println("digite o pesso do boi ");
            pesoDoBoi = Leitor.nextFloat();
            if (pesoDoBoi < 0) {
                break;    
            }
            System.out.println("digite a idade do boi ");
            idadeDoBoi = Leitor.nextInt();
            System.out.println("digite a autura do boi ");
            aulturaDoBoi = Leitor.nextFloat();

            System.out.println("digite o sexo do boi [m]macho [f]femea");
            sexoDoBoi = Leitor.next().charAt(0);
            for (boolean continuar1 = true; continuar1 == true;) {
                if (sexoDoBoi != 'm' || sexoDoBoi != 'f') {
                    System.out.println(
                            "a letra digitada nao coresponde as auternativa digite [m] para macho ou [f] para femea");
                    sexoDoBoi = Leitor.next().charAt(0);
                }else {
                continuar1 = false;
                
            }
            }

            //- Altura do bovino mais alto
            if (aulturaDoBoi > boiMaisAulto) {
                boiMaisAulto = aulturaDoBoi;
            }

            //- Peso do bovino mais pesado
            if (pesoDoBoi > boiMaisPesado  )  {
                boiMaisPesado = pesoDoBoi;
            }
            //- A quantidade de machos e fêmeas no rebanho
            if (sexoDoBoi == 'm') {
                quantDeBoiMacho++;
            } else {
                quantDeBoiFemea++;
            }
            //- A média de peso dos bovinos
            pesoMedioDoBoi = (pesoMedioDoBoi * (quantDeBoiMacho + quantDeBoiFemea - 1) + pesoDoBoi)
                    / (quantDeBoiMacho + quantDeBoiFemea);
            //- calcula a média de idade e a diferença de idade entre o mais velho e o mais novo.
            idademedia = (idademedia * (quantDeBoiFemea + quantDeBoiMacho - 1) + idadeDigitada)
                    / (quantDeBoiMacho + quantDeBoiFemea);

            if (idadeDigitada > boiMaisVelho) {
                boiMaisVelho = idadeDigitada;
            } else if (idadeDigitada < boiMaisjoven) {
                boiMaisjoven = idadeDigitada;
            }
            diferençaDeIdade = boiMaisVelho - boiMaisjoven;
        
        }
        //        - Altura do bovino mais alto
        System.out.println("o boi mais aulto mede " + boiMaisAulto + " metros de autura " ) ;
        //        - Peso do bovino mais pesado
        System.out.println("o boi mais pesado pesa " + boiMaisPesado + "kg" ) ;
        //        - A média de peso dos bovinos
        System.out.println("o peso medio dos bois e de  " +pesoMedioDoBoi+ "kg" ) ;
        //        - A quantidade de machos e fêmeas no rebanho
        System.out.println("ha " + quantDeBoiFemea + " femeas e  "+ quantDeBoiMacho+ " machos" ) ;
        //        - calcula a média de idade e a diferença de idade entre o mais velho e o mais novo.
        System.out.println("a media de idades dos bois e de  " + idademedia + " anos e a diferenca de idade entre o boi mais velho e o mais joven e de   "+ diferençaDeIdade +"anos" ) ;
        Leitor.close();
        

    }
        
}