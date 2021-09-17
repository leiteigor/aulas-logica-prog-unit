import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner entrada = new Scanner(System.in);
	    int contador = 0;
	    float acumulador = 0;
	    float valor;
	    
	    do{
	        contador = contador + 1;
	        System.out.printf("Valor do %2dº produto\n", contador);
	        valor = entrada.nextFloat();
	        acumulador = acumulador + valor;
	        
	    }while (contador < 4);
	        System.out.printf("Valor total é %.2f R$", acumulador);
	    
	    
	}
}
