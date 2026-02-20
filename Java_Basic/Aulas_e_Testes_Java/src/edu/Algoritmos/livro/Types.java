package edu.Algoritmos.livro;

import java.util.HashSet;
import java.util.Set;

import edu.Algoritmos.livro.objetos.REGISTER_Pessoa;

import java.util.ArrayList;
import java.util.Random;

public class Types {
	public static void main(String[] args) {
		int i = 5;
		char c = 'A';
		double r = 4.5;
		boolean b = true;
		String S = "Junior";
		
		int[] v = {3,5,7,9};
		int[][] m = { {0,2,4,6,8}, {1,3,5,7,9} };
		
		char[] vC = {'N', 'i', 'k', 'l', 'a', 'u', 's'};  // Estrutura de Vetor
		char[][] mC = {{'A','l','g','o','r','t','m','o','s'},{'E','s','t','r','u','t','u','r','a','s'}};  // Estrutura de Matriz
		
		
		//types();
		//potenciaNegativa(); // utilização de vetores
		//registerVariavel(); // utilização de Record/Registros
		//conjuntosVariavel(); // utilização de Conjuntos
		//sequencial(); // utilização sequencia
		//buffer();
		inout();
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
		sequencia.main(null);
	}
	
	static void buffer() {
		Buffer_correct buffer = new Buffer_correct();
		buffer.main(null);
	}
	
	static void inout() {
		
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