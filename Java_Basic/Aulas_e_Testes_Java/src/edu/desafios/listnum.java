package edu.desafios;

public class listnum {// aqui é para somar todos os numeros de uma lista e tirar o maior e o menor numero da soma
	public static void main (String[] args) {
		
		int[] numbers = {6, 2, 1, 8, 10};
		
		System.out.print(12345678 % 23);
		
		int num = somar(numbers);
		
		if (num == 16) {
			System.out.println(true);
			System.out.println(num);
		}
		
		else {
			System.out.println(num);
		}
		
	}
	
	public static int somar(int[] numbers) {
		
		int soma = 0;
		
    
	    if ( numbers == null) {
	      return 0;
	    }
		if (numbers.length == 1) {
			return 0;
		}
		int maior = numbers[0];
		int menor = numbers[0];
			
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > maior) {
				maior = numbers[i];
				
			}
					
			if (numbers[i] < menor) {
				menor = numbers[i];
				
			}
			soma = soma + numbers[i];
					
		}
		soma = soma - maior - menor;
			
		return soma;
	  }
		
}
