package edu.Algoritmos.curso;

public class Objeto {
	Integer num;
	String fala;
	
	Objeto(int num) {
		this.num = num;
		this.fala = "oi"; 
	}
	
	public void setFala(String fala) {
		this.fala = fala;
	}
	
	@Override
	public String toString() {
		return "Objeto [num=" + num + ", fala=" + fala + "]";
	}
}
