
/**

6 - O algoritmo deve verificar se os dados de usuário e senha são verdadeiros ou não. 
Solicite os dados de usuário e senha; 
Informe: O usuário e a senha informados são? (verdadeiro ou falso).
 */

import java.util.Scanner;

public class Aula3exercicio06 {
    public static void main(String[] args) {

        //inicializando import
        Scanner Leitor      = new Scanner(System.in);
        String usuario = "gui";
        String senha;
        String confirmacao = "gui";

        System.out.println("digiti o usuario :");
        usuario  = Leitor.next();
        System.out.println("digite su senha :");
        senha = Leitor.next();

        System.out.println("confirme seu usuario :");
        confirmacao = Leitor.next();

        while (!confirmacao.equals(usuario)) {
            
            System.out.println("o usuario digitado e diferente do anterior digite novamente : ");
            confirmacao = Leitor.next();
        
        }

        System.out.println("confirme sua senha :");
        confirmacao = Leitor.next();
        
        while (!confirmacao.equals(senha)) {
        
            System.out.println("a senha digitado e diferente da anterior digite novamente : ");
            confirmacao = Leitor.next();

        }
        
        Leitor.close();
    }
        
}