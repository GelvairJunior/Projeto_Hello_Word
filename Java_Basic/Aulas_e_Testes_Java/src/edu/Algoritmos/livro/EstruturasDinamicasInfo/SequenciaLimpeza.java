package edu.Algoritmos.livro.EstruturasDinamicasInfo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SequenciaLimpeza {
	
	public static Sequencia<String> gerador_texto() {
		Sequencia<String> s = gerar_seq();
		s = sequeciaLimpeza(s);
		return s;
	}
	
	public static Sequencia<String> sequeciaLimpeza(Sequencia<String> s) {
		Sequencia<String> f = new Sequencia<String>(); f.OpenSeq(); f.startWrite();
		s.startRead();
		while(!s.eof) {
			String m = s.read();
			String g = limpeza(m);
			if(g != "" && g != null) {
				f.f.writeWord(g);
			}else {}
		}
		f.startRead();
		return f;
	}
	
	public static String limpeza(String s) {
		if(s == null || s=="") {return "";}
		s = s.toLowerCase();
		s = tratamento_acentuacao(s);
		s = tratamento_pontuação(s);
		s = tratamento_number(s);
		
		return s;
	}
	
	static String pontuacao = "!@#$%¨&*()_+-–=[{]}´`-^?~;:/.,><|\\\'\"";
	static String acentuacao =   "ãõéíóúáçàèìòùâêîôû";
	static String substituicao = "aoeiouacaeiouaeiou";
	static String number = "0123456789";
	
	public static String tratamento_pontuação(String s) {
		String d = "";char[] p = pontuacao.toCharArray(); char[] f;
		for(int i = 0; i < pontuacao.length(); i++) {s = s.replace(p[i], ' ');}
		f = s.toCharArray();
		for(int i = 0; i < s.length(); i++) {if(f[i] == ' ') {}else {d = d+f[i];}}
		return d;
	}
	
	public static String tratamento_acentuacao(String s) {
		char[] p = acentuacao.toCharArray(); char[] t = substituicao.toCharArray();
		for(int i = 0; i < acentuacao.length(); i++) {s = s.replace(p[i], t[i]);}
		return s;
	}
	
	public static String tratamento_number(String s) {
		String g = ""; char[] p = number.toCharArray();
		for(int i = 0; i < number.length(); i++) {s = s.replace(p[i], ' ');}
		char[] f = s.toCharArray();
		for(int i = 0; i < s.length(); i++) {if(f[i] == ' ') {}else {g = g+f[i];}}
		
		return g;
	}
	
	public static Sequencia<String> gerar_seq()  {
		String caminhoArquivo = "C:/Users/gabri/OneDrive/Área de Trabalho/oreilly_getting_started_with_sql-master/Dev/Git/Projeto_Hello_Word/Java_Basic/Aulas_e_Testes_Java/src/edu/Algoritmos/livro/EstruturasDinamicasInfo/texto.txt";
		BufferedReader leitor = null;
		FileReader leitorArquivo;
		Sequencia<String> f = new Sequencia<String>(); f.OpenSeq(); f.startWrite();
		try {
			leitorArquivo = new FileReader(caminhoArquivo);
			leitor = new BufferedReader(leitorArquivo);
			String line;
			try {
				line = leitor.readLine();
				String[] s = line.split(" ");
				for(int i = 0; i < s.length; i++) {f.f.writeWord(s[i]);}
			} catch (IOException e) {e.printStackTrace();}
		} catch (FileNotFoundException e) {e.printStackTrace();}
		f.startRead();
		return f;
	}
}
