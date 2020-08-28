import java.util.Random;
import java.util.Scanner;

import jdk.dynalink.beans.StaticClass;

 class Servidor0{
       String nome;
       String host[]= new String[5];
       int  ip[][]= new  int [5][4];
    
       public static void cadastro(int indice) {

        Scanner leitor= new Scanner(System.in);
        Random gerador = new Random();
        
        System.out.println("Digite o nome que deseja no dominio " +indice+ " :");
        This.nome= leitor.next();
        //DEFININDO O HOSTANAME 0 DESSE DOMINIO  E SEU IP
        System.out.println("Digite o nome que deseja para o hostname 0 do dominio  " +dominio[indiceDominios].nome+ " :");
        This.host[0]= leitor.next();
        
        for(int i=0; i < 4; i++){
            This.ip[0][i] = gerador.nextInt(255);
        }
        System.out.println(" O IP FOI CRIADO AUTOMATICAMENTE,ACESSE A FUNCAO 4 PARA ALTERA-LO!");
      
       }
       public static void info(int indice ) {
                
            System.out.println("---------------------------------------------------");
            System.out.println("             DOMINO : "  + This.nome);
            System.out.println("---------------------------------------------------");    
            
            for (int i = 0; i < This.host.length; i++) {
                System.out.println("HOSTNAME: " +This.host[i] );
                System.out.print("IP DO HOST " +This.host[i] +  " :");
                for( int g=0; g<= 3; g++){
                    System.out.print(This.ip[i][g]+".");
                }
            }
       } 
}
//os parametros sao independentes un dos outros 

public class exercicio2prova{

    
    public static void main(String[] args) {
        //DECLARACAO DE UMA VARIAVEL AUX PARA AJUDAR NA NAVEGACAO DA INTERFACE
        int auxInterface=0;
        // VARIAVEL RESPONSAVEL POR ARMAZENAR O INDICE CORRESPONDENTE A QUANTIDADE DE DOMINIOS ATIVOS
        Servidor dominio[]= new Servidor0[10];
        for (int i = 0; i < dominio.length; i++) {
            
        }
        Scanner leitor= new Scanner(System.in);
        
        int indiceDominios=-1;
        //LOOP PARA ACESSAR A INTERFACE QUANTAS VEZES DESEJAR
        String auxLoop="S";
        
        // dominio[indice] = new Servidor0();
        // //  dominio[indiceDominios].host[0]= new String();
        // System.out.println("Digite o nome que deseja no dominio " +indiceDominios+ " :");
        // dominio[indice].nome= leitor.next();
        // //DEFININDO O HOSTANAME 0 DESSE DOMINIO  E SEU IP
        // System.out.println("Digite o nome que deseja para o hostname 0 do dominio  " +dominio[indiceDominios].nome+ " :");
        // dominio[indice].host[0]= leitor.next();
        

        while ( auxLoop.equals("S") || auxLoop.equals("s")) {
            System.out.println("     **OPCOES E METODOS**  (INTERFACE PRINCIPAL)");
            System.out.println(" -------------------------------------------------------");
            System.out.println(" 0- INSERIR NOVOS DADOS");
            System.out.println(" 1-CONSULTAR HOST PELO NOME");
            System.out.println(" 2-LISTAR HOTS E IPS DE UM DOMINIO");
            System.out.println(" 3-RELATORIOS DE IPS INCORRETOS ");
            System.out.println(" 4-ALTERAR OS DADOS DE UM HOST");
            System.out.println(" -------------------------------------------------------");
            System.out.println("");
            System.out.println("");
            System.out.println("Numero do metodo escolhido:");
            auxInterface = leitor.nextInt();
            
            
            switch(auxInterface){ 
                case 0:
                if (indiceDominios < 10) {
                    dominio[indiceDominios].cadastro(indiceDominios);
                    indiceDominios++;
                }                
                
                break;
                
                case 1:
                
                System.out.println("Digite o nome do dominio:");
                String auxDominio= leitor.next();
                for(int contDominio=0; contDominio <=  indiceDominios ;contDominio++ ){
                       
                     if (dominio[contDominio].nome.equals(auxDominio)){
                            dominio[contDominio].info();
                        }
                        
                        if( contDominio == indiceDominios  ){
                            System.out.println("Host não encontrado!");
                        }
                    }
                break; 
                    
                    
                case 2:
                for (int c=0; c <= indiceDominios; c++){
                    dominio[c].info();
                }                        
                break;
                        
                case 3:
                        
                break; 
                        
                        case 4:
                           
                        dominio[indiceDominios].cadastro(indiceDominios);
                               
                        break;
                        
                    }
                    System.out.println("Deseja repertir [S]/[N]");
                    auxLoop=leitor.next();
                }
            }
                     
        }