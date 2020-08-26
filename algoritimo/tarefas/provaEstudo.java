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
class regitro1 {

    String nome ;
    double valorMinimo ; 
    double valorFinal ;
    double[] lances = new double[3];// [y] y = lance 
    
    public void cadastro(int indice) {
        Scanner Leitor = new Scanner(System.in);
        System.out.println("item "+ indice );

        System.out.println("digite o nome do item ");
        this.nome =  Leitor.next();
        
        System.out.println("digite o valor minimo   ");
        this.valorMinimo =  Leitor.nextDouble();
        
       // de acordo com a questao e para cadrasta 3 lance segui pela logica que o primeiro tem que ser maior igual ao valor inicial e os demais tem que ser maior que os anteriores  com isso o valor final e igual ao utimo lance 
        for(int lance = 0 ; lance < 3 ; lance++){
            System.out.println("digite o lance " + (lance+1));
            this.lances[lance] =  Leitor.nextDouble();
            if( lance == 0 && this.lances[lance] < this.valorMinimo){
                System.out.println("o primeiro lace tem que ser maior ou igual ao valor minimo " );
                lance--;
            }
            if(  lance > 0  ){
                if (this.lances[lance] <= this.lances[lance-1]){
                    System.out.println("esse lance nao e valido pois cada lance tem que ser maior que o anterior " );
                    lance--;
                }
            }
        }
        this.valorFinal =  this.lances[2];
    }
    public double somarLucro( double somaLucro , double valorFinalAnt) {
        if(valorFinalAnt == 0 ){
            valorFinalAnt = this.valorMinimo;
        }
        this.valorFinal =  this.lances[2];
        //somando o lucro para posteriiormente obter a media dos lucro 
        return (somaLucro + ( this.valorFinal - valorFinalAnt )) ;       
    }
    public void info(){

        System.out.println("nome:" + this.nome );
        System.out.println("nome:" + this.valorMinimo );
        System.out.println("nome:" + this.lances[1]   );
        System.out.println("nome:" + this.lances[2]   );
        System.out.println("nome:" + this.lances[3]   );
        System.out.println("nome:" + this.valorFinal  );

    }

}
class provaEstudo {

    public static void main(String[] args) {
        //#region inicializando as variaveis 
        Scanner Leitor = new Scanner(System.in);
        int maximo ;
        // a pesoa escolhera o maximo de intens que poderam ser caddastrados e isso determina o tamanho dos array        
        System.out.println("qual o maximo de itens que podera ser cadastrado ");
        maximo =  Leitor.nextInt();
        
        regitro1[] intens = new regitro1[maximo];
        for (int i = 0; i < intens.length; i++) {
            intens[i] = new regitro1();
        }
        int funcao = 0;
        int qantItens1 = 0;
        double somaLucro = 0;
        for (int qantItens  = 0; qantItens < maximo ; qantItens++){
            qantItens1++;
            int continuar = 1;
            intens[qantItens].cadastro(qantItens);
            somaLucro = intens[qantItens].somarLucro(somaLucro,0);
            if(qantItens < (maximo-1)){
                System.out.println("digite 1 para cadastra outro intem ");
                continuar =  Leitor.nextInt();
                if(continuar != 1 ){ break; }
            }else{
                System.out.println(" voce atingiu o maximo de cadastros que voce determinou  ");
                continuar = 2 ; 
                break;
            }            
        }
        //#endregion
        
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
                    intens[qantItens1].cadastro(qantItens1);
                    somaLucro = intens[qantItens1].somarLucro(somaLucro,0);
                    qantItens1++;
                }
            }else if(funcao == 2){
                String pesquisa ;
                System.out.println("digite o nome do item");
                pesquisa =  Leitor.next();
                for (int qantItens  = 0; qantItens < maximo ; qantItens++){
                    if(pesquisa.equals(intens[qantItens].nome)){
                        intens[qantItens].info();
                    }
                }
            }else if(funcao == 3){
                System.out.println(" a media de lucro dos " + qantItens1 +" intens foi de "+ ( somaLucro/(qantItens1)));
            }else if(funcao == 4){
                double lanceMaisAlto = 0 ;
                int aux = 0 ;
                for (int qantItens  = 0; qantItens < maximo ; qantItens++){
                    if( lanceMaisAlto <  intens[qantItens].valorFinal){
                        lanceMaisAlto =  intens[qantItens].valorFinal;
                        aux = qantItens;
                    }
                }
                System.out.println(" o relatorio do intem com o lace mais alto : ");
                intens[aux].info();
            }else if(funcao == 5){
                int itemAltera;
                System.out.println("digite o numero do intem que deseja altera ");
                itemAltera = Leitor.nextInt();
                double valorFinalAnt = intens[itemAltera].valorFinal;

                intens[itemAltera].cadastro(itemAltera);
                somaLucro = intens[itemAltera].somarLucro(somaLucro, valorFinalAnt);
            }        
        }
    }
}
