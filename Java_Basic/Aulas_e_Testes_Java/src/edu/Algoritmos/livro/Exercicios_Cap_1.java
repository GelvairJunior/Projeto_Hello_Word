package edu.Algoritmos.livro;

public class Exercicios_Cap_1 {
	
	public static void main(String[] args) {
		
		String[] texto = {"Segue", "sua", "nota", "fiscal", "ta", "bom"};
		String[] Alterar = {"nota", "bom"};
		String[] B_Novo = {"mapo", "ruim"};
		
		System.out.println(conversor(texto, Alterar, B_Novo));
		
		
	}
	
	
	static String conversor(String[] T, String[] A, String[] B) {

		String S = "";
		for(int j = 0; j < A.length; j++) {
			for (int i = 0; i < T.length; i++) {
				if (T[i] == A[j]) {
					T[i] = B[j];
				}	
			}
		}
		
		for (int i = 0; i < T.length; i++) {
			S = S+" "+ T[i];
		}
		
		return S;
	}
	
	record Horario(
		    String estacao,
		    String direcao,
		    String chegada,
		    String saida
		){}

	Horario[] tabela;
	
}