
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner entrada = new Scanner(System.in);
	    
	     System.out.println("Bem vindo ao Teatro UNIT!");
	     System.out.println("Normal R$100");
	     System.out.println("Estudante R$50");
	     System.out.println("Acessível R$30");
	     
	     System.out.println("Quantos ingressos normais foram vendidos?");
	     double ingressoNormal = entrada.nextFloat();
	     System.out.println("Quantos ingressos para estudante foram vendidos?");
	     double ingressoEstudante = entrada.nextFloat();
	     System.out.println("Quantos ingressos acessíveis foram vendidos?");
	     double ingressoAcessivel = entrada.nextFloat();
	     
	     double totalNormal, totalEstudante, totalAcessivel;
	     
	     totalNormal = ingressoNormal * 100  ;
	     totalEstudante = ingressoEstudante * 50  ;
	     totalAcessivel = ingressoAcessivel * 30  ;
	     
	     System.out.printf("\n Foram vendidos %.0f de ingressos normais, totalizando R$%.2f", ingressoNormal, totalNormal);
	     System.out.printf("\n Foram vendidos %.0f de ingressos para estudantes, totalizando R$%.2f", ingressoEstudante, totalEstudante);
	     System.out.printf("\n Foram vendidos %.0f de ingressos acessíveis, totalizando R$%.2f", ingressoAcessivel, totalAcessivel);
	}
}