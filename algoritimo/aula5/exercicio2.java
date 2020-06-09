import java.util.Scanner;
public class exercicio2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("digite um valor ");
        numeros[0] = leitor.nextInt();
        if (numeros[0] % 2 == 1) {
            numeros[1] = numeros[0] + 1;
        } else {
            numeros[1] = numeros[0] + 2;
        }
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);

        for (int i = 1; i < numeros.length; i++) {
            numeros[i] = numeros[i-1] + 2;
            System.out.println(numeros[0]);

        //     numeros[i] = numeros[i - 1] + 2;
        //     System.out.println(numeros[i]);
        //
        }
        leitor.close();
    }
    
}