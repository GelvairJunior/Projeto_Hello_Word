package edu.Algoritmos.livro.types.objetos;

public class REGISTER_Pessoa {
	public String nome;
	public String sobrenome;
	public REGISTER_Sexo sex = new REGISTER_Sexo();
	public String estadoCivil;
	public REGISTER_Data nascimento = new REGISTER_Data();
	public int deNascimento = nascimento.dia;
	public int altura;
	
}
