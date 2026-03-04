package Aulas.Orientacao_a_Objetos.Curso.interfaces.equipamentos.multifuncional;

import Aulas.Orientacao_a_Objetos.Curso.interfaces.equipamentos.copiadora.Copiadora;
import Aulas.Orientacao_a_Objetos.Curso.interfaces.equipamentos.digitação.Digitadora;
import Aulas.Orientacao_a_Objetos.Curso.interfaces.equipamentos.impressao.Impressora;

public class EquipamentoMultifuncional implements Digitadora, Copiadora, Impressora{//herança multipla com interface

	@Override
	public void imprmir() {
		System.out.println("Imprimindo via equipamento multifuncional");
		
	}

	@Override
	public void copiando() {
		System.out.println("Compiando via equipamento multifuncional");
		
	}

	@Override
	public void digitalizando() {
		System.out.println("Digitalizando via equipamento multifuncional");
		
	} 
	
}
