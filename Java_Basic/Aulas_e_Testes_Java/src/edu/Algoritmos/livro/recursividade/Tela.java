package edu.Algoritmos.livro.recursividade;
import javax.swing.JFrame;

public class Tela {
	
	public static void hilbert(int u, int i) {
		JFrame frame = new JFrame();
		Hilbert hil = new Hilbert(u, i);
		
		frame.add(hil);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		
	}
	
	public static void sierpinski(int u, int i) {
		JFrame frame = new JFrame();
		Sierpinski sie = new Sierpinski(u, i);
		
		frame.add(sie);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		
	}
	
	
}
