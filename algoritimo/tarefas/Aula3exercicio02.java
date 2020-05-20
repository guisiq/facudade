/**
2 - Considere uma pessoa que se desloca de carro ao longo de uma rodovia. Escreva um programa que solicite do usuário: o km do início da viagem, o km do fim da viagem, o horário de início da viagem, o horário do fim da viagem, o consumo médio do carro eo valor  do litro de combustível utilizado. O programa deve calcular e apresentar:
- a velocidade média 
- o valor gasto cmo combustível*
*
 */
import java.util.Scanner;
public class Aula3exercicio02 {
    public static void main(String[] args) {
        
        float distanciaInicial = 0 ;
        float distanciaFinal = 0 ;
        float horaInicial = 0 ;
        float horaFinal = 0 ;
        float consumoMedio = 0;
        float valorDoCombustivel = 0;

        double velocidadeMedia = 0 ;
        float valorGasto = 0f  ;
        //inicializando import
        Scanner Leitor = new Scanner(System.in);
        
        System.out.println("digite a distancia inicial da viagem");
        distanciaInicial = Leitor.nextFloat();        
        System.out.println("digite a hora do inicio da viagem use , no lugar de :  ");
        horaInicial = Leitor.nextFloat();
       // System.out.println("hora incial = " + horaInicial);                        //  
        horaInicial = (horaInicial - (horaInicial % 1) + ((horaInicial % 1) / 0.6f));//0.6f o f e para informa que 0.6 e float sem isso nao compila pois o progama acha que e doubles 
       // System.out.println("hora incial = " + horaInicial);
       
        System.out.println("digite a distancia final da viagem");
        distanciaFinal = Leitor.nextFloat();
        System.out.println("digite a hora do final da viagem ");
        horaFinal = Leitor.nextFloat();
        horaFinal = ((horaFinal- (horaFinal % 1)) + ((horaFinal % 1)/ 0.6f));//0.6f o f e para informa que 0.6 e float sem isso nao compila pois o progama acha que e doubles 
        System.out.println("digite consumo medio de gasolina do carro");
        consumoMedio = Leitor.nextFloat();
        System.out.println("digiteo valor do combustivel   ");
        valorDoCombustivel = Leitor.nextFloat();
        
        velocidadeMedia = ((distanciaFinal - distanciaInicial) / (horaFinal - horaInicial));
        System.out.println(velocidadeMedia);
        System.out.println(((distanciaFinal - distanciaInicial) / (horaFinal - horaInicial)));
       
        valorGasto = valorDoCombustivel * (consumoMedio * (distanciaFinal - distanciaInicial));
        System.out.println(valorGasto);
        System.out.println((valorDoCombustivel * (consumoMedio * (distanciaFinal - distanciaInicial))));
        System.out.println("a velocidade media e de " + ((distanciaFinal - distanciaInicial) / (horaFinal - horaInicial)));
        System.out.println(" o valo gasto calculado e de " + valorGasto);
        Leitor.close();
    }   
}