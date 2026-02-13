package Aulas.Orientacao_a_Objetos.Curso.Lanchonete.atendimento;

import Aulas.Orientacao_a_Objetos.Curso.Lanchonete.atendimento.cozinha.Cozinheiro;

public class Atendente {
	Cozinheiro cozinheiro = new Cozinheiro();
	
	public void pegandoPedido(String pedido) {
		if (pedido == "Combo") {
			cozinheiro.prepararCombo();
		}else if(pedido == "Lanche"){
			cozinheiro.prepararLanche();
		}else { cozinheiro.prepararVitamina(); }
	}
	
	public void servindoMesa() {
		
		cozinheiro.prepararCombo();
		// ...?
		System.out.println("Servindo Mesa");
	}
	
	public void pegarLancheCozinha() {
		System.out.println("Pegando o Lanche Na Cozinha");
	}
	
	public void receberPagamento() {
		System.out.println("Recebendo Pagamento");
	}

	public void pegarPedidoBalcao() {
		System.out.println("Pegando o pedido no Balcao");
	}
}
