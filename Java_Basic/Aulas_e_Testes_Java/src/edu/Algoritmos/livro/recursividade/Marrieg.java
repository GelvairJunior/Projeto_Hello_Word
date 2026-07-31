package edu.Algoritmos.livro.recursividade;

public class Marrieg {
	int n;
	int tet = 0;
	
	int[] man;
	int[] wom;
	int[] rank;
	
	int[][] wmr;
	int[][] mwr;
	int[][] rmw;
	int[][] rwm;
	
	boolean[] single;
	
	int[] x;
	int[] y;
	
	public Marrieg(int n) {
		this.n = n;
		this.man = new int[n];
		this.wom = new int[n];
		this.rank = new int[n];
		
		this.wmr = new int[man.length][rank.length];
		this.mwr = new int[wom.length][rank.length];
		this.rmw = new int[rank.length][man.length];
		this.rwm = new int[rank.length][wom.length];
		
		this.x = new int[man.length];
		this.y = new int[wom.length];
		
		single = new boolean[wom.length];
		
	}
	
	private void tente(int m) {
		int r; int w;
		for(r = 1; r < n; r++) {
			w = wmr[m][r];
			if (single[w] & stable(m, w, r)) {
				x[m] = w; y[w] = m; single[w] = false;
				if(m < n-1) {
					tente(m+1);
				}else {tet++; print(tet);}
				single[w] = true;
			}
		}
		
	}
	
	private boolean stable(int m, int w, int r) {
		int pm, pw;
		int i, lim;
		boolean s;
		
		s = true; i = 1;
		while((i < r) && s) {
			pw = wmr[m][i]; i++;
			if(!single[pw]) {
				s = rwm[pw][m] > rwm[pw][y[pw]]; 
			}
		}
		
		i = 1; lim  = rwm[w][m];
		while((i < lim) && s) {
			pm = mwr[w][i]; i++;
			if(pm < m) {
				s = rmw[pm][w] > rmw[pm][x[pm]];
			}
		}
		
		return s;
	}
	
	
	private void print(int i) {
		int rm = 0; int rw = 0;
		String text = "";
		text = text+(i+"         | ");
		for(int m = 1; m < n; m++) {
			text = text+("("+ m + ", "+ x[m] + ") | ");
			rm = rmw[m][x[m]] + rm; rw = rwm[x[m]][m] + rw;
		}
		text = text + (rm+" | ");
		text = text + (rw);
		System.out.println(text);
	}
	
	public void teste() {
		int[][] prefW = new int[n][n];
		int[][] prefM = new int[n][n];
		
		prefM[1][1] = 4; prefM[1][2] = 6; prefM[1][3] = 2; prefM[1][4] = 5; prefM[1][5] = 8; prefM[1][6] = 1; prefM[1][7] = 3; prefM[1][8] = 7;
		prefM[2][1] = 8; prefM[2][2] = 5; prefM[2][3] = 3; prefM[2][4] = 1; prefM[2][5] = 6; prefM[2][6] = 7; prefM[2][7] = 4; prefM[2][8] = 2;
		prefM[3][1] = 6; prefM[3][2] = 8; prefM[3][3] = 1; prefM[3][4] = 2; prefM[3][5] = 3; prefM[3][6] = 4; prefM[3][7] = 7; prefM[3][8] = 5;
		prefM[4][1] = 3; prefM[4][2] = 2; prefM[4][3] = 4; prefM[4][4] = 7; prefM[4][5] = 6; prefM[4][6] = 8; prefM[4][7] = 5; prefM[4][8] = 1;
		prefM[5][1] = 6; prefM[5][2] = 3; prefM[5][3] = 1; prefM[5][4] = 4; prefM[5][5] = 5; prefM[5][6] = 7; prefM[5][7] = 2; prefM[5][8] = 8;
		prefM[6][1] = 2; prefM[6][2] = 1; prefM[6][3] = 3; prefM[6][4] = 8; prefM[6][5] = 7; prefM[6][6] = 4; prefM[6][7] = 6; prefM[6][8] = 5;
		prefM[7][1] = 3; prefM[7][2] = 5; prefM[7][3] = 7; prefM[7][4] = 2; prefM[7][5] = 4; prefM[7][6] = 1; prefM[7][7] = 8; prefM[7][8] = 6;
		prefM[8][1] = 7; prefM[8][2] = 2; prefM[8][3] = 8; prefM[8][4] = 4; prefM[8][5] = 5; prefM[8][6] = 6; prefM[8][7] = 3; prefM[8][8] = 1;
		
		prefW[1][1] = 7; prefW[1][2] = 2; prefW[1][3] = 6; prefW[1][4] = 5; prefW[1][5] = 1; prefW[1][6] = 3; prefW[1][7] = 8; prefW[1][8] = 4;
		prefW[2][1] = 4; prefW[2][2] = 3; prefW[2][3] = 2; prefW[2][4] = 6; prefW[2][5] = 8; prefW[2][6] = 1; prefW[2][7] = 7; prefW[2][8] = 5;
		prefW[3][1] = 3; prefW[3][2] = 2; prefW[3][3] = 4; prefW[3][4] = 1; prefW[3][5] = 8; prefW[3][6] = 5; prefW[3][7] = 7; prefW[3][8] = 6;
		prefW[4][1] = 3; prefW[4][2] = 8; prefW[4][3] = 4; prefW[4][4] = 2; prefW[4][5] = 5; prefW[4][6] = 8; prefW[4][7] = 7; prefW[4][8] = 1;
		prefW[5][1] = 8; prefW[5][2] = 3; prefW[5][3] = 4; prefW[5][4] = 5; prefW[5][5] = 6; prefW[5][6] = 1; prefW[5][7] = 7; prefW[5][8] = 2;
		prefW[6][1] = 8; prefW[6][2] = 7; prefW[6][3] = 5; prefW[6][4] = 2; prefW[6][5] = 4; prefW[6][6] = 3; prefW[6][7] = 1; prefW[6][8] = 6;
		prefW[7][1] = 2; prefW[7][2] = 4; prefW[7][3] = 6; prefW[7][4] = 3; prefW[7][5] = 1; prefW[7][6] = 7; prefW[7][7] = 5; prefW[7][8] = 8;
		prefW[8][1] = 6; prefW[8][2] = 1; prefW[8][3] = 4; prefW[8][4] = 2; prefW[8][5] = 7; prefW[8][6] = 5; prefW[8][7] = 3; prefW[8][8] = 8;

		
		definir(prefM, prefW);
		String casal  = " casais |";
		System.out.println("tentativa |" + casal.repeat(n-1) + " rm | rw");
		tente(1);
	}
	
	private void definir(int[][] prefW, int[][] prefM) {
		for (int m = 1; m < n; m++) {
			for(int r = 1; r < n; r++) {
				wmr[m][r] = prefW[m][r]; 
				rmw[m][wmr[m][r]] = r;
			}
		}
		
		for(int w = 1; w < n; w++) {
			single[w] = true;
			for(int r = 1; r < n; r++) {
				mwr[w][r] = prefM[w][r]; rwm[w][mwr[w][r]] = r;
			}
		}
		
	}
	
}
