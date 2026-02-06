package aulas_e_testes;

package Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {

	public static void main(String[] args) {
		String nome;
		String sobrenome;
		int idade;
		int anoNascimento;
		double altura;
		String funcao;
		String cep;
		
		Scanner scanner = new Scanner(System.in);
		boolean cadastro = false;
		while (cadastro == false) {
			try {
					
				System.out.println("Vamos te cadastrar no nosso banco de funcionairos.");
				
				System.out.print("Digite seu nome aqui: ");
				nome = scanner.next();
				
				System.out.print("Digite seu sobrenome aqui: ");
				sobrenome = scanner.next();
				
				System.out.print("Digite sua idade aqui: ");
				idade = scanner.nextInt();
				
				System.out.print("Digite seu ano de nascimento aqui: ");
				anoNascimento = scanner.nextInt();
				
				System.out.print("Digite seu cep: ");
				cep = scanner.next();
				CepFormatation.formatarCep(cep);				
				
				System.out.print("Digite sua altura aqui: ");
				altura = scanner.nextDouble();
				
				System.out.print("Digite qual função você está se cadastrando aqui: ");
				funcao = scanner.next();
				
				cadastro = true;
			} catch(InputMismatchException e){
				System.out.println("Os campos idade, altura e ano, precisam ser numerico idiota!");
				cadastro = false;
				continue;
			
			} catch(CepExceptionInvalid e) {
				System.out.println("Cep não encontrado, digite novamente: ");
				cadastro = false;
				continue;
			}
			
			System.out.println("Deu tudo certo, indo para o banco de dados! Até a próxima (: ");
			System.out.println(nome);
			System.out.println(sobrenome);
			System.out.println(idade);
			System.out.println(anoNascimento);
			System.out.println(altura);
			System.out.println(funcao);
		}
		
	}
	
}
