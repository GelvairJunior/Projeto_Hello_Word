package edu.desafios;

public class MineFinder {
	public static void main(String[] args) {

		int[][] field = { {0, 0, 0}, {0, 1, 0} };
		
		int[] ret = new int[2];
		ret[1] = 99;
		ret[0] = 99;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < field.length; j++) {
				//System.out.println(field[i][j]);
				if (field[i][j] == 1) {
					ret[0] = i;
					ret[1] = j;
				}
			}
		}
		
		System.out.println(ret[0] + "" + ret[1]);
		
	}
}