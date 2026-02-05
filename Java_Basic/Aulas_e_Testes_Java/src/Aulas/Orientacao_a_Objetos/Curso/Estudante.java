package Aulas.Orientacao_a_Objetos.Curso;

import java.awt.Color;

public class Estudante {
	String name;
	int age;
	Color color;
	Sex sex = new Sex();
	
	public static void eating(String comida) {
		System.out.println("eu gosto da comida: " + comida);
	}
	
	public static void drinking(String bebida) {
		System.out.println("eu gosto da bebida: " + bebida);
	}


	public static void running(int velocidade) {
		System.out.println("Correndo a " + velocidade + " km/h");
	}
}
