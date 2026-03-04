package edu.desafios;

public class PhoneNumber {
	public static void main(String[] args) {
		int[] x = {1,2,3,4,5,6,7,8,9,0};
		String p = "(";
		if(x.length == 10) {
			for(int i = 0; i < x.length; i++) {
				p = (p + ""+ x[i]);
				if(i == 2) {
					p = (p +") ");
				}
				if(i == 5) {
					p = (p + "-");
				}
				
			}
		}else {
			System.out.println("Erro");
		}
		
		String c = p;
		System.out.print(c);
	}
}
