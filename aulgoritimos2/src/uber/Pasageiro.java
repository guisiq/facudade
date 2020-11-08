package uber;

import java.util.Arrays;

public class Pasageiro extends Pessoa{
    private float saldo;
    private float bonus;
    private Localizacao localizacao;
    private Viagem[] viagens;
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public Localizacao getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
	public Viagem[] getViagens() {
		return viagens;
	}
	public void setViagens(Viagem[] viagens) {
		this.viagens = viagens;
	}
	public Pasageiro(String nome, String cpf, String email, String telefone, float saldo, float bonus,
			Localizacao localizacao, Viagem[] viagens) {
		super(nome, cpf, email, telefone);
		this.saldo = saldo;
		this.bonus = bonus;
		this.localizacao = localizacao;
		this.viagens = viagens;
	}
	public Pasageiro(String nome, String cpf, float saldo, float bonus, Localizacao localizacao, Viagem[] viagens) {
		super(nome, cpf);
		this.saldo = saldo;
		this.bonus = bonus;
		this.localizacao = localizacao;
		this.viagens = viagens;
	}
	public Pasageiro(float saldo, float bonus, Localizacao localizacao, Viagem[] viagens) {
		this.saldo = saldo;
		this.bonus = bonus;
		this.localizacao = localizacao;
		this.viagens = viagens;
	}
	@Override
	public String toString() {
		return super.toString()+"n/"+ "Pasageiro [bonus=" + bonus + ", localizacao=" + localizacao + ", saldo=" + saldo + ", viagens="
				+ Arrays.toString(viagens) + "]";
	}
	


}
