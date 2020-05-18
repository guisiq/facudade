import java.util.Scanner;
import java.util.Random;
public class aula03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random aleatorio = new Random(); 
        //Random aleatorio = new Random(S)
        int numeroDigitado = 0;
        int numeroSorteado = aleatorio.nextInt(10);
        int tentativa = 10 ;
        System.out.println("digite um numero entre 0 e 10 que voce acha que foi sorteado : ");
        numeroDigitado = leitor.nextInt();
        tentativa--;
        for(; tentativa > 0  ; tentativa--) {
            if (numeroSorteado > numeroDigitado) {
                System.out.print("o numero sorteado e maior do que o digitado  digite novamente ");
                System.out.println("voce tem mais " + tentativa + "chances");
                numeroDigitado = leitor.nextInt();

            } else if (numeroSorteado < numeroDigitado) {
                System.out.print("o numero sorteado e menor do que o digitato digite novamente ");
                System.out.println(" voce tem mais " + tentativa + "chances");
                numeroDigitado = leitor.nextInt();
            }else if (numeroSorteado == numeroDigitado ){
                System.out.println("parabens voce asertou faltando "+ tentativa +" tentativa " );
                tentativa = 0 ;
            }
            
        }
            
    }
}
//break