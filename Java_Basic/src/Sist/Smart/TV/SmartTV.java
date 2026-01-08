package Sist.Smart.TV;

public class SmartTV {
	
	boolean ligado = false;
	int canal = 1;
	int volume = 1;
		
	public static boolean ligarTv (boolean ligado) {
		System.out.print("A tv esta desligada, ligando: ");
		ligado = true;
		System.out.println(ligado);
		
		return ligado;
	}
	
	public static boolean desligarTv (boolean ligado) {
		System.out.print("A tv esta ligada, desligando");
		ligado = false;
		
		return ligado;
	}
	
	public static int aumentarVolume (int volume) {
		
		volume++;
		
		return volume;
	}
	
	public static int diminuirVolume (int volume) {
		
		volume--;
		
		return volume;
	}
	
	public static int trocarCanal (int canal) {
		boolean mudar = true;
		
		System.out.println("Você está no canal: "+ canal + " Quer mudar diminuir ou aumentar o canal: ");
		mudar = true;
		if (mudar == true) {
			canal++;
			System.out.println("Agora você esta no canal: " + canal);
			
		}
		else {
			canal--;
			System.out.println("Blz assista seu canal");
		}
		
		return canal;
	}
	
	public static int trocarCanalDireto (int canal) {
		return canal;
	}	

}