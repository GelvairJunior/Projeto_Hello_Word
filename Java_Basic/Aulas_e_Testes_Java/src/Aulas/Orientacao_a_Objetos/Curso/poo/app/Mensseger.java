package Aulas.Orientacao_a_Objetos.Curso.poo.app;

public abstract class Mensseger {
	public abstract void enviarMensagem(String x);// Abstração
	
	public abstract String receberMensagem(); // Abstração
	
	protected boolean validarConectadoInternet() { // Encapsulamento
		System.out.println("Validado se esta conectado a internet"); // protected porue nao da para usar metodos em outros metodos se for privado		
		return true;
	}
	
	protected void salvarHistoricoMensagem() { // Encapsulamento
		System.out.println("Salvando o histórico da mensagem");
	}
}
