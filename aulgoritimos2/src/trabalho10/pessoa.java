package trabalho10;

import java.util.Scanner;

public class Pessoa{
    protected String nome;
    protected String cpf;
    protected Sexo sexo;
    
    //#region construtores 
	public Pessoa(String nome, String cpf, Sexo sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
	}
	public Pessoa() {
	}
	public static Pessoa instacie (Scanner leitor){
		Pessoa pessoa = new Pessoa();
		System.out.println("digite o nome :");
		pessoa.setNome(leitor.nextLine());
		System.out.println("digite o cpf  :");
		pessoa.setCpf(leitor.nextLine());
		System.out.println("digite o sexo [1] masculino [2]feminino :");
		pessoa.setSexo(leitor.nextInt() == 1?Sexo.MASCULINO:Sexo.FEMININO);
		leitor.nextLine();

		return pessoa;
	}
    //#endregion

    //#region metodos geters e seters 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
    }
    //#endregion
    //#region sobrescrevendo metodos 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
    }
	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + ", sexo=" + sexo + "]";
	}
    

    //#endregion


    
}