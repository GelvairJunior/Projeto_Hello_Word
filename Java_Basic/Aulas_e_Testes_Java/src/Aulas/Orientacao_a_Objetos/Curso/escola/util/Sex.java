package Aulas.Orientacao_a_Objetos.Curso.escola.util;

public class Sex {
	private String sexo;
	
	public void setSexo(char sex) {
		if (sex == 'F') {
			sexo = "Feminino";
		}else {
			sexo = "Masculino";
		}
		
	}
	
	public String getSexo() {
		return sexo;
	}
}
