package Aulas.Orientacao_a_Objetos.Curso.Lanchonete;

import Aulas.Orientacao_a_Objetos.Curso.Lanchonete.area.cliente.Cliente;
import Aulas.Orientacao_a_Objetos.Curso.Lanchonete.atendimento.Atendente;
import Aulas.Orientacao_a_Objetos.Curso.Lanchonete.atendimento.cozinha.Almoxarife;
import Aulas.Orientacao_a_Objetos.Curso.Lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		Almoxarife almoxarife = new Almoxarife();
		
		Cliente cliente = new Cliente();
		Atendente atendente = new Atendente();
				
		
		atendente.pegandoPedido(cliente.fazerPedido());
		cliente.pagarConta();
		
		atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
		
		//não deveria, mas o estabelecimento
		//ainda não definiu normas de atendimento
		cliente.pegarPedidoBalcao();
		
	}
}
