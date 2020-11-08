package uber;

public class Motorista extends Pessoa {
    private int clasificacao;//numero de estrelas
    private int quantCorida;
    private float luclo;
    private Carro carro;
    private Localizacao localizacao;
	public int getClasificacao() {
		return clasificacao;
	}
	public void setClasificacao(int clasificacao) {
		this.clasificacao = clasificacao;
	}
	public int getQuantCorida() {
		return quantCorida;
	}
	public void setQuantCorida(int quantCorida) {
		this.quantCorida = quantCorida;
	}
	public float getLuclo() {
		return luclo;
	}
	public void setLuclo(float luclo) {
		this.luclo = luclo;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public Localizacao getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
	public Motorista(String nome, String cpf, String email, String telefone, int clasificacao, int quantCorida,
			float luclo, Carro carro, Localizacao localizacao) {
		super(nome, cpf, email, telefone);
		this.clasificacao = clasificacao;
		this.quantCorida = quantCorida;
		this.luclo = luclo;
		this.carro = carro;
		this.localizacao = localizacao;
	}
	public Motorista(String nome, String cpf, int clasificacao, int quantCorida, float luclo, Carro carro,
			Localizacao localizacao) {
		super(nome, cpf);
		this.clasificacao = clasificacao;
		this.quantCorida = quantCorida;
		this.luclo = luclo;
		this.carro = carro;
		this.localizacao = localizacao;
	}
	public Motorista(int clasificacao, int quantCorida, float luclo, Carro carro, Localizacao localizacao) {
		this.clasificacao = clasificacao;
		this.quantCorida = quantCorida;
		this.luclo = luclo;
		this.carro = carro;
		this.localizacao = localizacao;
	}
	@Override
	public String toString() {
		return super.toString()+"n/" +"Motorista [carro=" + carro + ", clasificacao=" + clasificacao + ", localizacao=" + localizacao
				+ ", luclo=" + luclo + ", quantCorida=" + quantCorida + "]";
	}
}
