/******************************************************************************
Criado por Igor Leite 
Data 09/09/21
Prof Aldo 

Elabore um programa para ler dois números (dividendo e divisor), calcule a divisão e mostre o resultado.

Obs.: Se o divisor for zero a divisão não pode ocorrer e deverá ser mostrado “Impossível divisão por 0”.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    float dividendo, divisor, resto, resultado;
	    
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Digite o dividendo ");
	    dividendo = entrada.nextFloat();
	    
	    System.out.println("Digite o segundo número a dividir");
	    divisor = entrada.nextFloat();
	    
	   
    	    if (divisor == 0){
    	        System.out.println("Impossivel divisão por 0 (zero)");
    	    } else {
    	        resultado = dividendo / divisor;
    	        resto = dividendo % divisor;
    	        
    	        System.out.println("Resultado da divisão:"+resultado);
    	        System.out.println("Resto da divisão:"+resto);
    	    }
	}
}
