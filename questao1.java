package atividade31_10;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		double salarioAtual, salarioNovo = 0, valorFerias = 0, valorDecimoTerceiro = 0;
		int opcao = 0, mesesTrabalhados = 0, inicializador = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		for(;inicializador == 0 ||opcao != 4;inicializador++) {
			
			System.out.print("\nO que você desseja?\n\n1 - Novo salário\n2 - Férias\n3 - Décimo terceiro\n4 - Sair\n");
			opcao = teclado.nextInt();
			
			if (opcao != 4) {
				
				System.out.print("\nInsira o seu salário: R$");
				salarioAtual = teclado.nextDouble();
				
				switch(opcao) {
				
				case 1: 	
					
					if (salarioAtual < 350) {
						salarioNovo = salarioAtual + salarioAtual * 15/100;
					}
					else if(salarioAtual >= 350 && salarioAtual < 600) {
						salarioNovo = salarioAtual + salarioAtual*10/100;
					}
					else if(salarioAtual > 600) {
						salarioNovo = salarioAtual + salarioAtual*5/100;
					}
					System.out.print("\nO salário com o aumento é de: R$" + salarioNovo);
					
					break;
				case 2:
					
					valorFerias = salarioAtual*1/3;
					
					System.out.print("\nO valor a receber em suas férias é: R$" + valorFerias);
					
					break;
				case 3:
					
					System.out.print("\nQuantos meses você trabalhou este ano?\n");
					mesesTrabalhados = teclado.nextInt();
					
					valorDecimoTerceiro = salarioAtual*mesesTrabalhados/12;
					
					System.out.print("\nO valor do seu décimo terceiro é: R$" + valorDecimoTerceiro);
					break;
				}
			}
		}
	}

}
