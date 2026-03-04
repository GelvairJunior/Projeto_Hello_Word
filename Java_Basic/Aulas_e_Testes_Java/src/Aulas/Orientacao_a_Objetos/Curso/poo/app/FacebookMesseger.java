package Aulas.Orientacao_a_Objetos.Curso.poo.app;

public class FacebookMesseger extends Mensseger {
	public void enviarMensagem(String x) {
		if (validarConectadoInternet()) {
			System.out.println("Enviando messagem pelo Facebook");
			System.out.println("Enviando mensagem: "+ x);
			salvarHistoricoMensagem();
		}else {
			System.out.println("Você está sem internet");
		}
	}
	
	public String receberMensagem() {
		System.out.println("Recebendo mensagem");
		salvarHistoricoMensagem();
		return "Oi Comp 1";
	}
	
}
