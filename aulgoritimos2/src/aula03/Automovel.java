package aula03;
import java.util.Scanner;
public class Automovel {
    enum TipoAutomovel {
        CARRO("carro"),MOTO("moto"),CAMINHAO("caminhao");
        final String NOME ;
        TipoAutomovel(String valorOpcao ) {
            NOME = valorOpcao;
        }
    }
    TipoAutomovel tipo;
    String modelo;
    double potenciaTotal;//N
    double potenciaReal;//N
    double pesso ;//Kg
    double velocidade ;//m/s 
    int colocacao = 0;
    
    public  void lerAutomovel() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("qual o tipo de altomovel ? " );
        for (TipoAutomovel i : this.tipo.values()) {
            System.out.println( /*i.ordinal() +*/"   -"+i.toString());
        }
        String aux = leitor.next();
        leitor.nextLine(); 
        this.tipo = TipoAutomovel.valueOf(aux.toUpperCase());
        System.out.println("qual o modelo do Auomovel ");
        this.modelo = leitor.nextLine();
        System.out.println("qual a potencia do Automovel ?");
        this.potenciaReal = leitor.nextDouble();
        leitor.nextLine();
        this.potenciaTotal = potenciaReal;
        System.out.println("qual o pesso do automovel ?");
        this.pesso = leitor.nextDouble(); leitor.nextLine();
    }
    public void aceleracao(){
        if (this.potenciaReal > (this.potenciaTotal*0.15f)) {
            this.velocidade += 5 ;
            double desconto = (this.pesso - (pesso%300)/ 300 );
            this.velocidade = (this.velocidade * (this.potenciaTotal*0.15f))-(desconto);
            this.potenciaReal = this.potenciaReal-(this.potenciaTotal*0.15f);
        } else if(this.potenciaReal > 0) {
            this.velocidade = (this.velocidade * this.potenciaReal)-(this.pesso/300);
            this.potenciaReal = 0;
            if (this.velocidade<0) {
                this.velocidade = 0;
            }
        }
    }
    public void freagem() {
        this.velocidade = this.velocidade * 0.75f ;
    }
    public void imprimir() {
        System.out.println("colocacao : "+this.colocacao+"°");
        System.out.println("tipo      : "+this.tipo.NOME);
        System.out.println("nome      : "+this.modelo);
        System.out.println("pesso     : "+this.pesso);
        System.out.println("potencia  : "+this.potenciaTotal);
        System.out.println("velocidade: "+this.velocidade);
    }
}