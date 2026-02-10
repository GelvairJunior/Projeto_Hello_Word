package Aulas.Orientacao_a_Objetos.Curso.Lanchonete;

import Aulas.Orientacao_a_Objetos.Curso.Lanchonete.area.cliente.Cliente;
import Aulas.Orientacao_a_Objetos.Curso.Lanchonete.atendimento.Atendente;
import Aulas.Orientacao_a_Objetos.Curso.Lanchonete.atendimento.cozinha.Almoxarife;
import Aulas.Orientacao_a_Objetos.Curso.Lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que não precisam estarem disponíveis para toda a aplicação
		cozinheiro.lavarIngredientes();
		cozinheiro.baterVitaminaLiquitificador();
		cozinheiro.selecionarIngredientesLanche();
		cozinheiro.selecionarIngredientesVitamina();
		cozinheiro.prepararLanche();
		cozinheiro.prepararVitamina();
		cozinheiro.prepararVitamina();
		
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Almoxarife almoxarife = new Almoxarife();
		//ações que não precisam estarem disponíveis para toda a aplicação
		almoxarife.controlarEntrada();
		almoxarife.controlarSaida();
		
		//ação que somente o seu pacote cozinha precisa conhecer ()
		almoxarife.entregarIngredientes();
		almoxarife.trocarGas();
		
		Atendente atendente = new Atendente();
		atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
		
		//ação que somente o seu pacote cozinha precisa conhecer ()
		atendente.trocarGas();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//não deveria, mas o estabelecimento
		//ainda não definiu normas de atendimento
		cliente.pegarPedidoBalcao();
		
		//esta ação é muito sigilosa, que tal ser ()?
		cliente.pegarPedidoBalcao();
		
		//já pensou os clientes oubindo que o gás acabou ?
		cozinheiro.pedirParaTrocarGas(atendente);
		cozinheiro.pedirParaTrocarGas(almoxarife);
	}
}
