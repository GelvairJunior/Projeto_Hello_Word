package Jogo;

public class Personagem {
	private String nome;
	private String classe;
	private int nivel;
	private double experience;
	private int forca;
	private double vida;
	
	
	
	public double bater(double vida, int forcaInimigo) {
		double dano;
		double resistencia;
		
		resistencia = vida / forcaInimigo;
		
		dano = forca - resistencia;
		
		if (forca <= resistencia) {
			dano = 100;
		}
		
		return dano;
	}
	
	public void apanhar(double dano) {
		vida = dano - vida;
	}
	
	public void status() {
		double resistencia;
		double proximoNivel;
		resistencia = vida / forca;
		proximoNivel = nivel * 100;
		
		
		System.out.println("Nome:          " + nome);
		System.out.println("Classe:        " + classe);
		System.out.println("Nivel          " + nivel);
		System.out.println("Experiencia:   " + experience);
		System.out.println("Força:         " + forca);
		System.out.println("Vida:          " + vida);
		System.out.println("Resistencia:   " + resistencia);
		System.out.println("");
		System.out.println("XP para o próximo nivel: " + (proximoNivel - experience) );
		
	}
	
	
	
	public void setNome(String name) {
		nome = name;
	}
	
	public void setClasse(String Classes) {
		classe = Classes;
	}
	
	public void setNivel(int level) {
		nivel = level;
	}
	
	public void setExperience(double xp) {
		experience = xp;
	}
	
	public void setForca(int power) {
		forca = power ;
	}
	
	public void setVida(int life) {
		vida = life;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getClasse() {
		return classe;
	}
	
	public int getForca() {
		return forca;
	}
	
	public int getLevel() {
		return nivel;
	}
	
	public double getExperience() {
		return experience;
	}
	
	public double getVida() {
		return vida;
	}
	
}
