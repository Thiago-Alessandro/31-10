package atividade31_10;

import java.util.Random;
import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		
	int escolhaUsuario, escolhaComputador, verificadorPartida, pontosComputador = 0, pontosUsuario = 0, contadorVitoria = 0;
	
	Scanner teclado = new Scanner(System.in);
	
	Random opcaoComputador = new Random();
	
	System.out.print("Qual o tipo de partida?\n\n1 - normal\n2 - melhor de três\n3 - Partida personalizada\n");
	verificadorPartida = teclado.nextInt();
	
	if (verificadorPartida == 1) {
		
		contadorVitoria = 1;
	}
	
	
	else if (verificadorPartida == 2) {
		
		contadorVitoria = 2;
	}
	
	else if (verificadorPartida == 3) {
		
		System.out.print("Digite a quantidade de pontos para vencer: ");
		contadorVitoria = teclado.nextInt();
		
	}
while (pontosComputador < contadorVitoria && pontosUsuario < contadorVitoria) {
			
			System.out.print("\nQual a sua escolha?\n\n0 - pedra\n1 - papel\n2 - tesoura\n");
			escolhaUsuario = teclado.nextInt();
			
			escolhaComputador = opcaoComputador.nextInt(3);
			
			System.out.print("\nUsuário X computador\n");
			
			if (escolhaUsuario == 0) {
				System.out.print("Pedra X ");
			}
			else if(escolhaUsuario == 1) {
				System.out.print("Papel X");
			}
			else {
				System.out.print("Tesoura X ");
			}
			
			
			if (escolhaComputador == 0) {
				System.out.print("Pedra");
			}
			else if(escolhaComputador == 1) {
				System.out.print("Papel");
			}
			else {
				System.out.print("Tesoura");
			}
			
			
			if (escolhaUsuario == escolhaComputador) {
				System.out.print("\nEmpate!");
			}
			else if(escolhaUsuario == 0 && escolhaComputador == 1 || escolhaUsuario == 1 && escolhaComputador == 2 || escolhaUsuario == 2 && escolhaComputador == 0) {
				System.out.print("\n\nPonto para o computador!\n");
				pontosComputador++;
			}
			else {
				System.out.print("\n\nPonto para o Usuário!\n");
				pontosUsuario++;
			}
		}
		if (pontosComputador > pontosUsuario) {
			System.out.print("\nVocê perdeu!");
		}
		else {
			System.out.print("\nVocê ganhou!");
		}
	}

}
