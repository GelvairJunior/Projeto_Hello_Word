package edu.Algoritmos.livro;

public class REGISTER_Pessoa {
	String nome;
	String sobrenome;
	REGISTER_Sexo sex = new REGISTER_Sexo();
	String estadoCivil;
	REGISTER_Data nascimento = new REGISTER_Data();
	int deNascimento = nascimento.dia;
	int altura;
	
}
