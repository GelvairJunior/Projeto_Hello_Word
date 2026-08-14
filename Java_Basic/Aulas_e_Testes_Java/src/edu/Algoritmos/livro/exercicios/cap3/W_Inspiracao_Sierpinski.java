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
		linhas = new Linhas(g, 1000, 0);
		this.setBackground(Color.white);
		
		g.setColor(Color.black);
		
		W(i);
	}
	
	public void W(int i) {
		
	}
}
