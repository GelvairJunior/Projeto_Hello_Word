package Aulas.Orientacao_a_Objetos.Curso;

import java.awt.Color;

public class School {
	public static void main(String[] args) throws Exception {
		Estudante[] estudante = new Estudante[5];
		
		estudante[0] = new Estudante();
		
		estudante[0].name = "john";
		estudante[0].age = 12;
		estudante[0].color = Color.black;
		estudante[0].sex.setSexo('M');
		
		System.out.println(estudante[0].name + " " + estudante[0].color + " " + estudante[0].age + " " + estudante[0].sex.sexo );
	}
}
