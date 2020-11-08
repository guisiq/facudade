package uber;

public class Viagem {
    private float valor;
    private float distancia;
    private String horaInicio;
    private Motorista motorista;
    //#region
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public float getDistancia() {
		return distancia;
	}
	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Motorista getMotorista() {
		return motorista;
	}
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
    }
    //#endregion
	public Viagem(float valor, float distancia, String horaInicio, Motorista motorista) {
		this.valor = valor;
		this.distancia = distancia;
		this.horaInicio = horaInicio;
		this.motorista = motorista;
	}
	public Viagem(String horaInicio, Motorista motorista) {
		this.horaInicio = horaInicio;
		this.motorista = motorista;
	}
	@Override
	public String toString() {
		return "Viagem [ distancia=" + distancia + ", horaInicio=" + horaInicio + ", motorista=" + motorista + ", valor="
				+ valor + " ]";
	}
}
