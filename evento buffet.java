/******************************************************************************

Um buffet deseja saber o valor que deverá cobrar para realizar o evento, 
tendo informado que cobra um valor por convidado baseado no valor por pessoa do cardápio
escolhido, mais uma taxa de deslocamento de R$ 3,00 com base na distância em
quilômetros para onde o evento será realizado. 
Identifique os dados necessários para resolução deste problema e implemente um programa 
    para receber os dados, processar os cálculos e mostrar o valor total que deverá cobrar para realizar o evento.

*******************************************************************************/
import java.util.Scanner;


public class Main
{
	public static void main(String[] args) 
	{
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("**** CARDÁPIO ****");
	    System.out.println("Opção 1: Creme de frango - R$15,00 por pessoa");
	    System.out.println("Opção 2: Camarão alho e óleo - R$18,90 por pessoa");
	    System.out.println("Opção 3: Risoto - R$12,75 por pessoa");

	    System.out.println("Informe quantas pessoas terão no evento: ");
	    
	        int quantPessoas = entrada.nextInt();
	    
	    System.out.println("É cobrada uma taxa de deslocamento de R$3,00 por KM. \nInforme a quantos KM de distancia fica o local do evento: ");
    	    float localEvento = entrada.nextFloat();
    	    
    	    float distancia = localEvento * 3;
	    
	    System.out.println("Esse evento fica a " + localEvento + " km, totalizando R$" + distancia + " de deslocamento");
	    System.out.println("Você informou que irão " + quantPessoas + " pessoas");
	    
    	    double op1 = quantPessoas * 15;
            double op2 = quantPessoas * 18.90;	
            double op3 = quantPessoas * 12.75;
        
	    System.out.println("Opção 1: Creme de frango - R$"+ String.format("%.2f", op1) +" mais a taxa de deslocamento de "+ distancia);
	    System.out.println("Opção 2: Camarão alho e óleo - R$"+ String.format("%.2f", op1) +" mais a taxa de deslocamento de "+ distancia);
	    System.out.println("Opção 3: Risoto - R$"+ String.format("%.2f", op1) +" mais a taxa de deslocamento de "+ distancia);
	    

	}
}




