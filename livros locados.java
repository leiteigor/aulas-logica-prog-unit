/******************************************************************************

Criado por Igor Leite 
Data 09/09/21
Prof Aldo 

Escreva um programa que receba, via teclado, o valor da locação e os dias de atraso de um determinado livro
e mostre o valor total da multa a ser paga.

Se tiver atraso, é cobrado R$ 1,50 por dia de atraso.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner entrada = new Scanner(System.in);
	    
	    double  valorAtraso, valorLocacao, totalGeral;
	        
	        System.out.println("Informe o valor da locação");
	        valorLocacao = entrada.nextDouble();
	        
	        System.out.println("Informe quantos dias está em atraso");
	        int diasAtraso = entrada.nextInt();
	        
	        valorAtraso = (diasAtraso * 1.50);
	        totalGeral = valorAtraso + valorLocacao;
	        
	        if (diasAtraso > 1){
	            System.out.println("Está atrasado há "+ diasAtraso +" dias e a multa por dia é de R$1,50");
	            System.out.println("Total de atraso: R$"+valorAtraso);
	            System.out.println("Total da locação: R$"+valorLocacao);
	            System.out.println("Valor total: R$"+totalGeral);
	            
	        }else{
	            System.out.println("Total da locação: R$"+valorLocacao);
	            System.out.println("Não está atrasado.");
	            System.out.println("Valor total: R$"+totalGeral);
	        }

	}
}