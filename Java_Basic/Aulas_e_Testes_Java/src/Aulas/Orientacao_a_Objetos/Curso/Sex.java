package Aulas.Orientacao_a_Objetos.Curso;

public class Sex {
	String sexo;
	
	void setSexo(char sex) {
		if (sex == 'F') {
			sexo = "Feminino";
		}else {
			sexo = "Masculino";
		}
		
	}
}
