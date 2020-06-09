import java.util.Random;

public class labirinto {
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
        //fazendo as paredes 
        for (int coluna = 0; coluna < labirinto.length; coluna++) {
            for (int linha = 0; linha < labirinto[coluna].length; linha++) {
                if (coluna == 0 ||coluna ==  labirinto.length-1||linha == 0 ||linha ==  labirinto[0].length-1) {
                    labirinto[coluna][linha] = 1;
                } else {
                    labirinto[coluna][linha] = 0;
                }
            }
        }                    
        // gerando um labirinto aleatorio
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
        for (int coluna = 0; coluna < labirinto.length; coluna++) {
            for (int linha = 0; linha < labirinto[coluna].length; linha++) {
                System.out.print(labirinto[coluna][linha] + " ");
            }
            System.out.println();
        }
        //testando se tem caminhos posiveis caminho
        labirinto[1][0] = 3; //começo
        labirinto[18][19] = 0;//fim  
        while (!camilho && expandiu) {
            expandiu = false;
            for (int coluna = 0; coluna < labirinto.length; coluna++) {
                for (int linha = 0; linha < labirinto[coluna].length - 1; linha++) {
                    if (labirinto[coluna][linha] == 3) {
                        //expandindo para direita 
                        if (labirinto[coluna][linha + 1] != 3 && labirinto[coluna][linha + 1] != 1
                                && labirinto[coluna - 1][linha] != 4) {
                            labirinto[coluna][linha + 1] = 3;
                            expandiu = true;
                        }
                        //expandindo para esquerda se nao tiver na posisao 0 para nao extrapolar o array
                        if (coluna - 1 > 0) {
                            if (labirinto[coluna][linha - 1] != 3 && labirinto[coluna][linha - 1] != 1
                                    && labirinto[coluna - 1][linha] != 4) {
                                labirinto[coluna][linha - 1] = 3;
                                expandiu = true;
                            }
                        }

                        //expandindo para cima
                        if (labirinto[coluna + 1][linha] != 3 && labirinto[coluna + 1][linha] != 1
                                && labirinto[coluna - 1][linha] != 4) {
                            labirinto[coluna + 1][linha] = 3;
                            expandiu = true;
                        }
                        //expandindo para baixo 
                        if (labirinto[coluna - 1][linha] != 3 && labirinto[coluna - 1][linha] != 1
                                && labirinto[coluna - 1][linha] != 4) {
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
                for (int colunaTeste = 0; colunaTeste < labirinto.length; colunaTeste++) {
                    for (int linhateste = 0; linhateste < labirinto[colunaTeste].length; linhateste++) {
                        System.out.print(labirinto[colunaTeste][linhateste] + " ");
                    }
                    System.out.println();
                }

            }

        }
        
        }
        
        for (int coluna = 0; coluna < labirinto.length; coluna++) {
            for (int linha = 0; linha < labirinto[coluna].length; linha++) {
                System.out.print(labirinto[coluna][linha]+" ");
            }
            System.out.println();
        }
               
    
    }
}