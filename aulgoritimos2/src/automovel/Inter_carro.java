package automovel;

import java.util.Scanner;

public interface Inter_carro {
    public void imprimir();

    static void ordenar(Automovel[] automoveis) {
        double velocidade = 0;
        int indice = 0;
        System.out.println("=====================o=====================");
        for (int i = 0; i <= automoveis.length; i++) {
            indice = 0;
            velocidade = 0;
            for (int j = 0; j < automoveis.length; j++) {
                if (velocidade < automoveis[j].velocidade && automoveis[j].colocacao == 0 ) {
                    indice = j;
                    velocidade = automoveis[j].velocidade ;
                } 
            }
            automoveis[indice].colocacao = i;
            automoveis[indice].imprimir();
            System.out.println("=====================o=====================");
        }
    }   
    public static Automovel lerAutomovel( Scanner leitor ){
        
        System.out.println("[1] para carro [2] para moto ");
        int tipo = leitor.nextInt();
        leitor.nextLine();
        System.out.println("qual o modelo do Auomovel ");
        String modelo = leitor.nextLine();
        System.out.println("qual a potencia do Automovel ?");
        Double potenciaReal = leitor.nextDouble();
        leitor.nextLine();
        Double potenciaTotal = potenciaReal;
        System.out.println("qual o pesso do automovel ?");
        Double pesso = leitor.nextDouble();
        leitor.nextLine();
        if (tipo ==1){
            System.out.println("quantas portas tem o carro?");

            return new Carro(modelo, potenciaTotal,potenciaReal , pesso,leitor.nextInt());
            
        }else{
            System.out.println("posui partida eletrica ? [1]sim[2]nao");
            boolean partidaEletrica = (leitor.nextInt()==1?true:false);
            return new Moto(modelo, potenciaTotal,potenciaReal , pesso,partidaEletrica);
        }
    } 

}
