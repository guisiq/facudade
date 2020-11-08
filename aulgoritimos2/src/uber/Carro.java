package uber;

public class Carro {
    private String placa;
    private float Kilometragem;
    private String modelo;
    private String cor;
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public float getKilometragem() {
		return Kilometragem;
	}
	public void setKilometragem(float kilometragem) {
		Kilometragem = kilometragem;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Carro(String placa, float kilometragem, String modelo, String cor) {
		this.placa = placa;
		Kilometragem = kilometragem;
		this.modelo = modelo;
		this.cor = cor;
	}
	public Carro() {
	}
	@Override
	public String toString() {
		return "Carro [Kilometragem=" + Kilometragem + ", cor=" + cor + ", modelo=" + modelo + ", placa=" + placa + "]";
	}
}
