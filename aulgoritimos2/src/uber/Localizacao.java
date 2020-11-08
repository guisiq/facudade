package uber;

public class Localizacao {
    private String cidade;
    private String bairro;
    private String lagradouro;
    private String regiao;
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLagradouro() {
		return lagradouro;
	}
	public void setLagradouro(String lagradouro) {
		this.lagradouro = lagradouro;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public Localizacao(String cidade, String bairro, String lagradouro, String regiao) {
		this.cidade = cidade;
		this.bairro = bairro;
		this.lagradouro = lagradouro;
		this.regiao = regiao;
	}
	public Localizacao() {
	}
	@Override
	public String toString() {
		return "Localizacao [bairro=" + bairro + ", cidade=" + cidade + ", lagradouro=" + lagradouro + ", regiao="
				+ regiao + "]";
	}
    
}
