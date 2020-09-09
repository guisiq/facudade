package aula01;
import java.util.Scanner;
public class Main {
 
	static void imprimir(Professor[] vetor){

		for (Professor professor : vetor) {
			System.out.println("===================================");
			System.out.println("nome:"+professor.nome);
			System.out.print("nivel academico:");
			switch (professor.nivelAcademico) {
						// 1- graduado 
						// 2- mestre
						// 3- doutor 
						// 4- posui pos-doutorado
				case 1:
					System.out.println("graduado");
					break;
				case 2:
					System.out.println("mestre");
					break;
				case 3:
					System.out.println("doutor");					
					break;
				case 4:
					System.out.println("posui pos-doutorado");
					break;

				default:
					System.out.println("posui" +(professor.nivelAcademico-3)+" pos-doutorado");
					break;			
			
			}
			/**/
			for (String materia : professor.materias ) {
				System.out.print("materias :");
				System.out.println(materia);	
			}
			/**/
			System.out.println("endereço:");
			System.out.println("	cep           :"+professor.endereco.cep);
			System.out.println("	quadra        :"+professor.endereco.quadra);
			System.out.println("	rua           :"+professor.endereco.rua);
			System.out.println("	numero da casa:"+professor.endereco.numeroDaCasa);
			System.out.println("===================================");
		}
	}
	static public void funcName(String arg) {
		
	}
	public static void main(String[] args) {
		Scanner Leitor = new Scanner(System.in);
		Professor[] profesores = new Professor[10];
		System.out.println("cadastre os professores ");
		for (int i = 0; i < profesores.length; i++) {
			System.out.println("=================" + i + "=================");
			profesores[i] = new Professor();
			profesores[i].lerProfessor();
			System.out.println("===================================");
			System.out.println();
		}
		imprimir(profesores);
		System.out.println("informe o maximo de alunos que poderao ser cadaastrados");
		Aluno[] alunos = new Aluno[Leitor.nextInt()];		
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] =new Aluno();
			alunos[i].lerAluno();
		}

		System.out.println("escolha que funcao deseja accesar :");

		System.out.println("	1-ver a media do aluno ");
		System.out.println("	2-imprimir todas as notas do aluno ");
		System.out.println("	1-se o aluno foi aprovado na materia ");
		int funcao = Leitor.nextInt();
		System.out.println("digite o nome do aluno ");
		String pesquisa = Leitor.nextLine();
		switch (funcao) {
			case 1:
				for (Aluno aluno : alunos) {
					if (pesquisa.equals(aluno.nome)) {
						System.out.println(aluno.nome);
						for ( Diciplina  diciplina : aluno.diciplinas) {
							diciplina.imprimir();
						}
					} else {
						System.out.println("o aluno com esse nome nao foi encontrado ");
					}
				}
				
				break;
				case 2 :
				for (Aluno aluno : alunos) {
					if (pesquisa.equals(aluno.nome)) {
						System.out.println(aluno.nome);
						for ( Diciplina  diciplina : aluno.diciplinas) {
							diciplina.imprimir();
						}
					} else {
						System.out.println("o aluno com esse nome nao foi encontrado ");
					}
				}
				break;
			case 3 :
				
				for (Aluno aluno : alunos) {
					if (pesquisa.equals(aluno.nome)) {
						System.out.println(aluno.nome);
						for ( Diciplina  diciplina : aluno.diciplinas) {
							System.out.println(diciplina.nome);
							diciplina.estado();
						}
					} else {
						System.out.println("o aluno com esse nome nao foi encontrado ");
					}
				}
			default:
				break;
		}
		Leitor.close();
	}
}