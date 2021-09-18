/*
Escreva um programa para receber a idade e o sexo de 4 pessoas.
No final mostrar:
Quantidade de pessoas do sexo feminino OK
Quantidade de pessoas do sexo masculino OK
Idade média das pessoas do sexo feminino
Idade média das pessoas do sexo masculino
*/

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char sexo = ' ';
        
        int contador=0;
        int masculino=0;
        int feminino=0;
        
        int quantidadeTotal;
        int idadeMasculino;
        int idadeFeminino;
        
        int mediaMasc, mediaFem;
        
        int acumuladorMasc =0;
        int acumuladorFem =0;
        
        System.out.println("Informe quantas pessoas deseja cadastrar:");
        quantidadeTotal = entrada.nextInt();
        
        entrada.nextLine(); //Limpeza de buffer
        
        do{ //faça
            System.out.println("Digite M para masculino e F para feminino"); 
            sexo = entrada.nextLine().charAt(0);
            sexo = Character.toUpperCase(sexo);
            contador = contador + 1;
            
            if (sexo == 'M'){
                masculino = masculino + 1;
                System.out.println("informe a idade");
                idadeMasculino = entrada.nextInt();
                acumuladorMasc = acumuladorMasc + idadeMasculino;
                entrada.nextLine();
                
            }else if (sexo == 'F'){
                feminino = feminino + 1;
                System.out.println("informe a idade");
                idadeFeminino = entrada.nextInt();
                acumuladorFem = acumuladorFem + idadeFeminino;
                entrada.nextLine();
                
            }else{
                System.out.println("Opção incorreta.");
            }//fim else if 
            
        }// fim do
        
        while (sexo != 'M' && sexo != 'F' || contador < quantidadeTotal);
        
            System.out.println("Masculino: " + masculino);
            System.out.println("Feminino:  " + feminino );
            
                if (masculino != 0){
                    mediaMasc = (acumuladorMasc / masculino);
                    System.out.println("A média das idades masculinas é:" + mediaMasc);
                } //fim if 
                
                if (feminino != 0){
                    mediaFem = (acumuladorFem / feminino);
                    System.out.println("A média das idades femininas é:" + mediaFem);
                } //fim if 

    }
}
















