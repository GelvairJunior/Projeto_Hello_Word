package Aulas.Orientacao_a_Objetos.Curso.escola;

import java.awt.Color;

import Aulas.Orientacao_a_Objetos.Curso.escola.util.Sex;

public class Estudante {// faça uso dos Construtores, get, set e package
	private String name;
	private int age;
	private int matricula;
	private Color color;
	enum sex{Masculino, Feminino};
	private Sex sex = new Sex();
	
	public Estudante(String name, int matricula, int age) {
		this.name = name;
		this.matricula = matricula;
		this.age = age;
	}
	
	public static void eating(String comida) {
		System.out.println("eu gosto da comida: " + comida);
	}
	
	public static void drinking(String bebida) {
		System.out.println("eu gosto da bebida: " + bebida);
	}

	public static void running(int velocidade) {
		System.out.println("Correndo a " + velocidade + " km/h");
	}

	public String getSex() {
		return sex.getSexo();
	}

	public void setSex(char sexo) {
		sex.setSexo(sexo);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getMatricula() {
		return matricula;
	}

	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}
