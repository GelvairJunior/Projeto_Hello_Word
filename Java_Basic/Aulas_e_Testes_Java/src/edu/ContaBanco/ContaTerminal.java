package edu.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ContaBanco conta = new ContaBanco();
		
		System.out.print("Por favor, digite o seu nome completo: ");
		conta.setNomeCliente(scanner.nextLine());

		System.out.print("Por favor, digite o numero da sua conta: ");
		conta.setNumConta(scanner.nextInt());

		System.out.print("Por favor, digite o número da sua Agência: ");
		conta.setAgencia(scanner.next());
		
		System.out.print("Digte o quanto você depositou: ");
		conta.setSaldo(scanner.nextDouble());
		
		conta.mensagem();
		
	}
}
