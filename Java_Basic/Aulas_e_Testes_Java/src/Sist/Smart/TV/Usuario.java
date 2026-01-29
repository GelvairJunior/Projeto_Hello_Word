package Sist.Smart.TV;

public class Usuario {
	
	public static void main(String[] args) {
		
		SmartTV smartTv = new SmartTV();
		
		System.out.println(smartTv.ligado);
		System.out.println("A tv esta de padrão no canal: " + smartTv.canal);
		System.out.println("A tv esta de padrão no volume: " + smartTv.volume);
		
		if (smartTv.ligado = false) {
			smartTv.ligado = SmartTV.ligarTv(smartTv.ligado);
		}
		
		smartTv.volume = SmartTV.aumentarVolume(smartTv.volume);
		
		smartTv.canal = SmartTV.trocarCanal(smartTv.canal);
		
		System.out.println(smartTv.ligado);
		System.out.println("Mudando o canal: " + smartTv.canal);
		System.out.println("Mudando o volume: " + smartTv.volume);
	
		smartTv.volume = SmartTV.diminuirVolume(smartTv.volume);
		System.out.println("Mudando o volume: " + smartTv.volume);
	
		smartTv.canal = SmartTV.trocarCanalDireto(13);
		System.out.println("Mudando para o canal: " + smartTv.canal);
		
	}
}
