// autor : GuilhermeHenrique Siqueira Lopes 
// Class name must be "Main"
// Libraries included:
// json simple, guava, apache commons lang3, junit, jmock

import java.util.Scanner;
class prova2 {
    public static void main(String[] args) {
     Scanner Leitor = new Scanner(System.in);
        // declarando as variaveis 
        String[] nome = new String[100];
        double[] precoDeCompra = new double[100];
        double[] precoDeVenda = new double[100];
        int[][] validade = new int[2][100];//[0]mes [1]ano
        int funcao = 0;
        int qantProdutos1 = 0;
        // capiturando os dados 
        for (int qantProdutos  = 0; qantProdutos <= 100 ; qantProdutos++){
            qantProdutos++;
            int continuar = 1;
            System.out.println("digite o nome do produto ");
            nome[qantProdutos] =  Leitor.next();
            
            System.out.println("digite o preco de compra  ");
            precoDeCompra[qantProdutos] =  Leitor.nextDouble();
            
            System.out.println("digite o preco de venda  ");
            precoDeVenda[qantProdutos] =  Leitor.nextDouble();

            System.out.println("digite o mes da validade ");
            validade[0][qantProdutos] =  Leitor.nextInt();

            System.out.println("digite o ano da validade ");
            validade[1][qantProdutos] =  Leitor.nextInt();
            
            
            System.out.println("digite 1 para cadastra outro produto   ");
            continuar =  Leitor.nextInt();
            if(continuar != 1 ){qantProdutos = 101;}
            

        }
        while(true){
            System.out.println("digite 1 para ver a lista de produtos com suas informacoes ");
            System.out.println("digite 2 para pesquisar um produto pela validade");
            System.out.println("digite 3 para pesquisar pelo nome ");
            funcao = Leitor.nextInt();
            if(funcao == 1){
                for (int qantProdutos = 0; qantProdutos <= qantProdutos1 ; qantProdutos++){

                    System.out.println("=======================================");
                    System.out.println("nome:"+ nome[qantProdutos]);
                    System.out.println("preco de compra :"+ precoDeCompra[qantProdutos]);
                    System.out.println("preco de venda:"+ precoDeVenda[qantProdutos]);
                    System.out.println("lucro na venda :"+(((precoDeVenda[qantProdutos]/precoDeCompra[qantProdutos])-1)*100));
                    System.out.println("validade :"+ validade[0][qantProdutos]+"/"+validade[1][qantProdutos]);    
                    System.out.println("========================================");
                
                }
                
            }else if(funcao == 2){
                int mes = 0 ;
                int ano = 0 ;
                System.out.println("digite uma validade para mostrar produtos com um vencimento menor igual ao digitado ");
                System.out.println("mes: ");
                mes = Leitor.nextInt();
                System.out.println("ano ");
                ano = Leitor.nextInt();
                System.out.println("os seguintes produtos tem data de validade inferior a digitada ");
                for (int qantProdutos = 0; qantProdutos <= qantProdutos1 ; qantProdutos++){
                    if(ano <= validade[1][qantProdutos]){
                        if(mes <= validade[0][qantProdutos]){
                            System.out.println("=======================================");
                            System.out.println("nome:"+ nome[qantProdutos]);
                            System.out.println("preco de compra :"+ precoDeCompra[qantProdutos]);
                            System.out.println("preco de venda:"+ precoDeVenda[qantProdutos]);
                            System.out.println("lucro na venda :"+(((precoDeVenda[qantProdutos]/precoDeCompra[qantProdutos])-1)*100));
                            System.out.println("validade :"+ validade[0][qantProdutos]+"/"+validade[1][qantProdutos]);    
                            System.out.println("========================================");
                
                        
                        }
                    }

                }
            }else if(funcao == 3){
            }
        }
    }
}



