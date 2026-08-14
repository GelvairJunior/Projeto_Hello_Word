package edu.Algoritmos.livro.exercicios.cap3;

import javax.swing.JFrame;

import edu.Algoritmos.livro.recursividade.Hilbert;

public class Exercicios_Cap_3 {
	
	public static void main(String[] args) {
		TorreDeRanoi torre = new TorreDeRanoi(5);
		torre.teste();
		System.out.println("_____________________________________________________");
		NPermutacoesFatoracao.test(4);
		System.out.println("_____________________________________________________");
		
		JFrame frame = new JFrame();
		W_Inspiracao_Sierpinski W = new W_Inspiracao_Sierpinski(20, 4);
		frame.add(W);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		
		System.out.println("_____________________________________________________");
		//QueensResult.test();
	}
}
