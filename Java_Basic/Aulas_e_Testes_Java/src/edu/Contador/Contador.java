package edu.Contador;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		boolean continuar;
		Scanner scanner = new Scanner(System.in);
		int parametro1;
		int parametro2;
		do {
			System.out.print("Digite o primeiro parametro: ");
			parametro1 = scanner.nextInt();
			System.out.print("Digite o segundo parametro: ");
			parametro2 = scanner.nextInt();
			
		
		
			try {
				contar(parametro2 - parametro1);
				continuar = false;
			} catch (ParametrosInvalidosException e) {
				e.printStackTrace();
				continuar = true;
			}
		} while(continuar == true);
		
	}
	
	public static void contar(int contagem) throws ParametrosInvalidosException {
		if (contagem < 0) {
			
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			System.out.println("Vamos tentar de novo");
			throw new ParametrosInvalidosException();
		}
		for (int i = 1; i < contagem + 1; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}
