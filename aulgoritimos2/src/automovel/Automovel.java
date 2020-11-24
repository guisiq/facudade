package automovel;

public abstract class Automovel implements Inter_carro {    
   protected String modelo;
   protected double potenciaTotal;//N
   protected double potenciaReal;//N
   protected double pesso ;//Kg
   protected double velocidade ;//m/s 
   protected int colocacao = 0;

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
    

    
    public Automovel(String modelo, double potenciaTotal, double potenciaReal, double pesso) {
        this.modelo = modelo;
        this.potenciaTotal = potenciaTotal;
        this.potenciaReal = potenciaReal;
        this.pesso = pesso;
    }
    
    //#regionmetodos geters e setes 
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPotenciaTotal() {
        return potenciaTotal;
    }

    public void setPotenciaTotal(double potenciaTotal) {
        this.potenciaTotal = potenciaTotal;
    }

    public double getPotenciaReal() {
        return potenciaReal;
    }

    public void setPotenciaReal(double potenciaReal) {
        this.potenciaReal = potenciaReal;
    }

    public double getPesso() {
        return pesso;
    }

    public void setPesso(double pesso) {
        this.pesso = pesso;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getColocacao() {
        return colocacao;
    }

    public void setColocacao(int colocacao) {
        this.colocacao = colocacao;
    }
    //#region
    
}