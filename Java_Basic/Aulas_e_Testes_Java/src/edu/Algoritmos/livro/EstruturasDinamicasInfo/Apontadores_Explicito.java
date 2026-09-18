package edu.Algoritmos.livro.EstruturasDinamicasInfo;

import java.util.Scanner;

public class Apontadores_Explicito {
	String name;
	Apontadores<Apontadores_Explicito> pai;
	Apontadores<Apontadores_Explicito> mae;

	public Apontadores_Explicito(String name) {
		Scanner scanner = new Scanner(System.in);
		this.name = name;
		pai = new Apontadores();
		mae = new Apontadores();
	}
	
	public void add(String name, boolean isFather) {
		Apontadores<Apontadores_Explicito> parent;
		if(isFather) {parent = pai;}else {parent = mae;}
		if(parent.p != null) {
			parent.p.add(name, isFather);
		}else {parent.proximo(new Apontadores_Explicito(name));}
	}
	
	public void add() {
		Scanner scanner = new Scanner(System.in);
		boolean d = true;
		while(d) {
			System.out.println("nome: ");
			String p = scanner.next();
			System.out.println("Mae ou pai?(p/m)");
			boolean s = scanner.next().equals("p");
			add(p, s);
			System.out.println("Ainda tem mais parente?(s/n)");
			d = scanner.next().equals("s");
		}
		
	}
	
	public void mostrar_parentes() {
		String str = "nome: ";
		str = str+name+ " -> ";
		Apontadores_Explicito parent_atu = mae.p;
		if(mae.p != null) {
			str = str+("mae: ");
			parent_atu.mostrar_parentes();
			str = str+(parent_atu.name+" -> ");
			if(parent_atu.mae.p != null) {
				parent_atu = parent_atu.mae.p;
			}
		}
		
		parent_atu = pai.p;
		if(pai.p != null) {
			str = str+("pai: ");
			parent_atu.mostrar_parentes();
			str = str+(parent_atu.name+" -> ");
			if(parent_atu.pai.p != null) {
				parent_atu = parent_atu.pai.p;
			}else {str = str+"";}
		}
		
		System.out.println(str);
	}
	

	@Override
	public String toString() {
		return "estrutura_recursiva [name=" + name + "]";
	}
	
	
}
