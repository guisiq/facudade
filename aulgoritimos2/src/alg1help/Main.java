package alg1help;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        float[] menorT  = new float[10];
        float[] maiorT  = new float[10];
        float maiorTAcumulado=0; 
        float menorTAcumulado=0; 
        
        int maiorVariacao=0;
        float maiorVariacaovalor=0;
        int maiorAumento=0;
        float maioraumentovalor=0;
        
        for (int i = 0; i < 10; i++) {

            System.out.println("qual a menor temperatura do dia "+(i+1));
            menorT[i] = leitor.nextFloat();
            menorTAcumulado += menorT[i];
            System.out.println("qual a maior temperatura do dia "+(i+1));
            maiorT[i] = leitor.nextFloat();
            maiorTAcumulado += maiorT[i];
            if ((maiorT[i]-menorT[i])> maiorVariacaovalor ) {
                maiorVariacao = i;
                maiorVariacaovalor = (maiorT[i]-menorT[i]);
            }
            if (i>0) {   
                if ((maiorT[i] - maiorT[i-1])> maioraumentovalor) {
                    maiorAumento = i;
                    maioraumentovalor = (maiorT[i] - maiorT[i-1]);
                }
            }
        }
        System.out.println("a media das maiores temperaturas e de :"+(maiorTAcumulado/10f));
        System.out.println("a media das menores temperaturas e de :"+(menorTAcumulado/10f));
        System.out.println();
        System.out.println("o dia que teve maior variacao de temperatura foi o dia: "+(maiorVariacao+1));
        System.out.println("com uma variacao de  "+(maiorVariacaovalor));
        System.out.println();
        System.out.println("o dia que teve maior aumento de temperatura foi o dia: "+(maiorAumento+1));
        System.out.println("com uma aumento de  "+(maioraumentovalor));
        System.out.println();
        for (int i = 0; i < maiorT.length; i++) {
            System.out.println(" a media de temperatura do dia " + (i+1) +"foi de: "+((maiorT[i]+menorT[i])/2f));
        }
    }
}
