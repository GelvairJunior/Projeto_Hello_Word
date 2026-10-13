package edu.Algoritmos.livro.EstruturasDinamicasInfo;

public class Arvores_principal {

	public static void main() {
		Integer[] seq = {0,8,9,11,15,19,20,21,7,3,2,1,5,6,4,13,14,10,12,17,16,18,33,8,15,12,14};
		Sequencia<Integer> s = new Sequencia<Integer>(); s.OpenSeq(); s.startWrite(); for(int x = 0; x < seq.length; x++) {s.f.writeWord(seq[x]);}
		
		Arvore_perfeitamente_balanceada apb = new Arvore_perfeitamente_balanceada();
		apb.comecar(22, s);
		
		Arvore_Binaria_Search abs = new Arvore_Binaria_Search();
		abs.teste(s);
		
		Arvore_Balanceada ab = new Arvore_Balanceada();
		
	}
}
