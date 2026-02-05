package edu.desafios;

public class SpanishDNIVerification {
	
	public static void main(String[] args) {
		String document = "12345678Z";
		if (document.length() != 9) {
			System.out.print("Aqui deu erro por insuficiencia de caracteres");
		} else {
			System.out.println(true);
		}
		
		char[] letter = document.toCharArray();
		String numberLetter = "";
		
		for (int i = 0; i < letter.length -1; i++) {
			numberLetter = numberLetter + letter[i];
		}
		
		System.out.println(lastLetter(letter[8], numberLetter));
		System.out.println(concatValidation(numberLetter));
		
		
	}
	
	public static boolean lastLetter(char letter, String numberLetter) {
		char[] listLetter = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		int num = Integer.valueOf(numberLetter);
		
		num = num % 23;
		
		if (letter == listLetter[num]) {
			return true;
		}
		
		return false;
	}
	
	
	
	public static boolean concatValidation(String numberLetter) {
		
		try {
		    Integer.parseInt(numberLetter); // Converte String para int
		} catch (NumberFormatException e) {
		    return false;
		}
		
		return true;
	}
	
}
