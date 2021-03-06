
/**
 02 - Escreva um programa que permita ao usuário informar a marca, o modelo, o ano e o valor de carros de uma loja de usados (quantas posições você achar adequado). O usuário terá a opção de fazer pesquisas, por intervalos de ano e de valor. O programa deve mostrar somente os dados dos carros que estiverem dentro do intervalo desejado pelo usuário. 

Exemplo:
VW    Gol    1998    12000
GM    Astra    2000    13000
FIAT    Palio    2005    14000
KIA    Ceratto    2020    90000
JEEP    Compass    2016    87000
HONDA    Civic    2013    40000

Pesquisa por ano: 2005 a 2014
FIAT    Palio    2005    14000
HONDA    Civic    2013    40000

Pesquisa por valor:50000 a 90000
KIA    Ceratto    2020    90000
JEEP    Compass    2016    87000
 */
import java.util.Scanner;

 public class Aula5exercicio02 {
     public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] marca = new String[5];
        String[] modelo = new String[marca.length];
        int[] ano = new int[marca.length];
        int[] valor = new int[marca.length];
        int idadeMinima;
        int idadeMaxima;
        int precoMinimo;
        int precoMaximo;
        boolean elementosDentroDoIntervalo = false;

        for (int i = 0; i < valor.length; i++) {
        
            System.out.println("digite a marca do carro ");
            marca[i] = leitor.next();    
            System.out.println("digite o modelo do carro ");
            modelo[i] = leitor.next();
            System.out.println("digite o valor do carro ");
            valor[i] = leitor.nextInt();
            System.out.println("digite o ano do  carro ");    
            ano[i] = leitor.nextInt();
        
        }

        System.out.println("digite o ano minimo do intervalo de ano de fabricacao do carro do carro que busca ");
        idadeMinima = leitor.nextInt();
        System.out.println("digite o ano maximo do intervalo de ano de fabricacao do carro do carro que busca ");
        idadeMaxima = leitor.nextInt();
        
        System.out.println("digite o preço minimo do carro que busca ");
        precoMinimo = leitor.nextInt();
        System.out.println("digite o preço maximo  do carro que busca ");
        precoMaximo = leitor.nextInt();
        
        System.out.println("os caros nesse intervalo sao :");
        for (int i = 0; i < valor.length; i++) {
            if (idadeMinima < ano[i] && idadeMaxima > ano[i]) {
                if (precoMinimo < valor[i] && precoMaximo > valor[i]) {
                    System.out.println(marca[i] + " " + modelo[i] + " " + ano[i] + " " + valor[i]);
                    elementosDentroDoIntervalo = true;
                }
            }

        }
        if (!elementosDentroDoIntervalo) {
            System.out.println("Nao ha caros com as caracteristicas dentro dos intervalos   selecionados ");
        }
        leitor.close();
    }
}