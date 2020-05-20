/**

3 - Escreva um programa que solicite do usuário a idade de diversas pessoas (enquanto houver o desejo de continuar digitando), ao final o programa deve apresentar:
- a quantidade de crianças (até 12 anos)
- a quantidade de adolescentes (até 18 anos)
- a quantidade de jovens (até 25 anos)
- a quantidade de adultos (até 59 anos)
- a quantidade de idosos (a partir de 60 anos) 

 */
import java.util.Scanner;
public class Aula3exercicio03 {
    public static void main(String[] args) {
        
        int idadeDigitada;

        int quantidadeDeCrianças = 0;                //( Até12Anos;)
        int quantidadeDeAdolescentes = 0;            // (até 18 anos)
        int quantidadeDeJovens = 0;                  // (até 25 anos)
        int quantidadeDeAdultos = 0;                 // (até 59 anos)
        int quantidadeDeIdosos = 0 ;                 // (a partir de 60 anos) 
        
        boolean continuar = true;
         
        
        //inicializando import
        Scanner Leitor = new Scanner(System.in);
        
        System.out.println("digite idades o quantas idade desejar digite uma idade negativa para encerar o progama ");
        
        while (continuar == true) {

            System.out.println("digite a idade ");
            idadeDigitada = Leitor.nextInt();
    

            //- a quantidade de crianças (até 12 anos)
            if (idadeDigitada < 0){
                continuar = false;
            } else if (idadeDigitada <= 12  ){
               ++quantidadeDeCrianças ;
            } else if(idadeDigitada <= 18) {
                ++quantidadeDeAdolescentes;
            }else if(idadeDigitada <= 25) {
                ++quantidadeDeJovens ;
            }else if(idadeDigitada <= 59) {
                ++quantidadeDeAdultos ;
            }else if(idadeDigitada <= 60) {
                ++quantidadeDeIdosos ;
            }
            
        }
        // - a quantidade de crianças (até 12 anos)
        System.out.println(" ha " + quantidadeDeCrianças+ " criancas(de ate 12 anos) ");
        //- a quantidade de adolescentes (até 18 anos)
        System.out.println(" ha " +quantidadeDeAdolescentes+ " adolecentes ( de 12 a 18 anos) ");
        //- a quantidade de jovens (até 25 anos)
        System.out.println(" ha " +quantidadeDeJovens+ " jovens (de 18 a 25 anos) ");
        //- a quantidade de adultos (até 59 anos)
        System.out.println(" ha " +quantidadeDeAdultos+ " adutos (de 25 a 59 anos ) ");
        //- a quantidade de idosos (a partir de 60 anos) 
        System.out.println(" ha " +quantidadeDeIdosos+ " idosos (aparti de 60 anos )");
        Leitor.close();
 }   
}