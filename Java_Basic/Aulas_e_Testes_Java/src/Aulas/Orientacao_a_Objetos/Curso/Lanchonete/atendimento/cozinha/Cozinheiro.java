package Aulas.Orientacao_a_Objetos.Curso.Lanchonete.atendimento.cozinha;

public class Cozinheiro {
	//pode ser :
	private void adicionarLancheNoBalcao() {
		System.out.println("Adicionando Lanche Natural Hamburguer no Balcao");
	}
	
	//pode ser :
	private void adicionarSucoNoBalcao() {
		System.out.println("Adicionando Suco no Balcao");
	}
	

	public void prepararLanche() {
		System.out.println("Preparando Lanche Tipo Hamburguer");
		adicionarLancheNoBalcao();
	}
	
	public void prepararVitamina() {
		System.out.println("Preparando Suco");
		adicionarSucoNoBalcao();
	}
	
	public void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	void selecionarIngredientesLanche() {
		System.out.println("Selecionado o Pão, Salada, Ovo e Carne");
	}
	
	void selecionarIngredientesVitamina() {
		System.out.println("Selecionado Fruta, Leite e Suco");
	}
	
	void lavarIngredientes() {
		System.out.println("Lavando Ingredientes");
	}
	
	void baterVitaminaLiquitificador() {
		System.out.println("Batendo Vitamina Liquidificador");
	}
	
	void fritarIngredientesLanche() {
		System.out.println("Fritando a Carte e Ovo para Hamburger");
	}
	
	void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
