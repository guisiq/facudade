package aula01;

import java.util.Scanner;

public class Professor {
	String nome;
	String[] formacoes ;//ex: formado em :fisico ,analista de sistema 
	int nivelAcademico ;//variavel categorica obs no caso de mais de uma formacao coloca a mais avancada  
						// 1- graduado 
						// 2- mestre
						// 3- doutor 
						// 4- posui pos-doutorado 
	boolean integral   ;// se e profesor em tempo integral 
	String[] materias  ;//nome das materias ministradas 
	Endereco endereco  ;
	//#region questao2
	public Professor(){
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite o nome do profesor(a) ");
		this.nome = leitor.next();
		System.out.println("digite a quantidades de formacao desse profesor(a) ");
		int aux = leitor.nextInt();
		this.formacoes = new String[aux];
		for (int i = 0; i < formacoes.length; i++) {
			System.out.println("digite a "+(i+1)+"  formacao ");
			this.formacoes[i] =leitor.next();
		}
		System.out.println(" digite o nivel academico do professor(a) ");
		System.out.println("    1-graduado");
		System.out.println("    2-mestre");
		System.out.println("    3-doutor");
		System.out.println("    4-posui pos-doutorado ");
		this.nivelAcademico = leitor.nextInt();
		System.out.println("e profesor(a) em tempo integral ? [s]im [n]ao");
		String resposta = leitor.next();
		if (resposta.equals("s") || resposta.equals("S")) {
			this.integral = true;
		}else{
			this.integral = false;
		}
		System.out.println("quantas materias esse professor(a) ministra?");
		aux = leitor.nextInt();
		this.materias = new String[aux];
		for (int i = 0; i < formacoes.length; i++) {
			System.out.println("digite o nome da "+(i+1)+"° materia que o professor(a) ministra ");
			this.materias[i]= leitor.next();
		}
        this.endereco = new Endereco();
        leitor.close();


	}


}