package automovel;

import java.util.Scanner;

public class Corrida {    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Automovel[]  automoveis = new Automovel[10];
        System.out.println("cadastre os automoveis para corida  ");
        for (int i = 0; i < automoveis.length; i++) {
            //automoveis[i] = new Automovel();
            automoveis[i]= Inter_carro.lerAutomovel(leitor); 
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
        Inter_carro.ordenar(automoveis);        
    }
}