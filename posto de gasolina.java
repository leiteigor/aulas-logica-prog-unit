/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Bem vindo ao Posto UNIT!");
	     System.out.println("Gasolina R$7,000");
	     System.out.println("Etanol R$6,000");
	     System.out.println("Quantos litros de GASOLINA foram abastecidos?");
	     float gasolina = entrada.nextFloat();
	     System.out.println("Quantos litros de ETANOL foram abastecidos?");
	     float etanol = entrada.nextFloat();
	     
	     float totalGasolina, totalEtanol;
	     
	     totalGasolina = gasolina * 7 ;
	     totalEtanol = etanol * 6 ;
	     
	     System.out.println("Foram abastecidos "+ gasolina +" de gasolina, totalizando " + totalGasolina);
	     System.out.println("Foram abastecidos "+ etanol +" de etanol, totalizando " + totalEtanol);
	}
}
