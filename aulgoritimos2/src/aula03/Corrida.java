package aula03;
public class Corrida {
    static void ordenar(Automovel[] automoveis) {
        double velocidade = 0;
        int indice = 0;
        for (int i = 1; i <= automoveis.length; i++) {
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
        }
    }    
    public static void main(String[] args) {
        Automovel[]  automoveis = new Automovel[2];
        System.out.println("cadastre os automoveis para corida  ");
        for (int i = 0; i < automoveis.length; i++) {
            automoveis[i] = new Automovel();
            automoveis[i].lerAutomovel(); 
        }
        for (int segundo = 0; segundo < 15; segundo++) {
            for (int i = 0; i < automoveis.length; i++) {
                if (segundo!=7  &&  segundo!=12){
                    automoveis[i].aceleracao();
                } else {
                    automoveis[i].freagem();
                }
            }
        }
        ordenar(automoveis);        
    }
}