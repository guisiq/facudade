import java.util.Random;

public class labirintoV2_1 {
    public static void main(final String[] args) {
        boolean expandiu = true;
        boolean camilho = false;

        final Random aleatorio = new Random();
        int labirintosSemSaida = 0;        
        final int[][] labirinto = new int[20][20];
        //0 espaco em branco
        //1 e 5 paredes
        //2 para começo e fim  
        //3 e 4 reservada para testar caminho
        //lembrete pra concerta os nomes da variaveis linhas e coluna que estao trocadas 


        while (!camilho) {
            expandiu = true;
            camilho = false;
            //fazendo as paredes externas(contorno)
            for (int coluna = 0; coluna < labirinto.length; coluna++) {
                for (int linha = 0; linha < labirinto[coluna].length; linha++) {
                    if (coluna == 0 || coluna == labirinto.length - 1 || linha == 0
                            || linha == labirinto[0].length - 1) {
                        labirinto[coluna][linha] = 5;
                    } else {
                        labirinto[coluna][linha] = 0;
                    }
                }
            }
            // gerando paredes aleatorias 
            /*obs:tirando as paredes ha 324 elementos para o melhor funcionamento defina i para menos 
            que a metade disso(162)numeros mais aultos gerram maior probabilidade de lobirintos sem saidas 
            para comparacao com i = 150 gerou 16765 labirintos sem saida
            */
            for (int i = 0; i < 140; i++) {
                int x;
                int y;
                int aredor = 0;
                x = aleatorio.nextInt(20);
                y = aleatorio.nextInt(20);
                if (labirinto[x][y] == 0) {
                    // cauculando os aredores da posiçao selecionada pelo sorteio e armazenando em aredor
                    // se aredor for maior que 4 sera sorteado outra posisao para as paredes ficarem mais espalhadas  
                    if (labirinto[x + 1][y + 1] == 1) {
                        aredor++;
                    }
                    if (labirinto[x + 1][y - 1] == 1) {
                        aredor++;
                    }
                    if (labirinto[x + 1][y] == 1) {
                        aredor++;
                    }
                    if (labirinto[x][y + 1] == 1) {
                        aredor++;
                    }
                    if (labirinto[x][y - 1] == 1) {
                        aredor++;
                    }
                    if (labirinto[x - 1][y - 1] == 1) {
                        aredor++;
                    }
                    if (labirinto[x - 1][y + 1] == 1) {
                        aredor++;
                    }
                    if (labirinto[x - 1][y] == 1) {
                        aredor++;
                    }
                    //testando se o ponto escolhido  esta colado em auguma parede 
                    if (labirinto[x + 1][y-1] == 5 || labirinto[x + 1][y + 1] == 5 || labirinto[x - 1][y-1] ==5|| labirinto[x - 1][y+1] ==5) {
                        aredor = aredor + 1 ;
                    }
                    if (aredor <= 3) {
                        labirinto[x][y] = 1;
                        aredor = 0;
                    } else {
                        i--;
                        aredor = 0;
                    }
                } else {
                    i--;
                }
            }
            // //desenhando o labirinto para debuger 
            // System.out.println("desenhando o labirinto para debuger");
            // for (int colunaTeste = 0; colunaTeste < labirinto.length; colunaTeste++) {
            //     for (int linhateste = 0; linhateste < labirinto[colunaTeste].length; linhateste++) {
            //         if (labirinto[colunaTeste][linhateste] == 0) {
            //             System.out.print("  ");
            //         } else {
            //             System.out.print(labirinto[colunaTeste][linhateste] + " ");
            //         }
            //     }
            //     System.out.println();
            // }
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
                    // //desenhando o labirinto para debuger
                    // System.out.println("desenhando o labirinto para debuger 2");
                    // System.out.println("expandiu :" + expandiu);
                    // System.out.println("caminho :" + camilho);
                    // for (int colunaTeste = 0; colunaTeste < labirinto.length; colunaTeste++) {
                    //     for (int linhateste = 0; linhateste < labirinto[colunaTeste].length; linhateste++) {
                    //         if (labirinto[colunaTeste][linhateste] == 0) {
                    //             System.out.print("  ");
                    //         } else {
                    //             System.out.print(labirinto[colunaTeste][linhateste] + " ");
                    //         }
                    //     }
                    //     System.out.println();
                    // }
                }
                expandiu = false;
                //desenhando o labirinto para debuger
                labirintosSemSaida++;
                    System.out.println("/------------foi gerado o seguinte labirinto sem saida-----------/ :");
                    
                    // for (int colunaTeste = 0; colunaTeste < labirinto.length; colunaTeste++) {
                    //     for (int linhateste = 0; linhateste < labirinto[colunaTeste].length; linhateste++) {
                    //         if (labirinto[colunaTeste][linhateste] == 0 || labirinto[colunaTeste][linhateste] == 3
                    //                 || labirinto[colunaTeste][linhateste] == 4) {
                    //             System.out.print("  ");
                    //         } else {
                    //             System.out.print(labirinto[colunaTeste][linhateste] + " ");
                    //         }
                    //     }
                    //     System.out.println();
                    // }
                    // System.out.println("/-----------------ira ser gerado outro labirinto-----------------/ :");

            }

        }
        System.out.println("/-----------------o labirinto de paredes randomicas que foi gerado -----------------/ :");
        System.out.println("foram gerados :" + labirintosSemSaida + "labirintos sem saida ");
        for (int coluna = 0; coluna < labirinto.length; coluna++) {
            for (int linha = 0; linha < labirinto[coluna].length; linha++) {
                if (labirinto[coluna][linha] == 0 ||labirinto[coluna][linha] == 3 ||labirinto[coluna][linha] == 4 ) {
                System.out.print("  ");    
                }else{
                System.out.print("# ");
                }
            }
            System.out.println();
        }
               
    
    }
}