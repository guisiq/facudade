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

import java.util.Scanner;

/**
 * endereço
 */
class Endereco {
	int cep;
	String quadra;
	String rua;
	int numeroDaCasa;
	// estou utilizando o metodo construto no lugor da funcao lerEndereço(); 
	public Endereco(){
		Scanner leitor = new Scanner(System.in);
		System.out.println("==================================");
		System.out.println("digite o cep");
		this.cep = leitor.nextInt();
		System.out.println("digite a quadra ");
		this.quadra = leitor.next();
		System.out.println("digite a rua ");
		this.rua = leitor.next();
		System.out.println("digite o numero da casa ");
		this.numeroDaCasa = leitor.nextInt();
		System.out.println("==================================");
	}
}

/**
 * Aluno
 */
class Aluno {
	int periodo ;
	double indicDeAproveitamentoGeral ;
	int materiasPendentes ;
	int curso;  //tratando como variavel categorica 
				// 1-sistema 
				// 2-assitencia social 
				// 3-agronegocio
				// 4-direito
	Endereco endereco;
	
}
/**
 * Professor
 */
class Professor {
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


	}

	
}

public class Main {

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
