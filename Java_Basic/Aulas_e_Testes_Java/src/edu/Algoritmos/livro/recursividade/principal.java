package edu.Algoritmos.livro.recursividade;

public class principal {
	
	public static void main(String[] args) {
		System.out.println(teste(5));
		System.out.println("-------------------------------------------");
		//Tela.hilbert(20, 4);
		System.out.println("-------------------------------------------");
		Tela.sierpinski(10, 3);
		System.out.println("Sequencias de passos de um cavalo em um tabuleiro de xadrez");
		HorseBacktracking horseTab5 = new HorseBacktracking(6);
		//horseTab5.existe(1,1);
		System.out.println("-------------------------------------------");
		System.out.println("Queens todas as possibilidades para não se atacarem em um xadrez");
		//Queens.test();
		System.out.println("-------------------------------------------");
		System.out.println("Casamentos possiveis mais estaveis");
		Marrieg mar = new Marrieg(9);
		//mar.teste();
		System.out.println("-------------------------------------------");
		System.out.println("O problema da seleção ótima, Mala");
		//SelecaoOtima.test(10);
	}
	
	public static int teste(int i) {
		
		if(i>0) {i = teste(--i);}
		
		if(i<0) {i = teste(++i);}
		
		return i;
	}
}
