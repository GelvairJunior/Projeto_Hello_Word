package aulas_e_testes;

public class Calculadora {
	
	public static void main (String[] args) {
		int numeros[] = {1, 2, 4}; 
		short opcao = 3;
		double resultado = 0;
		
		
		System.out.println("Agora vamos fazer umas contas basicas ");
		
		if (opcao == 1) {
			resultado = somar(numeros);
		}
			
		if (opcao == 2) {
			resultado = diminuir(numeros);
		}
		
		if (opcao == 3) {
			resultado = multiplicar(numeros);
		}
		
		if (opcao == 4) {
			resultado = dividir(numeros);
		}
		
		
		System.out.println("o resultado é "+ resultado);
		
		System.out.println("Vamos fazer algo engraçado, que é utilizar o ++ e --");

		
	}
	
	
	
	
	public static double somar (int[] numeros) {
		int resultado = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			resultado = numeros[i] + resultado;
		}
		
		return resultado;
		
	}
	
	public static double diminuir (int[] numeros) {
		int resultado = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			resultado = (numeros[i] - resultado);
		}
		
		return resultado;
	}
	
	public static double multiplicar (int[] numeros) {
		int resultado = 1;
		
		
		for (int i = 0; i < numeros.length; i++) {
			resultado = (resultado * numeros[i]);
		}
		
		return resultado;
	}
	
	public static double dividir (int[] numeros) {
		int resultado = 1;
		
		for (int i = 0; i < numeros.length; i++) {
			resultado = (numeros[i] / resultado);
		}
		
		return resultado;
	}

}