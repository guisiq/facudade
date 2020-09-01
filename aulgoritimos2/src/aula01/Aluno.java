package aula01;

import java.util.Scanner;

/**
 * 
 */
class Diciplina {
	String nome;
	float notaA1;
	float notaA2;
	boolean concluida;
	public void lerDiciplina (){
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite o nome da diciplina :");
		this.nome = leitor.nextLine();
		System.out.println("a materia foi concluida ? [S]im [N]ao ");
		if(leitor.next().equals("S")||leitor.next().equals("s")){
			this.concluida = true ;
			System.out.println("digite a nota da avaliacao A1");
			this.notaA1= leitor.nextFloat();	
			System.out.println("digite a nota da avaliacao A2");
			this.notaA2= leitor.nextFloat();	
		}else{
			this.concluida = false ;
		}
		leitor.close();
	}
	public void inprimir() {
		
	}
	public void inprimirmedia() {
		
	}
	public void imprimir() {
		if (concluida) {
			System.out.println("a materia de "+this.nome+" foi concluida ");
			System.out.println("nota A1:"+this.notaA1);
			System.out.println("nota A2:"+this.notaA2);
			System.out.println("a media nessta materia e de :"+((this.notaA1+this.notaA2)/2));
			if ((this.notaA1+this.notaA2)/2 >= 6) {
				System.out.println("voce foi aprovado ");
			} else {
				System.out.println("voce foi reprovado ");
			}
		} else {
			System.out.println("a materia de "+this.nome+" nao foi concluida ");
		}

	}
}
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
		leitor.close();
	}

}