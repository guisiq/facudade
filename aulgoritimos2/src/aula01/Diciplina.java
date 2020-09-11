package aula01;

import java.util.Scanner;

class Diciplina {
	String nome;
	float notaA1;
	float notaA2;
	boolean concluida;
	float media ;	
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
			this.media = (this.notaA1+this.notaA2)/2;	
		}else{
			this.concluida = false ;
		}
		leitor.close();
	}
	public void inprimir() {
		System.out.println("    "+this.nome+":    ");
		if (this.concluida) {
			System.out.println("a materia foi concluida ");
			System.out.println("nota A1:"+this.notaA1);
			System.out.println("nota A2:"+this.notaA2);
			System.out.println("media  :"+this.media);
			if (this.media >= 6 ) {
				System.out.println("aprovado");
			} else {
				System.out.println("reprovado ");
			}
			
		} else {
			System.out.println("a materia nao foi concluida ");
		}
	}
			
	public void inprimirmedia() {
		System.out.println("a media na mteria de "+this.nome +" foi de "+((this.notaA1+this.notaA2)/2));
	}
	public void estado () {
		if (this.concluida) {
			if(this.media >= 6 ){
				System.out.println("o aluno esta aprovado nesta materia aprovado");
			}else{
				System.out.println("o aluno esta reprovado nesta materia aprovado");
			}
		} else {
			System.out.println("esta materia nao foi concluida ainda ");
		}
		
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
