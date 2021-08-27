/******************************************************************************
Programa criado por Igor Leite 
Criado em 25/08/2021
Disciplina de Algoritmo e lógica de programação
Professor: Aldo

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner entrada = new Scanner(System.in);
	    System.out.print("Informe em que lingua deseja ler: \n" );
	    System.out.print("1 para Português - BR \n" );
	    System.out.print("2 para Inglês - EUA \n" );
	    int lingua = entrada.nextInt(); /*Entrada do usuário*/
	    

	    if (lingua == 1){ /*PORTUGUÊS*/
    	    System.out.print("Os dias da semana são: \n" );
    		System.out.print("Segunda-feira\n" );
    		System.out.print("Terça-feira\n" );
    		System.out.print("Quarta-feira\n" );
    		System.out.print("Quinta-feira\n" );
    		System.out.print("Sexta-feira\n" );
    		System.out.print("Sábado\n" );
    		System.out.print("Domingo\n" );
	      }
	    
	    else{ /*INGLÊS*/
	        System.out.print("The days of the week are \n" );
    		System.out.print("Monday\n" );
    		System.out.print("Tuesday\n" );
    		System.out.print("Wednesday\n" );
    		System.out.print("Thursday\n" );
    		System.out.print("Friday\n" );
    		System.out.print("Saturday\n" );
    		System.out.print("Sunday\n" );
	      }
	    
	    
	    
	    

		
	}
}


