package edu.desafios;
import java.util.ArrayList;
import java.util.Collections;
//Você receberá uma string e dois índices (a e b). Sua tarefa é inverter a parte dessa string que está entre esses dois índices, inclusive.
public class SimpleReversall {
	public static void main(String[] args) {
		String s = "codewars";
		int a = 1;
		int b = 5;
		String resultado = "";
		
		char[] listS = s.toCharArray();
		char[] listB = new char[s.length()];
		
		
		int cont = 0;
		for(int i = s.length() - 1; i >= 0; i--) {
			if (i >= a && i <= b) {
				listB[cont] = listS[i]; 
				cont++;
			}
		}
		
		cont = 0;
		for(int i = 0; i < s.length(); i++) {
			if (i >= a && i <= b) {
				listS[i] = listB[cont];
				cont++;
			}
		}
		
		for(int i = 0; i < s.length();i++) {
			resultado = (resultado + "" + listS[i]);
		}
		
		//String resultado = listaInvertida(listS, a, b);
		System.out.print(resultado);
	}
	
	
	
	
	
	public static String listaInvertida(char[] listS, int a, int b) {
		ArrayList list = new ArrayList();
		String s = "codewars";
		
		for(int i = 0; i < s.length();i++) {
			list.add(listS[i]);
		}
		
		Collections.reverse(list.subList(a, b+1));
		String resultado = "";

		
		
		for(int i = 0; i < s.length();i++) {
			resultado = (resultado + "" + list.get(i));
		}
		
		return resultado;
	}
}
