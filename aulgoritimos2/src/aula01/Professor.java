package aula01;

import java.util.Scanner;

public class Professor {
	String nome;
	int nivelAcademico ;//variavel categorica obs no caso de mais de uma formacao coloca a mais avancada  
						// 1- graduado 
						// 2- mestre
						// 3- doutor 
						// 4- posui pos-doutorado  
	String[] materias  ;//nome das materias ministradas 
	Endereco endereco  ;
	//#region questao2
	public void lerProfessor(){
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite o nome do profesor(a) ");
		this.nome = leitor.next();
		System.out.println(" digite o nivel academico do professor(a) ");
		System.out.println("    1-graduado");
		System.out.println("    2-mestre");
		System.out.println("    3-doutor");
		System.out.println("    4-posui pos-doutorado ");
		this.nivelAcademico = leitor.nextInt();
		System.out.println("quantas materias esse professor(a) ministra?");
		int aux = leitor.nextInt();
		this.materias = new String[aux];
		for (int i = 0; i < this.materias.length; i++) {
			System.out.println("digite o nome da "+(i+1)+"° materia que o professor(a) ministra ");
			this.materias[i]= leitor.next();
		}
        this.endereco = new Endereco();
        leitor.close();


	}
	

}