/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    
    
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	    
    		System.out.print("Informe a nota 1: \n" );
    	    float nota1 = teclado.nextFloat(); /*Entrada do usuário*/
    	    
    	    System.out.print("Informe a nota 2: \n" );
    	    float nota2 = teclado.nextFloat(); /*Entrada do usuário*/
		
		float media = (nota1 + nota2) / 2;
		System.out.println("A Média é: " + media); /*Média calculada*/
		
	}
}
