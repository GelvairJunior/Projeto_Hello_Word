package edu.Algoritmos.livro.types.objetos;

public class REGISTER_Sexo {
	public String sexo;
	
	public void setSexo(char sex) {
		if (sex == 'F') {
			sexo = "Feminino";
		}else {
			sexo = "Masculino";
		}
		
	}
	
}