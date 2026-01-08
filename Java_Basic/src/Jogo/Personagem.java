package Jogo;

public class Personagem {
	String nome;
	String classe;
	int nivel;
	double xp;
	int forca;
	double vida;
	
	public static double bater(int forca, double vida, int forcaInimigo) {
		double dano;
		double resistencia;
		
		resistencia = vida / forcaInimigo;
		
		dano = forca - resistencia;
		
		if (forca <= resistencia) {
			dano = 100;
		}
		
		return dano;
	}
	
	public static void status(String nome, String classe, int nivel, double xp, int forca, double vida) {
		double resistencia;
		double proximoNivel;
		resistencia = vida / forca;
		proximoNivel = nivel * 100;
		
		
		System.out.println("Nome:          " + nome);
		System.out.println("Classe:        " + classe);
		System.out.println("Nivel          " + nivel);
		System.out.println("XP:            " + xp);
		System.out.println("Força:         " + forca);
		System.out.println("Vida:          " + vida);
		System.out.println("Resistencia:   " + resistencia);
		System.out.println("");
		System.out.println("XP para o próximo nivel: " + (proximoNivel - xp) );
		
	}
	
}
