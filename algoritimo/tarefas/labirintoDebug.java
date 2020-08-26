import java.util.Random;

public class labirintoDebug {
    public static void main(String[] args) {
        boolean expandiu = true;
        boolean camilho = false;

        Random aleatorio = new Random();        
        int[][] labirinto = new int[20][20];
        //0 espaco em branco
        //1 paredes
        //2 para começo e fim  
        //3 e 4 reservada para testar caminho
        //lembrete pra concerta os nomes da variaveis linhas e coluna que estao trocadas 


        while (!camilho) {
            expandiu = true;
            camilho = false;
            //fazendo as paredes externas(contorno)
            for (int coluna = 0 ; coluna < labirinto.length; coluna++) {
                for (int linha = 0; linha < labirinto[coluna].length; linha++) {
                    if ( coluna == 0 || coluna == labirinto.length - 1 || linha == 0
                            || linha == labirinto[0].length - 1) {
                        labirinto[coluna][linha] = 1;
                    } else {
                        labirinto[coluna][linha] = 0;
                    }
                }
            }
            // gerando paredes aleatorias 
            for (int i = 0; i < 80; i++) {
                int x;
                int y;
                x = aleatorio.nextInt(20);
                y = aleatorio.nextInt(20);
                if (labirinto[x][y] == 0) {
                    labirinto[x][y] = 1;
                } else {
                    i--;
                }
            }
            //desenhando o labirinto para debuger 
            System.out.println("desenhando o labirinto para debuger");
            for (int colunaTeste = 0; colunaTeste < labirinto.length; colunaTeste++) {
                for (int linhateste = 0; linhateste < labirinto[colunaTeste].length; linhateste++) {
                    if (labirinto[colunaTeste][linhateste] == 0) {
                        System.out.print("  ");
                    } else {
                        System.out.print(labirinto[colunaTeste][linhateste] + " ");
                    }
                }
                System.out.println();
            }
            //testando se tem caminhos posiveis caminho

            labirinto[1][0] = 3;  //começo
            labirinto[18][19] = 0;//fim  
            while (!camilho && expandiu) {

                
                for (int coluna = 0; coluna < labirinto.length; coluna++) {
                    for (int linha = 0; linha < labirinto[0].length - 1; linha++) {
                        if (labirinto[coluna][linha] == 3) {
                            //expandindo para direita 
                            if (labirinto[coluna][linha + 1] == 0) {
                                labirinto[coluna][linha + 1] = 3;
                                expandiu = true;
                            }
                            //expandindo para esquerda se nao tiver na posisao 0 para nao extrapolar o array
                            if (linha - 1 >= 0) {
                                if (labirinto[coluna][linha - 1] == 0) {
                                    labirinto[coluna][linha - 1] = 3;
                                    expandiu = true;
                                }
                            }
                            //expandindo para cima
                            if (labirinto[coluna + 1][linha] == 0) {
                                labirinto[coluna + 1][linha] = 3;
                                expandiu = true;
                            }
                            //expandindo para baixo 
                            if (labirinto[coluna - 1][linha] == 0) {
                                labirinto[coluna - 1][linha] = 3;
                                expandiu = true;
                            }
                            if (labirinto[18][19] == 3) {
                                camilho = true;
                            }
                            labirinto[coluna][linha] = 4;
                        }
                    }
                    //desenhando o labirinto para debuger
                    System.out.println("desenhando o labirinto para debuger 2");
                    System.out.println("expandiu :" + expandiu);
                    System.out.println("caminho :" + camilho);
                    for (int colunaTeste = 0; colunaTeste < labirinto.length; colunaTeste++) {
                        for (int linhateste = 0; linhateste < labirinto[colunaTeste].length; linhateste++) {
                            if (labirinto[colunaTeste][linhateste] == 0) {
                                System.out.print("  ");
                            } else {
                                System.out.print(labirinto[colunaTeste][linhateste] + " ");
                            }
                        }
                        System.out.println();
                    }
                }
                expandiu = false;
                //desenhando o labirinto para debuger
                    System.out.println("/------------foi gerado o seguinte labirinto sem saida-----------/ :");
                    System.out.println("desenhando o labirinto para debuger 3");
                    System.out.println("expandiu :" + expandiu);
                    System.out.println("caminho :" + camilho);
                    for (int colunaTeste = 0; colunaTeste < labirinto.length; colunaTeste++) {
                        for (int linhateste = 0; linhateste < labirinto[colunaTeste].length; linhateste++) {
                            if (labirinto[colunaTeste][linhateste] == 0 ) {
                                System.out.print("  ");
                            } else {
                                System.out.print(labirinto[colunaTeste][linhateste] + " ");
                            }
                        }
                        System.out.println();
                    }

            }

        }

        for (int coluna = 0; coluna < labirinto.length; coluna++) {
            for (int linha = 0; linha < labirinto[coluna].length; linha++) {
                if (labirinto[coluna][linha] == 0) {
                System.out.print("  ");    
                }else{
                System.out.print(labirinto[coluna][linha]+" ");
                }
            }
            System.out.println();
        }
               
    
    }
}