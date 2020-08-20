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
/**
 * regitro
 */
 class regitro {
    String nome ;
    double valorMinimo ; 
    double valorFinal ;
    double[] lances = new double[3];// [y] y = lance 
        
}
class Main {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int maximo ;
        // a pesoa escolhera o maximo de intens que poderam ser caddastrados e isso determina o tamanho dos array        
        System.out.println("qual o maximo de itens que podera ser cadastrado ");
        maximo =  Leitor.nextInt();
        regitro[] intens = new regitro[maximo];
        
        for (int i = 0; i < intens.length; i++) {
            intens[i] = new regitro();
        }

        // String[] nome = new String[maximo];
        // double[] valorMinimo  = new double[maximo];
        // double[] valorFinal  = new double[maximo];
        // double[][] lances = new double[maximo][3];// [x][y] x = prduto ,y = lance 
        
        int funcao = 0;
        int qantItens1 = 0;
        double somaLucro = 0;
        
        for (int qantItens  = 0; qantItens < maximo ; qantItens++){
            qantItens1++;
            int continuar = 1;

            
            System.out.println("item "+ qantItens );

            System.out.println("digite o nome do item ");
            intens[qantItens].nome =  Leitor.next();
            
            System.out.println("digite o valor minimo   ");
            intens[qantItens].valorMinimo =  Leitor.nextDouble();
            
           // de acordo com a questao e para cadrasta 3 lance segui pela logica que o primeiro tem que ser maior igual ao valor inicial e os demais tem que ser maior que os anteriores  com isso o valor final e igual ao utimo lance 
            for(int lance = 0 ; lance < 3 ; lance++){
                System.out.println("digite o lance " + (lance+1));
                intens[qantItens].lances[lance] =  Leitor.nextDouble();
                if( lance == 0 && intens[qantItens].lances[lance] < intens[qantItens].valorMinimo){
                    System.out.println("o primeiro lace tem que ser maior ou igual ao valor minimo " );
                    lance--;
                }
                if(  lance > 0  ){
                    if (intens[qantItens].lances[lance] <= intens[qantItens].lances[lance-1]){
                        System.out.println("esse lance nao e valido pois cada lance tem que ser maior que o anterior " );
                        lance--;
                    }
                }
            }
            intens[qantItens].valorFinal =  intens[qantItens].lances[2];
            //somando o lucro para posteriiormente obter a media dos lucro 
            somaLucro = somaLucro + ( intens[qantItens].valorFinal - intens[qantItens].valorMinimo);
            
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
                    intens[qantItens1].nome =  Leitor.next();

                    System.out.println("digite o valor minimo   ");
                    intens[qantItens1].valorMinimo =  Leitor.nextDouble();


                    for(int lance = 0 ; lance < 3 ; lance++){
                        System.out.println("digite o lance " + (lance+1));
                        intens[qantItens1].lances[lance] =  Leitor.nextDouble();
                        if( lance == 0 && intens[qantItens1].lances[lance] < intens[qantItens1].valorMinimo){
                            System.out.println("o primeiro lace tem que ser maior ou igual ao valor minimo " );
                            lance--;
                        }
                        if(  lance > 0  ){
                            if (intens[qantItens1].lances[lance] <= intens[qantItens1].lances[lance-1]){
                                System.out.println("esse lance nao e valido pois cada lance tem que ser maior que o anterior " );
                                lance--;
                            }
                        }
                    }
                            intens[qantItens1].valorFinal =  intens[qantItens1].lances[2];
                    somaLucro = somaLucro + ( intens[qantItens1].valorFinal - intens[qantItens1].valorMinimo);
                }
                
            }else if(funcao == 2){
                String pesquisa ;
                System.out.println("digite o nome do item");
                pesquisa =  Leitor.next();
                for (int qantItens  = 0; qantItens < maximo ; qantItens++){
                    if(pesquisa.equals(intens[qantItens].nome)){
                    System.out.println(" nome :  "+intens[qantItens].nome);
                    System.out.println(" valor minimo :"+ intens[qantItens].valorMinimo);
                    System.out.println(" lance 1:" + intens[qantItens].lances[0]);
                    System.out.println(" lance 2:" + intens[qantItens].lances[1]);
                    System.out.println(" lance 3:" + intens[qantItens].lances[2]);
                    System.out.println(" valor final  :"+ intens[qantItens].valorFinal);
                    
                    }
                }

            
            }else if(funcao == 3){
                System.out.println(" a media de lucro dos " + qantItens1 +" foi de "+ ( somaLucro/(qantItens1)));
            }else if(funcao == 4){
            double lanceMaisAlto = 0 ;
            int aux = 0 ;
                for (int qantItens  = 0; qantItens < maximo ; qantItens++){
                    if( lanceMaisAlto <  intens[qantItens].valorFinal){
                        lanceMaisAlto =  intens[qantItens].valorFinal;
                        aux = qantItens;
                    }
                    
                }
                System.out.println(" o relatorio do intem com o lace mais alto  ");
                System.out.println(" nome :  "+intens[aux].nome);
                System.out.println(" valor minimo :"+ intens[aux].valorMinimo);
                System.out.println(" lance 1:" + intens[aux].lances[0]);
                System.out.println(" lance 2:" + intens[aux].lances[1]);
                System.out.println(" lance 3:" + intens[aux].lances[2]);
                System.out.println(" valor final  :"+ intens[aux].valorFinal);
            }else if(funcao == 5){
                int itemAltera;
                double valorFinalAnt;
                System.out.println("digite o numero do intem que deseja altera ");
                itemAltera = Leitor.nextInt();

                System.out.println("item "+ itemAltera );

                System.out.println("digite o nome do item ");
                intens[itemAltera].nome =  Leitor.next();

                System.out.println("digite o valor minimo   ");
                intens[itemAltera].valorMinimo =  Leitor.nextDouble();

                valorFinalAnt = intens[itemAltera].valorFinal;
                for(int lance = 0 ; lance < 3 ; lance++){
                    System.out.println("digite o lance " + (lance+1));
                    intens[itemAltera].lances[lance] =  Leitor.nextDouble();
                    if( lance == 0 && intens[itemAltera].lances[lance] < intens[itemAltera].valorMinimo){
                        System.out.println("o primeiro lace tem que ser maior ou igual ao valor minimo " );
                        lance--;
                    }
                    if(  lance > 0  ){
                        if (intens[itemAltera].lances[lance] <= intens[itemAltera].lances[lance-1]){
                            System.out.println("esse lance nao e valido pois cada lance tem que ser maior que o anterior " );
                            lance--;
                        }
                    }
                }
    
                intens[itemAltera].valorFinal =  intens[itemAltera].lances[2];
                somaLucro = somaLucro + ( intens[itemAltera].valorFinal -valorFinalAnt );

            }
        
        }
        
    }
}
