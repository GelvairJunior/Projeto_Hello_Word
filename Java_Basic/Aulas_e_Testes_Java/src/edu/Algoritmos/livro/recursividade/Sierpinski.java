package edu.Algoritmos.livro.recursividade;

import java.awt.*;
import javax.swing.JPanel;

public class Sierpinski extends JPanel {
	
	int u;
	int i;
	int l;
	Linhas linhas;

	public Sierpinski(int u, int i) {
		this.u = u;
		this.l = u*2;
		this.i = i;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		linhas = new Linhas(g, 500, 200);
		this.setBackground(Color.white);
		
		g.setColor(Color.black);
		
		desenha(i);
		
	}
	
	public void desenha(int k) {
		a(k);
		linhas.baixo_direita(u);
		b(k);
		linhas.baixo_esquerda(u);
		c(k);
		linhas.cima_esquerda(u);
		d(k);
		linhas.cima_direita(u);
	}
	
	public void a(int k) {
		if(k > 0) {
			a(k-1);
			linhas.baixo_direita(u);
			b(k-1);
			linhas.direita(l);
			d(k-1);
			linhas.cima_direita(u);
			a(k-1);
		}
	}
	
	public void b(int k) {
		if(k > 0) {
			b(k-1);
			linhas.baixo_esquerda(u);
			c(k-1);
			linhas.baixo(l);
			a(k-1);
			linhas.baixo_direita(u);
			b(k-1);
		}
	}
	
	public void c(int k) {
		if(k > 0) {
			c(k-1);
			linhas.cima_esquerda(u);
			d(k-1);
			linhas.esquerda(l);
			b(k-1);
			linhas.baixo_esquerda(u);
			c(k-1);
		}
	}
	
	public void d(int k) {
		if(k > 0) {
			d(k-1);
			linhas.cima_direita(u);
			a(k-1);
			linhas.cima(l);
			c(k-1);
			linhas.cima_esquerda(u);
			d(k-1);
		}
	}
	
}
