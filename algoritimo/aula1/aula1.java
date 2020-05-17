package aula1;

import java.util.Scanner;
public class aula1{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float mediaA1, mediaA2,media;
        System.out.println("digite sua media A1");
        mediaA1 = leitor.nextInt();
        System.out.println("digite sua media na avaliacao A2");
        mediaA2 = leitor.nextInt();
        media = (mediaA1 + mediaA2) / 2;
        if (media >= 6 ){
            System.out.println(" voce esta aprovado ");

        } else {
            int exameFinal = 0;
            System.out.println("digite a nota do seu exame final ");
            exameFinal = leitor.nextInt();
            media = (media + exameFinal) / 2;
            if (media >= 6) {
                System.out.println("voce passou com o exame final ");
                
            } else {
                System.out.println("voce reprovou");
                
            }
        
        }
    }
}   