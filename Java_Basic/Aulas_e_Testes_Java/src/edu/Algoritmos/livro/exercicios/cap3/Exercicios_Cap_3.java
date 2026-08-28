package edu.Algoritmos.livro.exercicios.cap3;

import javax.swing.JFrame;

import edu.Algoritmos.livro.recursividade.Hilbert;
import edu.Algoritmos.livro.recursividade.Marrieg;

public class Exercicios_Cap_3 {
	
	public static void main(String[] args) {
		TorreDeRanoi torre = new TorreDeRanoi(5);
		torre.teste();
		System.out.println("_____________________________________________________");
		NPermutacoesFatoracao.test(4);
		System.out.println("_____________________________________________________");
		desafio3();// deu errado
		QueensResult.test();
		System.out.println("_____________________________________________________");
		CasamentoEstavelOtimoMasc casa = new CasamentoEstavelOtimoMasc(9);
		casa.teste();
		System.out.println("_____________________________________________________");
		System.out.println("Ackermann sem recursão: "+ AckermannSemRecursao.teste(3,6));
	}
	
	private static void desafio3() {
		JFrame frame = new JFrame();
		W_Inspiracao_Sierpinski W = new W_Inspiracao_Sierpinski(20, 2);
		frame.add(W);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setVisible(true);
	}
	
}
