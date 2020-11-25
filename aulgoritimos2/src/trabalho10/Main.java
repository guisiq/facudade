package trabalho10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void imprimirTudo(List<Pessoa> pessoas){
        pessoas.forEach( pessoa->{
            System.out.println(pessoa.toString());
        });
    }
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        Scanner leitor = new Scanner(System.in);
        boolean continuar = false;
        do {
            pessoas.add(Pessoa.instacie(leitor));
            System.out.println("deseja continuar ? [1]sim [2]nao");
            continuar = (leitor.nextInt()== 1?true : false );
            leitor.nextLine();
        } while (continuar);
        
        int opcao = 0 ;
        while (opcao != 6) {
            
            System.out.println("escolha uma opção :");
            System.out.println("1 - imprimir todos da lista  ");
            System.out.println("2 - imprimir todos do sexo masculino ");
            System.out.println("3 - imprimir todos do sexo feminino ");
            System.out.println("4 - excluir todos do sexo feminino ");
            System.out.println("5 - excluir todos do sexo masculino ");
            System.out.println("6 - encerrar ");
            
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    imprimirTudo(pessoas);
                    /*
                    pessoas.forEach( pessoa->{
                        System.out.println(pessoa.toString());
                    });
                    */
                    break;
                case 2:
                    pessoas.forEach( pessoa->{
                        if (pessoa.getSexo() == Sexo.MASCULINO) {
                            System.out.println(pessoa.toString());
                        }
                    });    
                    break;
                case 3:
                    pessoas.forEach( pessoa->{
                        if (pessoa.getSexo() == Sexo.FEMININO) {
                            System.out.println(pessoa.toString());
                        }
                    });    
                    break;
                case 4:
                    for (int i = 0; i < pessoas.size(); i++) {
                        if (pessoas.get(i).getSexo() == Sexo.FEMININO) {
                            pessoas.remove(i);
                            i--;
                        }                            
                    }    
                    break;
                case 5:
                    for (int i = 0; i < pessoas.size(); i++) {
                        if (pessoas.get(i).getSexo() == Sexo.MASCULINO) {
                            pessoas.remove(i);
                        }                            
                    }    
                    break;
                default:
                    break;
            }
        }
            
            
    }
    
}
