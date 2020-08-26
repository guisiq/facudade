import java.util.Scanner;
public class Main{
public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int numero=ler.nextInt();
        double numeroDouble=numero;
        if ((numeroDouble/numeroDouble)==(numero/numero)){
            if(numeroDouble/2!=numero/2 || numero==2){
                System.out.println("Este numero é primo!");
            } else {
                System.out.println("Este numero não é primo!");
            }
        } else {
            System.out.println("Numero não é primo!");
        }
	}
}