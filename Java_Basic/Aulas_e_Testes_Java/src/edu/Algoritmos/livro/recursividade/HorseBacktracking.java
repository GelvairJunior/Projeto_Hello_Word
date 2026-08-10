package edu.Algoritmos.livro.recursividade;

public class HorseBacktracking {
	private int n;
	private int[][] h;
	private int y, x, i, nsqr, j;
	private int[] dx, dy;
	private boolean q;
	// (y,x) ocupados se (1 <= i <= n*2)
	
	public HorseBacktracking(int x) {// x = 5
		this.n = x;
		this.h = new int[9][9];
		this.dx = new int[9];
		this.dy = new int[9];
		this.nsqr = n*n;
		this.q = false;
		
		for(int l = 1; l < n; l++) {
			for(int f = 1; f < n; f++) {
				h[l][f] = 0;
			}
		}
		
		
	}
	
	public boolean tente(int i, int x, int y) {
		int u, v, k;
		boolean q1;//iniciar seleção de movimentos
		
		k = 0;
		
		do {//iniciar o proximo movimento dos proximos candidatos
			//seja <u,v> um cordenador do proximo movimento conforme as regras do xadrez
			q1 = false; k++;
			u = x + dx[k]; v = y + dy[k];
			
			if((1 <= u) && (u <= n) && (1 <= v) && (v <= n) && (h[u][v] == 0)) {// aceitavel
				
				h[u][v] = i; //registrando movimento
		
				if(i < nsqr) {// tabuleiro nao prenchido
					
					q1 = tente(i+1, u, v); // tente de novo
					if(!q1) {// insucesso
						h[u][v] = 0;// eliminando
					}
				}else {return true;}
			}
			
			
		}while(k < 8 && !q1);
		
		return q1;
		
	}
	
	public void existe(int p, int x) {
		dx[1] = 2; dx[2] = 1; dx[3] = -1; dx[4] = -2;
		dx[5] = -2; dx[6] = -1; dx[7] = 1; dx[8] = 2;
		
		dy[1] = 1; dy[2] = 2; dy[3] = 2; dy[4] = 1;
		dy[5] = -1; dy[6] = -2; dy[7] = -2; dy[8] = -1;
		
		this.i = p; this.j = x;
		
		h[i][j] = 1;
		tabela();
		q = tente(2, i, j);
		
		if(q) {
			System.out.println("sucesso");
			tabela();
		}else {
			System.out.println("não encontrado");
			tabela();
		}
		
	}
	
	public void tabela() {
		System.out.print("     |");

		for(int v = 1; v <= n; v++) {
			System.out.print("h["+v+"]        |");
		}
		
		for(int v = 1; v <= n; v++) {
			System.out.println(" ");
			System.out.print(v+":   |");
			for(int x = 1; x <= n; x++) {
				System.out.print("h:"+v +":"+ x+ " = " + h[v][x]+ "   |");
			}
		}
		System.out.println(" ");
	}
	
}
