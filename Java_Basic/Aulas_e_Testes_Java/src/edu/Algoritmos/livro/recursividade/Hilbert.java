package edu.Algoritmos.livro.recursividade;

import java.awt.*;
import javax.swing.JPanel;

public class Hilbert extends JPanel{
	
	int u;
	int i;
	Linhas linhas;

	public Hilbert(int u, int i) {
		this.u = u;
		this.i = i;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		linhas = new Linhas(g, 1000, 0);
		this.setBackground(Color.white);
		
		g.setColor(Color.black);
		
		A(i);
	}
	
	public void A(int i) {
		if(i > 0) {
			D(i - 1);
	        
	        linhas.esquerda(u);

	        A(i - 1);
	        
	        linhas.baixo(u);

	        A(i - 1);

	        linhas.direita(u);

	        B(i - 1);
		}
	}
	
	public void B(int i) {
		if(i > 0) {
			C(i - 1);

			linhas.cima(u);

	        B(i - 1);

	        linhas.direita(u);

	        B(i - 1);

	        linhas.baixo(u);

	        A(i - 1);
		}
	}
	
	public void C(int i) {
		if(i > 0) {
			B(i - 1);

			linhas.direita(u);

	        C(i - 1);

	        linhas.cima(u);

	        C(i - 1);

	        linhas.esquerda(u);

	        D(i - 1);
		}
	}
	
	public void D(int i) {
		if(i > 0) {
			A(i - 1);
	        
	        linhas.baixo(u);

	        D(i - 1);
	        
	        linhas.esquerda(u);

	        D(i - 1);

	        linhas.cima(u);

	        C(i - 1);
		}
	}

}
