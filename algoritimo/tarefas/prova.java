// Class name must be "Main"
// Libraries included:
// json simple, guava, apache commons lang3, junit, jmock
// altor :guilherme Henrique Siqueira lopes 
/**
LEILaO
Escreva um programa que permita a um usuario
armazenar e consultar informacoes de itens de um
leilao 
(nome,         ok
valor minimo   ok
e 3 lances     ok
), contendo as
seguintes funcionalidades:
A) Inserir novos dados  nome, valor minimo e 3 lances(sem apagar os anteriores) (1 ponto)  ok
B) Consultar se um determinado item existe no leilao e exibir seus dados  pesquisar pelo nome (1 ponto)  ok
C) Apresentar a media de lucro dos itens (2 pontos) ok 
D) Apresentar um relatorio com o nome do item e o valor do lance mais alto (2 pontos) ok
E) Alterar os dados de um item do leilao  (1,5 ponto)                                ok
**/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int maximo ;
         // a pesoa escolhera o maximo de intens que poderam ser caddastrados e isso determina o tamanho dos array        
        System.out.println("qual o maximo de itens que podera ser cadastrado ");
        maximo =  Leitor.nextInt();
        
        String[] nome = new String[maximo];
        double[] valorMinimo  = new double[maximo];
        double[] valorFinal  = new double[maximo];
        double[][] lances = new double[maximo][3];// [x][y] x = prduto ,y = lance 
        int funcao = 0;
        int qantItens1 = 0;
        double somaLucro = 0;
        
        for (int qantItens  = 0; qantItens < maximo ; qantItens++){
            qantItens1++;
            int continuar = 1;

            
            System.out.println("item "+ qantItens );

            System.out.println("digite o nome do item ");
            nome[qantItens] =  Leitor.next();
            
            System.out.println("digite o valor minimo   ");
            valorMinimo[qantItens] =  Leitor.nextDouble();
            
           // de acordo com a questao e para cadrasta 3 lance segui pela logica que o primeiro tem que ser maior igual ao valor inicial e os demais tem que ser maior que os anteriores  com isso o valor final e igual ao utimo lance 
            for(int lance = 0 ; lance < 3 ; lance++){
                System.out.println("digite o lance " + (lance+1));
                lances[qantItens][lance] =  Leitor.nextDouble();
                if( lance == 0 && lances[qantItens][lance] < valorMinimo[qantItens]){
                    System.out.println("o primeiro lace tem que ser maior ou igual ao valor minimo " );
                    lance--;
                }
                if(  lance > 0  ){
                    if (lances[qantItens][lance] <= lances[qantItens][lance-1]){
                        System.out.println("esse lance nao e valido pois cada lance tem que ser maior que o anterior " );
                        lance--;
                    }
                }
            }
            valorFinal[qantItens] =  lances[qantItens][2];
            //somando o lucro para posteriiormente obter a media dos lucro 
            somaLucro = somaLucro + ( valorFinal[qantItens] - valorMinimo[qantItens]);
            
            if(qantItens < (maximo-1)){
                System.out.println("digite 1 para cadastra outro intem ");
                continuar =  Leitor.nextInt();
            }else{
                System.out.println(" voce atingiu o maximo de cadastros que voce determinou  ");
                continuar = 2 ; 
            }
            
            
            if(continuar != 1 ){
                break;
            }
            
        }
        while(true){
            System.out.println("digite 1 para cadastra outro intem ");
            System.out.println("digite 2 para pesquisar um intem pelo nome ");
            System.out.println("digite 3 para mostrar a media de lucro ( valor final - valor minimo)dos intens  ");
            System.out.println("digite 4 exibir um relatorio do item com lance mais alto  ");
            System.out.println("digite 5 para alterar os dados de um intem no leilao ");
            funcao =  Leitor.nextInt();
            if(funcao == 1){
                if(qantItens1 >= maximo ){
                    System.out.println("voce ja atingiu o limite que determinou mas vc pode digita 5 e aulterar algum dado ");
                }else{
                    qantItens1++;
                    System.out.println("item "+ qantItens1 );

                    System.out.println("digite o nome do item ");
                    nome[qantItens1] =  Leitor.next();

                    System.out.println("digite o valor minimo   ");
                    valorMinimo[qantItens1] =  Leitor.nextDouble();


                    for(int lance = 0 ; lance < 3 ; lance++){
                        System.out.println("digite o lance " + (lance+1));
                        lances[qantItens1][lance] =  Leitor.nextDouble();
                        if( lance == 0 && lances[qantItens1][lance] < valorMinimo[qantItens1]){
                            System.out.println("o primeiro lace tem que ser maior ou igual ao valor minimo " );
                            lance--;
                        }
                        if(  lance > 0  ){
                            if (lances[qantItens1][lance] <= lances[qantItens1][lance-1]){
                                System.out.println("esse lance nao e valido pois cada lance tem que ser maior que o anterior " );
                                lance--;
                            }
                        }
                    }
                            valorFinal[qantItens1] =  lances[qantItens1][2];
                    somaLucro = somaLucro + ( valorFinal[qantItens1] - valorMinimo[qantItens1]);
                }
                
            }else if(funcao == 2){
                String pesquisa ;
                System.out.println("digite o nome do item");
                pesquisa =  Leitor.next();
                for (int qantItens  = 0; qantItens < maximo ; qantItens++){
                    if(pesquisa.equals(nome[qantItens])){
                    System.out.println(" nome :  "+nome[qantItens]);
                    System.out.println(" valor minimo :"+ valorMinimo[qantItens]);
                    System.out.println(" lance 1:" + lances[qantItens][0]);
                    System.out.println(" lance 2:" + lances[qantItens][1]);
                    System.out.println(" lance 3:" + lances[qantItens][2]);
                    System.out.println(" valor final  :"+ valorFinal[qantItens]);
                    
                    }
                }

            
            }else if(funcao == 3){
                System.out.println(" a media de lucro dos " + qantItens1 +" foi de "+ ( somaLucro/(qantItens1)));
            }else if(funcao == 4){
            double lanceMaisAlto = 0 ;
            int aux = 0 ;
                for (int qantItens  = 0; qantItens < maximo ; qantItens++){
                    if( lanceMaisAlto <  valorFinal[qantItens]){
                        lanceMaisAlto =  valorFinal[qantItens];
                        aux = qantItens;
                    }
                    
                }
                System.out.println(" o relatorio do intem com o lace mais alto  ");
                System.out.println(" nome :  "+nome[aux]);
                System.out.println(" valor minimo :"+ valorMinimo[aux]);
                System.out.println(" lance 1:" + lances[aux][0]);
                System.out.println(" lance 2:" + lances[aux][1]);
                System.out.println(" lance 3:" + lances[aux][2]);
                System.out.println(" valor final  :"+ valorFinal[aux]);
            }else if(funcao == 5){
                int itemAltera;
                double valorFinalAnt;
                System.out.println("digite o numero do intem que deseja altera ");
                itemAltera = Leitor.nextInt();

                System.out.println("item "+ itemAltera );

                System.out.println("digite o nome do item ");
                nome[itemAltera] =  Leitor.next();

                System.out.println("digite o valor minimo   ");
                valorMinimo[itemAltera] =  Leitor.nextDouble();

                valorFinalAnt = valorFinal[itemAltera];
                for(int lance = 0 ; lance < 3 ; lance++){
                    System.out.println("digite o lance " + (lance+1));
                    lances[itemAltera][lance] =  Leitor.nextDouble();
                    if( lance == 0 && lances[itemAltera][lance] < valorMinimo[itemAltera]){
                        System.out.println("o primeiro lace tem que ser maior ou igual ao valor minimo " );
                        lance--;
                    }
                    if(  lance > 0  ){
                        if (lances[itemAltera][lance] <= lances[itemAltera][lance-1]){
                            System.out.println("esse lance nao e valido pois cada lance tem que ser maior que o anterior " );
                            lance--;
                        }
                    }
                }
    
                valorFinal[itemAltera] =  lances[itemAltera][2];
                somaLucro = somaLucro + ( valorFinal[itemAltera]-valorFinalAnt );

            }
        
        }
        
    }
}
