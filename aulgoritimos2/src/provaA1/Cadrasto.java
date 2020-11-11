package provaA1;

import java.util.Scanner;

public class Cadrasto {
    public static Veiculo lerDadosVeículo(){
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("[1] carro [2]moto");
        int tipo;
        tipo =leitor.nextInt();
       
        System.out.println("qual modelo ");
        String modelo =leitor.next();
        
        System.out.println(" qual a potencia");
        double potencia = leitor.nextDouble();
        System.out.println("qual o pesso");
        double pesso= leitor.nextDouble();
        System.out.println("qual a velocidade");
        double velocidade = leitor.nextDouble();
        if(tipo == 1){
            System.out.println("qual a quantidade de portas");
            int qantPortas = leitor.nextInt();
            System.out.println("Tem traçao nas 4 rodas [1] sim [2] nao");
            boolean tracaonas4 = (leitor.nextInt()==1);
            return new Carro(modelo, potencia, pesso, velocidade,qantPortas, tracaonas4);
        }else{
            System.out.println("qual a quantidade de cilindradas");
            double cilindradas = leitor.nextInt();
            return new Moto(modelo, potencia, pesso, velocidade,cilindradas);
        }

    }
    static void imprimirDados(Veiculo[] vet, int tipo){
        for (int i = 0; i < vet.length; i++) {
            
            if ( vet[i] instanceof Carro && tipo == 1 ) {
                vet[i]=(Carro)vet[i];
                vet[i].imprimir();
            } else if ( vet[i] instanceof Moto && tipo == 2) {
                vet[i]=(Moto)vet[i];
                vet[i].imprimir();
            }
        }
    }
    public static void main(String[] args) {
        Veiculo[] veiculos= new Veiculo[3];
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < veiculos.length; i++) {
            veiculos[i] = lerDadosVeículo();
        
        }
        System.out.println("deseja inprimir os dados de:");
        System.out.println("[1] todos os carros");
        System.out.println("[2] todas as motos ");
        int opcao = leitor.nextInt();
        imprimirDados(veiculos,opcao);

    }
}
