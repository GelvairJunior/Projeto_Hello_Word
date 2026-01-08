package aulas_e_testes;
import java.util.Scanner;

public class Casa {
	
	public static void main(String[] args) {
		
		final double PI = 3.14;
		final String PAIS = "Brasil";
		
		int idade = 20;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(PI);
		System.out.println(PAIS);
		System.out.println(teclado);
		
		System.out.println("Digite sua idade: ");
		idade = teclado.nextInt();
		
		while (idade > 1 ) {
			if (idade >= 18) {
				System.out.println("Você tem " + idade + " anos e é maior de idade" );
			}
			else {
				System.out.println("Você é menor de idade volte " +(18 - idade));
			}
		
			System.out.println("Digite quantos anos quer voltar: ");
			int back = teclado.nextInt();
			idade = idade - back;
		}
		
		System.out.println("Fim do código, então você tem "+ idade+" anos, agora");
	}
	
	public static String formatarAno(int ano, int mes, int dia) {
		return null;
	}
	
	public static String idade(int ano, int mes, int dia) {
		return null;
	}
}
