package automovel;

public class Moto extends Automovel {

    protected Boolean posuiPartidaEletrica;

    public void imprimir() {
        //System.out.println("tipo      : "+this.tipo);
        System.out.println("automovel        : Moto");
        System.out.println("partida eletrica : posui");
        System.out.println("colocacao        : "+this.colocacao+"°");
        System.out.println("nome             : "+this.modelo);
        System.out.println("pesso            : "+this.pesso);
        System.out.println("potencia         : "+this.potenciaTotal);
        System.out.println("velocidade       : "+this.velocidade);
    }

    public Moto(String modelo, double potenciaTotal, double potenciaReal, double pesso, Boolean posuiPartidaEletrica) {
        super(modelo, potenciaTotal, potenciaReal, pesso);
        this.posuiPartidaEletrica = posuiPartidaEletrica;
    }
    

    
}
