package Jogo;
import java.util.Scanner;

public class GameLauncher {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		Personagem Heroi = new Personagem();
		Heroi.setNome(scanner.next());
		Heroi.setClasse(scanner.next());
		Heroi.setNivel(scanner.nextInt());
		Heroi.setExperience(scanner.nextDouble());
		Heroi.setForca(scanner.nextInt());
		Heroi.setVida(scanner.nextInt());
		
		
		Personagem Vilao = new Personagem();
		Vilao.setNome("Mahito");
		Vilao.setClasse("Magiazinha");
		Vilao.setNivel(5);
		Vilao.setExperience(230.0);
		Vilao.setForca(10);
		Vilao.setVida(120);
		
		Heroi = Vilao;
		
		double dano;
		int opcao = 1;
		
		if (opcao == 1) {
			Heroi.status();
		}
		
		if (opcao == 2) {		
			while (Vilao.getVida() > 0 && Heroi.getVida() > 0)  {
				
				dano = Heroi.bater(Vilao.getVida(), Vilao.getForca());
				Vilao.apanhar(dano);
				
				System.out.println(Vilao.getNome() + " Tomou " +  dano + " de dano");
				System.out.println("e Esta com " + Vilao.getVida());
				
				dano = Vilao.bater(Heroi.getVida(), Heroi.getForca());
				Heroi.apanhar(dano);
				
				System.out.println(Heroi.getNome() + " Tomou " +  dano + " de dano");
				System.out.println("e Esta com " + Heroi.getVida());
			}
			
		}
		
	}
	
}