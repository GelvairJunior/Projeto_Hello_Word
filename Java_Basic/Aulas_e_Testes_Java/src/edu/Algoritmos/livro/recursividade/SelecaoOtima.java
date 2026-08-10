package edu.Algoritmos.livro.recursividade;

import java.util.ArrayList;

public class SelecaoOtima {
	static int limw;
	static int totv;
	static int maxv;
	static ArrayList<Mala> s, opts;
	static Mala[] obj;
	static int n;
	
	record Mala (int value, int weight) {}
	
	public static void test(int n1) {
		n = n1;
		obj = new Mala[n+1]; 
		
		obj[1] = new Mala(18, 10); obj[2] = new Mala(20, 11); obj[3] = new Mala(17, 12); 
		obj[4] = new Mala(19, 13); obj[5] = new Mala(25, 14); obj[6] = new Mala(21, 15); 
		obj[7] = new Mala(27, 16); obj[8] = new Mala(23, 17); obj[9] = new Mala(25, 18); obj[10] = new Mala(24, 19);
		
		int weightLimit=120;
		int weightInc=10;
		
		System.out.print("peso:   ");
		for(int i = 1; i <= n; i++) {System.out.print(obj[i].weight+ " | ");}
		
		System.out.println("");
		System.out.print("valor:  ");
		for(int i = 1; i <= n; i++) {System.out.print(obj[i].value+" | ");}
		System.out.println("");
		System.out.println("___________________________________________________________");
		
		iniciar(weightInc, weightLimit);
	}
	
	private static void iniciar(int weightInc, int weightLimit){
		totv = 0; limw = 0;
		s = new ArrayList<Mala>(); opts = new ArrayList<Mala>();
		for(int i = 1; i <= n; i++) {totv = totv + obj[i].value;}
		
		do {
			limw = limw + weightInc; maxv = 0;
		
			tente(1, 0, totv);
			
			System.out.print(limw+ "    |");
			
			for(int i = 1; i <= n; i++) {System.out.print(tick(opts.contains(obj[i])));}
			
			System.out.print(maxv);
			System.out.println("");
		
		}while(limw < weightLimit);
	}
	
	private static void tente(int i, int tw, int av) {
		
		if(tw + obj[i].weight <= limw) {
			//inclusão
			s.add(obj[i]);
			if(i < n) {tente(i+1, tw+obj[i].weight, av);}
			else if(av > maxv){maxv = av; opts.clear(); opts.addAll(s);}
			s.remove(obj[i]);
		}
		
		//excluão
		if(av > maxv+obj[i].value) {
			if(i < n) {tente(i+1,tw, av - obj[i].value);}
			else{maxv = av-obj[i].value; opts.clear(); opts.addAll(s);}
		}
	}
	
	private static String tick(boolean s) {
		if(!s) {
			return "    |";
		}
		return " ** |";
	}
}
