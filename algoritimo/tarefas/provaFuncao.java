/**
Servidor de DNS
Escreva um programa que permita a um usuário
armazenar e consultar informações de hosts –
hostname, domínio, e IP (ip versão 4) -, contendo as
seguintes funcionalidades:
A) Inserir novos dados – nome do host, domínio e ip -
(sem apagar os anteriores) (1 ponto)
B) Consultar um host pelo nome e exibir seus seu ip (1
ponto)
C) Listar o nome do host e ip de todos os hosts de um
determinado domínio (informado pelo usuário) (1,5
ponto)
D) Apresentar um relatório com os dados dos hosts com
ip em formato incorreto (pesquisar formato de ip) (2
ponto)
E) Alterar os dados de um host – (2 pontos)
*/

public class teste  {
    string a ;
    int b ;
}
static teste name( teste a ) {
    a.a="aaaaa";
    a.b= 1000;
    return a;
}
public class provaFuncao {
    public static void main(String[] args) {
        teste teste = new teste();
        teste = name(teste);
        System.out.println(teste.a);
        System.out.println(teste.b);
    }
}