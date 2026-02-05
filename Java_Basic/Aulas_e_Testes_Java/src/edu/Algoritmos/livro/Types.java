package edu.Algoritmos.livro;

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
	
		Forma forma = new Forma();
		Cor cor = new Cor();
		Veiculo veiculo = new Veiculo();
		
		//potenciaNegativa(); // utilização de vetores
		registerVariavel(); // utilização de Record/Registros
		
	}
	

	//Utilizalção de vetores
	public static void potenciaNegativa() {
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
	public static void registerVariavel() {
		REGISTER_Pessoa[] familia = registerFamilia();
		int contador = 0;
		
		for(int i = 0; i < familia.length; i++) {
			if ((familia[i].sex.sexo.equals("Feminino")) && (familia[i].estadoCivil.equals("Solteira"))) {
				contador++;
				System.out.println(familia[i].nome);
			}
		}
		System.out.print(contador);
		
	}
	
	
	//Maneira certa de utilizar registros em java
	public static REGISTER_Pessoa[] registerFamilia() {
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
	
	
	public record REGISTER_Pessoa2(String nome, Data2 nascimento, String estadoCivil, Sex2 sexo) { } // Estrutura de record(Registro)
	public record Data2 (int ano, int mes, int dia) { }// Estrutura de record(Registro)
	public record Sex2 (String sex) { }// Estrutura de record(Registro)
	
	// Utilizando o tipo Registro/Record
	public static REGISTER_Pessoa2[] registerFamilia2() {
		REGISTER_Pessoa2[] familia = new REGISTER_Pessoa2[5];
		
		familia[0] = new REGISTER_Pessoa2("Juliana", new Data2(2004, 6, 12), "Solteira", new Sex2("Feminino"));
		familia[1] = new REGISTER_Pessoa2("Serana", new Data2(2000, 9, 22), "Solteira", new Sex2("Feminino") );
		familia[2] = new REGISTER_Pessoa2("Gabriel", new Data2(1999, 12, 22), "Namorando", new Sex2("Masculino"));
		familia[3] = new REGISTER_Pessoa2("Dom", new Data2(1990, 5, 22), "Divorciado", new Sex2("Masculino") );
		familia[4] = new REGISTER_Pessoa2("Carol", new Data2(1990, 4, 11), "Casada", new Sex2("Feminino") );
		
		return familia;
	}
}
