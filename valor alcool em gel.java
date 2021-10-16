/******************************************************************************

O álcool gel passou a ser subsidiado pelo governo e nenhum estabelecimento poderá vender o produto
por preço igual ou superior ao preço praticado em dezembro/2019.

Elabore um programa para ler o preço atual e o preço praticado em dezembro/2019
e mostrar “Venda não pode ser realizada – Preço superfaturado”, 
se o preço atual for equivalente ou ultrapassar o preço praticado em dezembro/2019.

Criado por Igor Leite 
Data 15/09/21
Prod Aldo 

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    float valorVenda;
	    float valor2019 = 5;
	    
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Digite o valor da revenda ");
	    valorVenda = entrada.nextFloat();
	    
	    if (valorVenda > valor2019){
	        
    	        System.out.println("Venda não pode ser realizada – Preço superfaturado");
    	        
    	    } else {
    	        
    	        System.out.println("Produto cadastrado com sucesso. Valor R$"+ valorVenda);
    	    }
	}
}
