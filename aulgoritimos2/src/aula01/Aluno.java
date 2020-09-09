package aula01;
import java.util.Scanner;
import json.*;

/**
 * 
 */
public class Aluno {
	String nome ;
	Diciplina[] diciplinas;
    int periodo ;
	int curso;  //tratando como variavel categorica 
				// 1-sistema 
				// 2-assitencia social 
				// 3-agronegocio
				// 4-direito
	Endereco endereco;
	public void lerAluno() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite o nome do aluno :");
		this.nome = leitor.nextLine();
		System.out.println("digite o periodo que o aluno esta fazendo :");
		System.out.println("	1-sistemas ");
		System.out.println("	2-assistencia social ");
		System.out.println("	3-agronegocios ");
		System.out.println("	4-direito ");
		this.curso = leitor.nextInt();
		endereco = new Endereco();
		endereco.lerEndereco();
		System.out.println("quantas materiras o aluno participa ");
		int aux =leitor.nextInt();
		this.diciplinas = new Diciplina[aux];
		for (int i = 0; i < diciplinas.length; i++) {
			this.diciplinas[i] = new Diciplina();
			this.diciplinas[i].lerDiciplina();
		}
	}

}