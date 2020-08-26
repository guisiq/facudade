import java.util.Scanner;
class Mercado
{
   String nome;
   
        float precoC;
        float precoV;
        int mes; 
        int ano;
        float lucro; 
        float margem; 
        float max = 0;
        int mesV;
        int anoV;
    
}
 
 public class teste
{
	public static void main(String[] args) {
		Scanner leitor= new Scanner(System.in);
		
		int vetores = 110;
		
		while( vetores >100){
		    System.out.println("Digite o a qauntidade de produtos que deseja cadastrar");
             vetores= leitor.nextInt();
		}
		//Declaracao do Registro// 
		Mercado[] vetor = new Mercado[vetores];
		for(int i=0; i < vetores; i++){
		    vetor[i] = new Mercado();
		    System.out.println("Digite o nome do Produto:");
		    vetor[i].nome = leitor.next();
		    System.out.println("Digite o preco de Compra:" + "R$");
		    vetor[i].precoC = leitor.nextFloat();
		    System.out.println("Digite o Preco de Venda:" + "R$");
		    vetor[i].precoV = leitor.nextFloat();
		    System.out.println("Digite o mes de Validade:");
		    vetor[i].mes = leitor.nextInt();
		    System.out.println("Digite o ano de Validade:");
		    vetor[i].ano = leitor.nextInt();}
		  
		 
		 
		  //Bloco de Lucro de Produto//  
		for( int i=0; i < vetores; i++){
		    vetor[i].lucro = vetor[i].precoV - vetor[i].precoC;
		    System.out.println("O seu Lucro foi R$:" + vetor[i].lucro ); }
	
	       
	       
	       // Bloco de MAior valor//
	         for(int i =0; i < 100; i++){
            if(vetor[i].precoV > vetor[i].max)
            {
                vetor[i].max = vetor[i].precoV;
            }
        
           System.out.println("O Maior preco e R$ " + vetor[i].max);
            }
        
       
       
       
        //Bloco para pesquisar por nome
        int ok =1;
        while(ok == 1)
        {
            System.out.print("Pesquise o produto: ");
            String name = leitor.next();
            
            boolean achou = false;
            
            for(int i = 0; i < vetores; i++)
            {

                if(vetor[i].nome.equals(name))
                {
                    achou = true;
                    System.out.println(" ");
                    System.out.println(vetor[i].nome + " teve lucro de R$ " + vetor[i].lucro);
                    System.out.println(" ");
                }
                else if(achou == false)
                {
                    System.out.println(" ");
                    System.out.println("Nenhum resultado encontrado!");
                    System.out.println(" ");
                }
            }
            
            System.out.print("Deseja procurar outro nome?: 1-Sim  2-Nao ");
            ok = leitor.nextInt();
            
        }   
        
        
	}
	
}