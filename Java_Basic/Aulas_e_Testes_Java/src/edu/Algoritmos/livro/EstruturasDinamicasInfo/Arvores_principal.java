package edu.Algoritmos.livro.EstruturasDinamicasInfo;

public class Arvores_principal {

	public static void main() {
		Integer[] seq = {0,8,9,11,15,19,20,21,7,3,2,1,5,6,4,13,14,10,12,17,16,18,33,8,15,12,14};
		Sequencia<Integer> s = new Sequencia<Integer>(); s.OpenSeq(); s.startWrite(); for(int x = 0; x < seq.length; x++) {s.f.writeWord(seq[x]);}
		Sequencia<String> tes = SequenciaLimpeza.gerador_texto(); Sequencia<String> tes2 = SequenciaLimpeza.gerador_texto();
		
		Arvore_perfeitamente_balanceada apb = new Arvore_perfeitamente_balanceada();
		apb.teste(22, s);
		
		System.out.println("______________________________");
		Arvore_Binaria_Search abs = new Arvore_Binaria_Search();
		abs.teste(s);
		
		System.out.println("______________________________");
		Arvore_Balanceada<String> ab = new Arvore_Balanceada<String>();
		ab.teste(tes, tes2);
		
		System.out.println("______________________________");
		Arvore_Busca_Otima<String> abo = new Arvore_Busca_Otima<String>();
		abo.teste(tes);
		
		
	}
}
