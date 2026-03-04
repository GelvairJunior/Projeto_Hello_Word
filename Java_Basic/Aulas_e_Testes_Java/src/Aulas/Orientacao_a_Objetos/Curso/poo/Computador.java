package Aulas.Orientacao_a_Objetos.Curso.poo;

import Aulas.Orientacao_a_Objetos.Curso.poo.app.FacebookMesseger;
import Aulas.Orientacao_a_Objetos.Curso.poo.app.MSNMessenger;
import Aulas.Orientacao_a_Objetos.Curso.poo.app.Mensseger;
import Aulas.Orientacao_a_Objetos.Curso.poo.app.Telegram;

public class Computador {
	public static void main(String[] args) {
		Mensseger msi = null; // Polimorfismo
		
		String menssegerEscolhido = "fcb";
		
		if(menssegerEscolhido.equals("fcb")) {
			msi = new FacebookMesseger();
		}else if(menssegerEscolhido.equals("msn")) {
			msi = new MSNMessenger();
		}else if(menssegerEscolhido.equals("tlg")){
			msi = new Telegram();
		}
		
		msi.enviarMensagem("OI");
		msi.receberMensagem();
		
	}
	
	static void problematico() {
		MSNMessenger msn = new MSNMessenger();
		System.out.println("Messenger");
		msn.enviarMensagem("Oi");
		String y = msn.receberMensagem();
		System.out.println(y);
		
		System.out.println("");
		
		Telegram tlg = new Telegram();
		System.out.println("Telegram");
		tlg.enviarMensagem("Oi");
		String t = tlg.receberMensagem();
		System.out.println(t);
		
		System.out.println(" ");
		
		FacebookMesseger face = new FacebookMesseger();
		System.out.println("Facebook");
		face.enviarMensagem("Oi");
		String f = face.receberMensagem();
		System.out.print(f);		
	}
}
