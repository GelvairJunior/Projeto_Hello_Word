package edu.Algoritmos.livro.exercicios.cap3;

import java.awt.Color;
import java.awt.Graphics;

import java.awt.*;
import javax.swing.JPanel;
import edu.Algoritmos.livro.recursividade.Linhas;


public class W_Inspiracao_Sierpinski extends JPanel {
	
	int u;
	int i;
	Linhas linhas;
	
	public W_Inspiracao_Sierpinski(int u, int i) {
		this.u = u;
		this.i = i;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		linhas = new Linhas(g, 200, 200);
		this.setBackground(Color.white);
		
		g.setColor(Color.black);
		
		W(i);
	}
	
	public void W(int i) {
		a(i);
		linhas.direita(u);
		b(i);
		linhas.baixo(u);
		c(i);
		linhas.esquerda(u);
		d(i);
		linhas.cima(u);
	}
	
	public void a(int i) {
		if(i > 0) {
			a(i-1);
			linhas.direita(u);
			b(i-1);
			b(i-1);
			linhas.cima(u);
			a(i-1);
		}
	}
	
	public void b(int i) {
		if(i > 0) {
			b(i-1);
			linhas.baixo(u);
			c(i-1);
			c(i-1);
			linhas.direita(u);
			b(i-1);
		}
	}

	public void c(int i) {
		if(i > 0) {
			c(i-1);
			linhas.esquerda(u);
			d(i-1);
			d(i-1);
			linhas.baixo(u);
			c(i-1);
		}
	}

	public void d(int i) {
		if(i > 0) {
			d(i-1);
			linhas.cima(u);
			a(i-1);
			a(i-1);
			linhas.esquerda(u);
			d(i-1);
		}
	}
}
