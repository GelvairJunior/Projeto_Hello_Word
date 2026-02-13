package Aulas.Orientacao_a_Objetos.Curso.Lanchonete.atendimento.cozinha;

public class Almoxarife {
	void controlarEntrada() {
		System.out.println("Controlando a Entrada dos Itens");
	}
	
	private void controlarSaida() {
		System.out.println("Controlando a Saida dos Itens");
	}
	
	void entregarIngredientes() {
		System.out.println("Entregando Ingredientes");
		controlarSaida();
	}
	
	void trocarGas() {
		System.out.println("Almoxarife Trocando o Gas");
	}
}
