package edu.desafios;

public class Nomes268 {
	public static void main(String[] args) {
		String[] nomes = new String[10];
		String[] cadastrar = {"USP", "UFPE", "UFCG", "UFRN", "UFRJ", "IME", "ITA", "UNIOESTE", "URI", "UFG"};
		
		
		for(int i=0; i<10; i++) {
			nomes[i] = cadastrar[i];
			if (i == 2 || i == 6 || i == 8) {
				System.out.println(nomes[i]);
			}
		}
	}
}
