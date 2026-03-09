package edu.Algoritmos.livro.types;

import java.util.HashSet;
import java.util.Set;

import edu.Algoritmos.livro.types.objetos.REGISTER_Pessoa;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Types {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = 5;
		char c = 'A';
		double r = 4.5;
		boolean b = true;
		String S = "Junior";
		
		int[] v = {3,5,7,9,10,12,14,15,16,18};
		int[][] m = { {0,2,4,6,8}, {1,3,5,7,9} };
		
		char[] vC = {'N', 'i', 'k', 'l', 'a', 'a', 'u', 's'};  // Estrutura de Vetor
		char[][] mC = {{'A','l','g','o','r','t','m','o','s'},{'E','s','t','r','u','t','u','r','a','s'}};  // Estrutura de Matriz
		
		
		String x = scan.next();
		char[] xc = x.toCharArray();
		
		types();
		
		potenciaNegativa(); // utilização de vetores
		registerVariavel(); // utilização de Record/Registros
		conjuntosVariavel(); // utilização de Conjuntos
		
		sequencial(); // utilização sequencia
		buffer();
		inout();
		
		buscaSequencial(v, 10);
		buscaBinaria(v, 10);
		buscaTabela(vC, x);
		buscaDiretaTabela(vC, x);
		knuth_Morris_Pratt(xc, vC);
		boyer_More(xc, vC);
	}

	//Utilizando os Tipos
	static void types() {
		enum Forma {Triangulo, Quadrado, Losangulo, Circulo, Retangulo};//Aqui trabalhando tipos 
		enum Cor {Amarelo, Verde, Azul, Vermelho, Preto, Branco, Lilas, Roxo, Rosa, Laranja};//Aqui trabalhando tipos 
		enum Veiculo {Carro, Moto, Caminhão, Motocicleta, Carroça};//Aqui trabalhando tipos 
		enum Dias {SEG, TER, QUA, QUI, SEX, SAB, DOM}; //Aqui trabalhando com tipos fixos
		System.out.println(Forma.Circulo);
	}

	//Utilizalção de vetores
	static void potenciaNegativa() {
		int i, k, r;
		int[] d = {1,2,3,4,5,6,7,8,9,10};
		
		for (k = 0; k < d.length; k++) {
			System.out.print(".");
			r = 0;
			for (i = 0; i < k; i++) {
				r = 10*r + d[i];
				d[i] = r/2;
				r = r%2;
				System.out.print(d[i] );
			}
			d[k] = 5;
			System.out.println("5");
		}
		
	}
	
	//Aqui estamos fazendo o uso do Record
	static void registerVariavel() {
		REGISTER_Pessoa2[] familia = registerFamilia2();
		int contador = 0;
		
		for(int i = 0; i < familia.length; i++) {
			if ((familia[i].sexo.sex.equals("Feminino")) && (familia[i].estadoCivil.equals("Solteira"))) {
				contador++;
				System.out.println(familia[i].nome);
				System.out.println(familia[i].nascimento.ano + "/" + familia[i].nascimento.mes + "/" + familia[i].nascimento.dia);
				System.out.println();
			}
		}
		System.out.print(contador);
		
	}
	
	//Aqui estamos fazendo o uso do tipo Conjunto
	static void conjuntosVariavel() {
		Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        A.add(1);
        A.add(2);
        A.add(3);
        B.add(3);
        B.add(4);
        B.add(5);

        // União
        Set<Integer> uniao = new HashSet<>(A);
        uniao.addAll(B);

        // Interseção
        Set<Integer> intersecao = new HashSet<>(A);
        intersecao.retainAll(B);

        // Diferença
        Set<Integer> diferenca = new HashSet<>(A);
        diferenca.removeAll(B);

        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("União: " + uniao);
        System.out.println("Interseção: " + intersecao);
        System.out.println("Diferença: " + diferenca);
	}
	
	//Aqui estamos utilizando o tipo Sequencial
	static void sequencial() {// s = list
		FileSystem sequencia = new FileSystem();
		sequencia.teste();
	}
	
	static void buffer() {
		Buffer_correct buffer = new Buffer_correct();
		buffer.teste();
	}
	
	static void inout() {
		
	}
	
	// Aqui é feito a busca sequencial
	static void buscaSequencial(int[] a, int x) {
		a[a.length-1] = x;
		int i = 0;
		while (a[i] != x) {
			System.out.println("Procura: " + i);
			i++;
		}
		System.out.println(i);
	}
	
	//Aqui é feito a busca binaria(mais rapido e eficiente, o peso é a o log(N), porem precisa estar ordenado o vetor
	static void buscaBinaria(int[] a, int x) {
		int L = 0;
		int R = a.length;
		int m = 0;
		int i = 0;
		while (L < R) {
			System.out.println("Procura: " + i++);
			m = (L + R)/2;
			if (a[m] < x) {
				L = m + 1;
			}else {
				R = m;
			}
			if(a[m] == x) {break;}
		}
		System.out.println(m);
	}
	
	//Aqui é feito a busca em tabela
	static void buscaTabela(char[] y, String x) {
		char[] xc = x.toCharArray();
		int i = 0;
		
		while ((xc[i] != '0')&&(xc[i] == y[i])) {
			i++;
		}
		
		String yc = y.toString();
		
		System.out.println(i);
		
        int resultado = x.compareTo(yc);

        if (resultado < 0)
            System.out.println(x + " < " + yc);
        else if (resultado > 0)
            System.out.println(x + " > " + yc);
        else
            System.out.println(x + " = " + yc);
    }

	//Aqui é feito a busca direto em tabela
	static void buscaDiretaTabela(char[] y, String x) {
		char[] xc = x.toCharArray();
		int i=0;
		
		while ((i != y.length)&&(i != xc.length)&&(xc[i] != y[i])) {
			i++;
		}
		if((i == xc.length)||(i == y.length)) {
			System.out.println("Deu não tem o caractere");
		}else{System.out.println(i);}
		
	}
	
	//Método de Knuth-Morris-Pratt para busca em cadeias
	static void knuth_Morris_Pratt(char[] s, char[] p){
		
        int N = s.length;   // tamanho do texto (o que se mexe)
        int M = p.length;   // tamanho do padrão (o que fica fixo)

        int[] d = new int[M];
        
        for(int i = 0; i < M; i++) {
        	d[i] = i;
        }

        int i = 0;
        int j = 0;
        int k = -1;

        // ---------- construção da tabela d ----------
        d[0] = -1;

        while (j < M - 1) {
        	
            while (k > 0 && p[j] != p[k]) {
                k = d[k];
            }
            
            j++;
            k++;
            
            if (p[j] == p[k]) {
                d[j] = d[k];
                System.out.println("oi");
            } else {
                d[j] = k;
            }
        }

        // ---------- busca ----------
        i = 0;
        j = 0;

        while (i < N && j < M) {
            
            while (j >= 0 && s[i] != p[j]) {
                j = d[j];
            }

            i++;
            j++;
        }

        if (j == M) {
            System.out.println("Encontrado na posição: " + (i - M));
        } else {
            System.out.println("Não encontrado");
        }
		
	}
	
	//Método de Boyer-More para busca em cadeias
	static void boyer_More(char[] s, char[] p) {


        int N = s.length;
        int M = p.length;

        int[] bad = buildBadCharTable(p);

        int shift = 0;

        while (shift <= N - M) {

            int j = M - 1;

            while (j >= 0 && p[j] == s[shift + j])
                j--;

            if (j < 0) {
                System.out.println("Encontrado na posição " + shift);
                shift += (shift + M < N) ? M - bad[s[shift + M]] : 1;
            } else {
                shift += Math.max(1, j - bad[s[shift + j]]);
            }
        }
    }
	
	
	//Tabela numérica de alphabetos, nao vai funcionar em alguns casos
	static int[] buildBadCharTable(char[] p) {
        int ALPHABET = 256;
        int[] table = new int[ALPHABET];

        for (int i = 0; i < ALPHABET; i++)
            table[i] = -1;

        for (int i = 0; i < p.length; i++)
            table[p[i]] = i;

        return table;
    }
	
	//Estrutura de record(Registro)
	record REGISTER_Pessoa2(String nome, Data2 nascimento, String estadoCivil, Sex2 sexo) { } // Estrutura de record(Registro)
	record Data2 (int ano, int mes, int dia) { }// Estrutura de record(Registro)
	record Sex2 (String sex) { }// Estrutura de record(Registro)

	// Obtendo dados do tipo Estruturado de dados do tipo Registro/Record 
	static REGISTER_Pessoa2[] registerFamilia2() {
		REGISTER_Pessoa2[] familia = new REGISTER_Pessoa2[5];
		
		familia[0] = new REGISTER_Pessoa2("Juliana", new Data2(2004, 6, 12), "Solteira", new Sex2("Feminino"));
		familia[1] = new REGISTER_Pessoa2("Serana", new Data2(2000, 9, 22), "Solteira", new Sex2("Feminino") );
		familia[2] = new REGISTER_Pessoa2("Gabriel", new Data2(1999, 12, 22), "Namorando", new Sex2("Masculino"));
		familia[3] = new REGISTER_Pessoa2("Dom", new Data2(1990, 5, 22), "Divorciado", new Sex2("Masculino") );
		familia[4] = new REGISTER_Pessoa2("Carol", new Data2(1990, 4, 11), "Casada", new Sex2("Feminino") );
		
		return familia;
	}
	
	//Maneira de utilizar OBJETOS não registros
	static REGISTER_Pessoa[] registerFamilia() {
		REGISTER_Pessoa[] familia = new REGISTER_Pessoa[5];
		
		familia[0] = new REGISTER_Pessoa();
		familia[0].nome = "Juliana";
		familia[0].nascimento.setAno(2004);
		familia[0].nascimento.setMes(6);
		familia[0].nascimento.setDay(12);
		familia[0].estadoCivil = "Solteira";
		familia[0].sex.setSexo('F');
		
		familia[1] = new REGISTER_Pessoa();
		familia[1].nome = "Serana";
		familia[1].nascimento.setAno(2000);
		familia[1].nascimento.setMes(9);
		familia[1].nascimento.setDay(22);
		familia[1].estadoCivil = "Solteira";
		familia[1].sex.setSexo('F');
		
		familia[2] = new REGISTER_Pessoa();
		familia[2].nome = "Gabriel";
		familia[2].nascimento.setAno(1999);
		familia[2].nascimento.setMes(12);
		familia[2].nascimento.dia = (22);
		familia[2].estadoCivil = "Namorando";
		familia[2].sex.setSexo('M');
		
		familia[3] = new REGISTER_Pessoa();
		familia[3].nome = "Dom";
		familia[3].nascimento.setAno(1990);		
		familia[3].nascimento.setMes(5);
		familia[3].nascimento.setDay(22);
		familia[3].estadoCivil = "Divorciado";
		familia[3].sex.setSexo('M');
		
		familia[4] = new REGISTER_Pessoa();
		familia[4].nome = "Carol";
		familia[4].nascimento.setAno(1990);
		familia[4].nascimento.setMes(4);
		familia[4].nascimento.setDay(11);
		familia[4].sex.setSexo('F');
		familia[4].estadoCivil = "Casada";
		
		return familia;
	}
	
}