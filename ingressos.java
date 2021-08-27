/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int ingressoNormal, ingressoEstudante, ingressoAcessivel;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos ingressos normais foram vendidos?");
		 ingressoNormal = entrada.nextInt(); /*Entrada do usuário*/
		 System.out.println("Quantos ingressos para estudantes foram vendidos?");
		 ingressoEstudante = entrada.nextInt(); /*Entrada do usuário*/
		 System.out.println("Quantos ingressos acessíveis foram vendidos?");
		 ingressoAcessivel = entrada.nextInt(); /*Entrada do usuário*/
		 
		 System.out.println("Foram vendidos:");
		 System.out.println(ingressoNormal + " ingressos normais.");
		 System.out.println(ingressoEstudante + " ingressos para estudantes.");
		 System.out.println(ingressoAcessivel + " ingressos acessíveis.");
		
	}
}
