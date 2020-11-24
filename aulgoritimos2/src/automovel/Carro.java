package automovel;

public class Carro extends Automovel {
    protected int quantPortas ;
    
    public void imprimir() {
        //System.out.println("tipo      : "+this.tipo);
        System.out.println("automovel        : Carro");
        System.out.println("colocacao        : "+this.colocacao+"°");
        System.out.println("nome             : "+this.modelo);
        System.out.println("pesso            : "+this.pesso);
        System.out.println("potencia         : "+this.potenciaTotal);
        System.out.println("velocidade       : "+this.velocidade);
    }

    public Carro(String modelo, double potenciaTotal, double potenciaReal, double pesso,int quantPortas) {
        super(modelo, potenciaTotal, potenciaReal, pesso);
        this.quantPortas = quantPortas;
    }


}
