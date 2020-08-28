// Class name must be "Main"
// Libraries included:
// json simple, guava, apache commons lang3, junit, jmock
//aluno: guilherme Henrique Siqueira Lopes
//link codebunk : https://codebunk.com/b/7661100139663/

/* 
Escreva um programa de geometria que contenha as seguintes funcionalidades:
• Permita ao usuário escolher um dos seguintes polígonos para trabalhar (2):
o Quadrado ou retângulo
o Triângulo
o Círculo
• Permita ao usuário informar os seguintes dados (dependendo do polígono escolhido) para
serem armazenados em um registro(3):
o Quadrado ou retângulo: base e altura
o Triângulo: lado 1, lado 2, lado 3, base e altura
o Círculo: raio
• Antes de encerrar o programa deve executar as seguintes operacoes (implementadas
usando funções) sobre o poligono escolhido (5):
o Calcular e apresentar a área do poligono
o Calcular e apresentar o perímetro do poligono.
o No caso de ser um triângulo, verificar se os valores dos lados podem formar
realmente um triangulo
*/
/**
 * ProvaA2
 */
import java.util.Scanner;
import java.lang.Math;
class Quadrado  {
    double base;
    double altura;
    double area;
    double perimetro;
}
class triangulo  {
    //Triângulo: lado 1, lado 2, lado 3, base e altura
    double lado1;
    double lado2;
    double lado3;
    double base;
    double area;
    double perimetro;
    double altura ;
    
}
class circulo  {
    double raio;
    double area;
    double perimetro;    
    
}
class Main {
/**
 * • Antes de encerrar o programa deve executar as seguintes operacoes (implementadas
usando funções) sobre o poligono escolhido (5):
o Calcular e apresentar a área do poligono
o Calcular e apresentar o perímetro do poligono.
o No caso de ser um triângulo, verificar se os valores dos lados podem formar
realmente um triangulo
 */
//#region funcoes circulo 
    static double areaCirculo(double raio ){
        // π r²
        double area = (Math.PI)*(raio*raio);
        System.out.println("a area do circulo e de : "+ area + "cm quadrado");
        return area;
    } 
    static double perimetroCirculo(double raio ){
        // 2π*r
        double perimetro = 2*(Math.PI)*(raio);
        System.out.println("o perimetro desse circulo e de : "+ perimetro+"cm");
        return perimetro;
    }
//#endregion    
//#region quadrado
        
    static double areaQuadrado(double base , double altura ){
        
        double area = base*altura;
        System.out.println("a area do quadrado e de  : " + area+ "cm quadrado");
        return area;
    } 
    static double perimetroQuadrado(double base ,double altura ){
        
        double perimetro = (2*base)+(2*altura);
        System.out.println("o perimetro desse quadrado e de : "+ perimetro+"cm");
        return perimetro;
    }
//#endregion
//#region triangulo 
static double areaTriangulo(double base , double altura ){
        
    double area = (base*altura)/2;
    System.out.println("a area do triangulo e de  : " + area+ "cm quadrado");
    return area;

} 
static double perimetroTriangulo( double lado1 , double lado2 , double lado3 ){
    
    double perimetro = lado1+lado2+lado3;
    System.out.println("o perimetro desse triangulo e de : "+ perimetro+"cm");
    return perimetro;

}
static boolean verificacaoTriangulo( double lado1, double lado2 ,double lado3){
    if (lado1> lado2+ lado3) {
        System.out.println("esse triangulo nao existe pois o lado 1 e maior que a soma dos outro dois lados ");
        return false;
    } else if (lado2> lado1+ lado3){
        System.out.println("esse triangulo nao existe pois o lado 2 e maior que a soma dos outro dois lados ");
        return false;
    } else if (lado3> lado2+ lado1){
        System.out.println("esse triangulo nao existe pois o lado 3 e maior que a soma dos outro dois lados ");
        return false;
    }else{
        return true;
    }
    
}
//#endregion
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int opcao ;
        System.out.println("escolha o poligno que deseja trabalhar :");
        System.out.println("");
        System.out.println("1 : quadrado ou retangulo ");
        System.out.println("2 : triangulo ");
        System.out.println("3 : circulo");
        System.out.println("");
        System.out.println("digite o numero da opção ");
        opcao = Leitor.nextInt();
        if (opcao == 1) {
            Quadrado poligno = new Quadrado();
            System.out.println("digite o valor da base do retangulo (ou quadrado) em cm ");
            poligno.base = Leitor.nextDouble();
            System.out.println("digite a altura do retangulo (ou quadrado) em cm");
            poligno.altura = Leitor.nextDouble();
            poligno.area = areaQuadrado(poligno.base,poligno.altura);
            poligno.perimetro = perimetroQuadrado(poligno.base,poligno.altura);          
        } else if( opcao == 2 ){
            //Triângulo: lado 1, lado 2, lado 3, base e altura            
            triangulo poligno = new triangulo();
            System.out.println("digite o valor do lado1 do triangulo em cm ");
            poligno.lado1 = Leitor.nextDouble();
            System.out.println("digite o valor do lado2 do triangulo em cm ");
            poligno.lado2 = Leitor.nextDouble();
            System.out.println("digite o valor do lado3 do triangulo em cm ");
            poligno.lado3 = Leitor.nextDouble();
            boolean verificacao = verificacaoTriangulo( poligno.lado1,poligno.lado2,poligno.lado3);
            if(verificacao){
                System.out.println("digite o valor da base do triangulo em cm ");
                poligno.base = Leitor.nextDouble();
                System.out.println("digite o valor da altura do triangulo em cm ");
                poligno.altura = Leitor.nextDouble();
                
                poligno.area = areaTriangulo(poligno.base , poligno.altura ) ;
                poligno.perimetro = perimetroTriangulo( poligno.lado1 , poligno.lado2 , poligno.lado3 );           

            }
        }else if(opcao == 3){
            circulo poligno = new circulo();
            System.out.println("digite o valor doraio do circulo em cm");
            poligno.raio = Leitor.nextDouble();   
            poligno.area = areaCirculo(poligno.raio );
            poligno.perimetro = perimetroCirculo(poligno.raio);
        }
    }
}
