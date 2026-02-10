package Aulas.Orientacao_a_Objetos.Curso.Lanchonete.atendimento.cozinha;

import Aulas.Orientacao_a_Objetos.Curso.Lanchonete.atendimento.Atendente;

public class Cozinheiro {
	//pode ser :
	public void adicionarLancheNoBalcao() {
		System.out.println("Adicionando Lanche Natural Hamburguer no Balcao");
	}
	
	//pode ser :
	public void adicionarSucoNoBalcao() {
		System.out.println("Adicionando Suco no Balcao");
	}
	
	//pode ser :
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	
	public void prepararLanche() {
		System.out.println("Preparando Lanche Tipo Hamburguer");
	}
	
	public void prepararVitamina() {
		System.out.println("Preparando Suco");
	}
	
	public void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	public void selecionarIngredientesLanche() {
		System.out.println("Selecionado o Pão, Salada, Ovo e Carne");
	}
	
	public void selecionarIngredientesVitamina() {
		System.out.println("Selecionado Fruta, Leite e Suco");
	}
	
	public void lavarIngredientes() {
		System.out.println("Lavando Ingredientes");
	}
	
	public void baterVitaminaLiquitificador() {
		System.out.println("Batendo Vitamina Liquidificador");
	}
	
	public void fritarIngredientesLanche() {
		System.out.println("Fritando a Carte e Ovo para Hamburger");
	}
	
	public void pedirParaTrocarGas(Atendente meuAmigo) { //descobre o erro
		meuAmigo.trocarGas();
	}
	
	public void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	public void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
