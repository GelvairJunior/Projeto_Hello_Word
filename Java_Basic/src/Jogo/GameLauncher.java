package Jogo;

public class GameLauncher {

	public static void main(String[] args){
		Personagem Heroi = new Personagem();
		Heroi.nome = "Itadori";
		Heroi.classe = "Porradeiro";
		Heroi.nivel = 5;
		Heroi.xp = 230;
		Heroi.forca = 30;
		Heroi.vida = 90;
		
		Personagem Vilao = new Personagem();
		Vilao.nome = "Mahito";
		Vilao.classe = "Magiazinha";
		Vilao.nivel = 5;
		Vilao.xp = 230.0;
		Vilao.forca = 10;
		Vilao.vida = 120;
		
		double dano;
		int opcao = 1;
		
		if (opcao == 1) {
			Personagem.status(Heroi.nome, Heroi.classe, Heroi.nivel, Heroi.xp, Heroi.forca, Heroi.vida);
		}
		
		if (opcao == 2) {		
			while (Vilao.vida > 0 && Heroi.vida > 0)  {
				
				dano = Personagem.bater(Heroi.forca, Vilao.vida, Vilao.forca);
				Vilao.vida = Vilao.vida - dano;
				
				System.out.println(Vilao.nome + " Tomou " +  dano + " de dano");
				System.out.println("e Esta com " + Vilao.vida);
				
				dano = Personagem.bater(Vilao.forca, Heroi.vida, Heroi.forca);
				
				Heroi.vida = Heroi.vida - dano;
				
				System.out.println(Heroi.nome + " Tomou " +  dano + " de dano");
				System.out.println("e Esta com " + Heroi.vida);
			}
			
		}
		
	}
	
}