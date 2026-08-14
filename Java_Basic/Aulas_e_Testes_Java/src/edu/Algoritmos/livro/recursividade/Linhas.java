package edu.Algoritmos.livro.recursividade;

import java.awt.*;

public class Linhas{
	private Graphics l;
	public int x;
	public int y;
	
	public Linhas(Graphics g, int x, int y) {
		l = g;
		this.x = x;
		this.y = y;
		
	}
	
	public void line(int u, int p) {
		p = u * (p/100);
		
		l.drawLine(x, y, x+p, y-u);
	}
	
	public void esquerda(int u) {
		l.drawLine(x, y, (x-u), y);
		
		x = x - u;
	}

	public void baixo(int u) {
		l.drawLine(x, y, x, (y+u));
		
		y = y+u;
	}

	public void direita(int u) {
		l.drawLine(x, y, (x+u), y);
		
		x = x + u;
	}

	public void cima(int u) {
		l.drawLine(x, y, x, (y-u));
		
		y = y- u;
		
	}
	
	public void cima_direita(int u) {
		l.drawLine(x, y, (x+u), (y-u));
		
		x = (x+u); 
		y = (y-u);
		
	}
	
	public void cima_esquerda(int u) {
		l.drawLine(x, y, (x-u), (y-u));
		
		x = (x-u);
		y = (y-u);
	}
	
	public void baixo_direita(int u) {
		l.drawLine(x, y, (x+u), (y+u));
		
		x = (x+u);
		y = (y+u);
	}
	
	public void baixo_esquerda(int u) {
		l.drawLine(x, y, (x-u), (y+u));
		
		x = (x-u);
		y = (y+u);
	}
}
