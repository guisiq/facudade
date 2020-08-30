package aula01;
import java.util.Scanner;

class Endereco1{
	String rua;
	int numero;
	String complemento;
	String referencia;
}

class Aluno1{
	String nome;
	String sexo;
	int idade;
	float rg;
	Endereco endereco;
	
}

class Professor1{
	String nome;
	String sexo;
	int idade;
	float rg;
	Endereco endereco;
    public void lerprofessor() {
        Scanner leitor = new Scanner(System.in) ;
        System.out.println("Digite o nome do Professor");
        this.nome = leitor.next();

    }
}

public class teat {


	public static void main(String[] args) {
		Professor1[] professor  = new Professor1[10];
		for(int i=0; i<professor.length; i++) {
            professor[i] = new Professor1(); 
            professor[i].lerprofessor();
        }

    }
}