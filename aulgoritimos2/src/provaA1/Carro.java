package provaA1;

public class Carro extends Veiculo{
    private int quantPortas; // 2,3,4
    private boolean tracaoNas4;
    @Override
    public String toString() {
        return "carro :[modelo=" + modelo +"n/"+ ", pesso=" + pesso +"n/"+ ", potencia=" + potencia +"n/"+ ", velocidade="
                + velocidade + "n/"+"quantidade de Portas"+quantPortas+"n/"+(tracaoNas4? "com tracao nas quatro rodas":"sem tracao nas quatro rodas");
    }

    public void imprimir(){
        System.out.println(this);
    }

	public int getQuantPortas() {
		return quantPortas;
	}

	public void setQuantPortas(int quantPortas) {
		this.quantPortas = quantPortas;
	}

	public boolean isTracaoNas4() {
		return tracaoNas4;
	}

	public void setTracaoNas4(boolean tracaoNas4) {
		this.tracaoNas4 = tracaoNas4;
	}

	public Carro(String modelo, double potencia, double pesso, double velocidade, int quantPortas, boolean tracaoNas4) {
		super(modelo, potencia, pesso, velocidade);
		this.quantPortas = quantPortas;
		this.tracaoNas4 = tracaoNas4;
	}

	public Carro() {
	}
}
