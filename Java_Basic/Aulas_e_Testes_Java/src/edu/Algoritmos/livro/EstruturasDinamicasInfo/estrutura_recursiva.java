package edu.Algoritmos.livro.EstruturasDinamicasInfo;

import java.util.Scanner;

public class estrutura_recursiva {
	String name;
	estrutura_recursiva pai;
	estrutura_recursiva mae;
	boolean havePai, haveMae;

	public estrutura_recursiva(String name, boolean haveMae, boolean havePai) {
		Scanner scanner = new Scanner(System.in);
		this.name = name;
		boolean s, m;
		String p;
		this.havePai = havePai; this.haveMae = haveMae;
		if(havePai) {
			System.out.println("nome do pai: ");
			p = scanner.next();
			System.out.println("tem Pai?(s/n) ");
			s = scanner.next().equals("s");
			System.out.println("tem Mae?(s/n) ");
			m = scanner.next().equals("s");
			pai = new estrutura_recursiva(p, s, m);
		}
		if(haveMae) {
			System.out.println("nome da mae: ");
			p = scanner.next();
			System.out.println("tem Pai?(s/n) ");
			s = scanner.next().equals("s");
			System.out.println("tem Mae?(s/n) ");
			m = scanner.next().equals("s");
			mae = new estrutura_recursiva(p, s, m);
		}
		
	}

	public void mostrar_parentes() {
		String str = "nome: ";
		str = str+name+ " -> ";
		estrutura_recursiva parent_atu = mae;
		if(haveMae) {
			str = str+("mae: ");
			parent_atu.mostrar_parentes();
			str = str+(parent_atu.name+" -> ");
			if(parent_atu.haveMae || parent_atu.havePai) {
				parent_atu = parent_atu.mae;
			}
		}
		
		parent_atu = pai;
		if(havePai) {
			str = str+("pai: ");
			parent_atu.mostrar_parentes();
			str = str+(parent_atu.name+" -> ");
			if(parent_atu.haveMae || parent_atu.havePai) {
				parent_atu = parent_atu.pai;
			}else {str = str+"";}
		}
		
		System.out.println(str);
	}

}
