package Aulas.Orientacao_a_Objetos.Curso.escola;

import java.awt.Color;

public class School {
	public static void main(String[] args) throws Exception {
		Estudante[] estudante = new Estudante[5];
		
		estudante[0] = new Estudante("john", 202, 12);
		
		estudante[0].setColor(Color.black);
		estudante[0].setSex('F');
		
		System.out.println(estudante[0].getName() + " " + estudante[0].getColor() + " " + estudante[0].getAge() + " " + estudante[0].getSex() + " " + estudante[0].getMatricula());
	}
}
