/**
7 - Faça um algoritmo que verifique se é mais vantajoso abastecer gasolina ou álcool. 
Solicite os valores da gasolina e do álcool;
Informe se a gasolina e se o álcool é mais vantajoso (verdadeiro ou falso).
Dica: Se o preço do álcool for maior que 70% do preço da gasolina, a gasolina é mais vantajosa.
 */
import java.util.Scanner;

public class Aula3exercicio07 {
    public static void main(String[] args) {
        Scanner Leitor  = new Scanner(System.in);
        float valorDaGasolina;
        float valorDoAlcool;
        float autonomiaComGasolina;
        float autonomiaComAlcool;
        //entrada de dados
        System.out.println("digite o preco do álcool (R$/l) ");
        valorDoAlcool = Leitor.nextFloat();

        System.out.println("digite o preco da gasolina (R$/l) ");
        valorDaGasolina = Leitor.nextFloat();

        System.out.println("digite a autonomia do caro com gasolina (Km/l) ");
        autonomiaComGasolina = Leitor.nextFloat();

        System.out.println("digite a autonomia do carro com álcool(Km/l) ");
        autonomiaComAlcool = Leitor.nextFloat();
        //saida de dados
        if (autonomiaComAlcool/valorDoAlcool > autonomiaComGasolina/valorDaGasolina) {
            System.out.println("a relacao custo beneficio do álcool e melhor do que a da gasolina");
        }else if (autonomiaComAlcool/valorDoAlcool < autonomiaComGasolina/valorDaGasolina) {
            System.out.println("a relacao custo beneficio da gasolina e melhor do que a do álcool");
        } else if (autonomiaComAlcool / valorDoAlcool == autonomiaComGasolina / valorDaGasolina) {
            System.out.println(" a relacao custo beneficio das duas opcoes sao iguais ");
        }
        Leitor.close();
    }
        
}