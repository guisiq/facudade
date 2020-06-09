
/**

7 - Faça um algoritmo que verifique se é mais vantajoso abastecer gasolina ou álcool. 
Solicite os valores da gasolina e do álcool;
Informe se a gasolina e se o álcool é mais vantajoso (verdadeiro ou falso).
Dica: Se o preço do álcool for maior que 70% do preço da gasolina, a gasolina é mais vantajosa.
 */
import java.util.Scanner;

public class Aula3exercicio08 {

    public static void main(String[] args) {
        Scanner Leitor      = new Scanner(System.in);
        float notaA1;
        float notaA2;
        
        System.out.println("digite sua nota na avaliacao A1 ");
        notaA1 = Leitor.nextFloat();

        System.out.println("digite sua nota na avaliacao A2 ");
        notaA2 = Leitor.nextFloat();

        if (notaA1 + notaA2 > 14) {
            System.out.println("parabens voce foi aprovado ");    
            
        } else if (notaA1 + notaA2 < 8  ) {
            System.out.println("voce foi reprovado e sua nota e insuficiente para realisar o exame ");    
            
        } else {
            System.out.println("voce precisara fazer o exame final e tera que tira uma nota igual ou superior a "
                    + (14 - ((notaA1 + notaA2) / 2)));

        }
        Leitor.close();
    }
        
}