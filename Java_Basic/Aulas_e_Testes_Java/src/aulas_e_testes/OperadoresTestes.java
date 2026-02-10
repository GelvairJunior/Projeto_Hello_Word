package aulas_e_testes;

public class OperadoresTestes {
	public static void main(String[] args) {
		int numeroAcremento = 5;
		int a = 6; 
		int b = 50;
		
		
		System.out.println(numeroAcremento);//aqui tem que aparecer 5 porque ta chamando a var
		numeroAcremento++;
		System.out.println(numeroAcremento);//aqui tem que aparecer 6, porque ta chamando a var depois de utilizar o acremento
		
		System.out.println(numeroAcremento++);//aqui tem que aparecer 6 porque ta chamando a var e depois esta utilizando o acremento
		
		System.out.println(numeroAcremento);//aqui tem que aparecer 7 porque ta chamando a var depois de acrementar
		
		System.out.println(++numeroAcremento);//aqui tem que aparecer 8 porque esta acrementando na variavel antes de peida-la
		
		System.out.println(numeroAcremento);//aqui tem que aparecer 8 porque ta pedindo so a variavel
		
		System.out.println("o loco de tudo é que tao atribuido novos valores em uma operaçao onde apenas devia sair valores, então significa que da para utilizar metodos dentro da saida dos valores");
	
		String resultado = a==b ?"verdadeiro": "falso";//operador ternario
		
		int idade = a!=b ? numeroAcremento: b;//operador ternario
		
		System.out.println(resultado);
		System.out.println(idade);
		
		String fala1 = "OI";
		String fala2 = "OI";
		
		if (fala1 == fala2) {
			System.out.println("quer dizer que a condição foi atendida enta as duas falas são iguais, as falas são: " + fala1);	
		}
		else {
			System.out.println("as duas falas são diferentes :(, a fala 1 é "+ fala1 + " e a fala 2 é "+ fala2);
		}
		
		String nome1 = "Junior";
		String nome2 = new String("Junior");
		
		if (nome1 == nome2) {
			System.out.println("os dois nomes são identicos e são do mesmo objeto");
		}
		else {
			System.out.println("aqui pode ser que os nomes sejam diferentes ou que seja um novo objeto do tipo String já que pelo motivo que String nao são tipo primitivo e sim um objeto em java");	
		}
		
		
		if (nome1.equals(nome2)) {
			System.out.println("Agora se voce esta vendo isso é porque os dois nomes são iguais, mesmo sendo de objetos diferentes");
		}
		else {
			System.out.println("O problema nunca foi se era um objeto igual ou não");
		}
		
		System.out.println("Todo esses testes com nomes é por causa do garbage collecor, mas lembre se o objeto for new ou a variavel seja de objetos diferentes e nao for um tipo primitivo, use o equals");
	
	
		while (nome1.equals(nome2) && fala1 == fala2) {
			System.out.println("Então significa que é tudo igual os nomes e falas");
			fala1 = "tchau";

		}
		
		while (a < b || numeroAcremento < b) {
			b = b - numeroAcremento - a; 
			System.out.println(b);
		}
	
	}
}
