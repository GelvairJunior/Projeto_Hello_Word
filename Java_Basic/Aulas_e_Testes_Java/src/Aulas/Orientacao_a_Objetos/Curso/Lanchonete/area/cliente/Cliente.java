package Aulas.Orientacao_a_Objetos.Curso.Lanchonete.area.cliente;

import java.util.Scanner;

public class Cliente {
	private String escolherLanche() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolhendo o Lanche");
		System.out.println("Opções: ");
		System.out.println("[1] Lanche");
		System.out.println("[2] Suco");
		System.out.println("[3] Combo");
		int opcao = scanner.nextInt();
		String escolha = null;
		if (opcao == 1) { escolha = "Lanche";}
		if (opcao == 2) { escolha = "Vitamina"; }
		if (opcao == 3) { escolha = "Combo"; }
		return escolha;
	}
	
	public String fazerPedido() {
		consultarSaldoAplicativo();
		String escolha = escolherLanche();
		
		System.out.println("Fazendo o Pedido: " + escolha);
		return escolha;
	}
	
	public void pagarConta() {
		System.out.println("Pagando a Conta");
	}
	
	private void consultarSaldoAplicativo() {
		System.out.println("Consultando Saldo No Aplicativo");
	}
	
	public void pegarPedidoBalcao() {
		System.out.println("Pegando o Pedido No Balcao");
	}
}
