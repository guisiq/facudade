package aula01;

import java.util.Scanner;

public class Endereco {
    int cep;
	String quadra;
	String rua;
	int numeroDaCasa;
	// estou utilizando o metodo construto no lugor da funcao lerEndereço(); 
	public void lerEndereco(){
		Scanner leitor = new Scanner(System.in);
		//System.out.println("==================================");
		System.out.println("digite o cep");
		this.cep = leitor.nextInt();
		System.out.println("digite a quadra ");
		this.quadra = leitor.next();
		System.out.println("digite a rua ");
		this.rua = leitor.next();
		System.out.println("digite o numero da casa ");
		this.numeroDaCasa = leitor.nextInt();
        
	}  

}