package edu.modeloIphone;

public class IPhone implements AparelhoTelefonico, NavegarInternet, ReprodMusica {

	@Override
	public void tocarMusica(String musica) {
		System.out.println("Tocando a musica " + musica);
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando a musica");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecione a musica");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo sua pagina");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina");
		
	}

	@Override
	public void ligar(int numero) {
		System.out.println("Ligando para o numero " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligaçao");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Reproduzindo o correio de voz");
		
	}
	
}
