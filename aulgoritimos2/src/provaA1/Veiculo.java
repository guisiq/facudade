package provaA1;
import java.util.Scanner;
public class Veiculo {
    protected String modelo;
    protected double potencia;//N
    protected double pesso ;//Kg
    protected double velocidade ;//m/s

    @Override
    public String toString() {
        return "Veiculo :[modelo=" + modelo +"\n"+ ", pesso=" + pesso +"\n"+ ", potencia=" + potencia +"\n"+ ", velocidade="
                + velocidade + "]";
    }
    public void imprimir(){
        System.out.println(this);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
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

    public Veiculo(String modelo, double potencia, double pesso, double velocidade) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.pesso = pesso;
        this.velocidade = velocidade;
    }
	public Veiculo() {
	}

    
}
