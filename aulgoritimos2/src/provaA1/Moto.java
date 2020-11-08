package provaA1;

public class Moto extends Veiculo {
   private double cilindradas;
    @Override
    public String toString() {
        return "moto :[modelo=" + modelo +"n/"+ ", pesso=" + pesso +"n/"+ ", potencia=" + potencia +"n/"+ ", velocidade="
                + velocidade + "]";
    }
    public void imprimir(){
        System.out.println(this);
    }
	public Moto(String modelo, double potencia, double pesso, double velocidade , double cilidradas) {
        super(modelo, potencia, pesso, velocidade);
        this.cilindradas = cilidradas;
	}  
}
