package Aulas.Orientacao_a_Objetos.Curso.interfaces;

import Aulas.Orientacao_a_Objetos.Curso.interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;
import Aulas.Orientacao_a_Objetos.Curso.interfaces.equipamentos.impressao.Impressora;
import Aulas.Orientacao_a_Objetos.Curso.interfaces.equipamentos.digitação.Digitadora;
import Aulas.Orientacao_a_Objetos.Curso.interfaces.equipamentos.copiadora.Copiadora; 

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Impressora impressora = em;
		Digitadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprmir();
		digitalizadora.digitalizando();
		copiadora.copiando();
		
	}
}
