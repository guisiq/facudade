/**
Questão 01--------------------------------------ok
Elabore 3 classes: Aluno, Professor e Endereco.
A classe Endereco deve ser utilizada como tipo
de dados (atributo) nas outras classes. Cada
classe deve possuir no mínimo 4 campos.

Questão 02--------------------------------------
Utilizando as classes: Professor e Endereco,
criadas no exercício anterior, construa um
programa que leia dados do professor e
adicione em um vetor de tamanho 10. Após
preencher o vetor, imprima TODOS os dados
do vetor.

Questão 03--------------------------------------
Melhore o programa anterior adicionando 3 funções:
● Professor lerProfessor(), esse método deve realizar a leitura
dos dados e retornar um objeto da classe Professor. Não
possui parâmetros;
● Endereco lerEndereco(), esse método deve realizar a leitura
dos dados e retornar um objeto da classe Endereco. Não
possui parâmetros;
● void imprimir(Professor[] vetor), esse método deve imprimir
os dados do vetor passado por parâmetro. Não possui tipo de
retorno. (Utilize o foreach).

Questão 04--------------------------------------
Implemente um programa que armazene e imprima um vetor de
10 posições da classe Aluno com as seguintes informações:
nome, disciplina, notaA1 e notaA2. O programa deve possuir 3
métodos:
● media, retorna a media do aluno;
● aprovado, retorna a palavra "Aprovado" ou "Reprovado";
● imprimir, imprime o nome do aluno, a média e se ele está
aprovado ou reprovado.

 */
package aula01;

public class Main {

	void imprimir(Professor[] vetor){
		for (Professor professor : vetor) {
			System.out.println("==================================");
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
			System.out.println("materias :");
			for (String[] materia : professor.materias ) {
				
			}

			System.out.println("endereço");
			System.out.println("==================================");
		}
	}
	public static void main(String[] args) {
		Professor[] profesores = new Professor[5];
		profesores[0] = new Professor();
		for (int i = 0; i < profesores.length; i++) {
			System.out.println("==================================");
			profesores[i] = new Professor();
			System.out.println("==================================");

		}
		
	}
}
