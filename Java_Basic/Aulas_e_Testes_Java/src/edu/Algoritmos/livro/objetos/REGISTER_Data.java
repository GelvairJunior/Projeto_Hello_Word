package edu.Algoritmos.livro.objetos;

public class REGISTER_Data {
	public int ano;
	public int mes;
	public int dia;
	
	public void setAno(int year) {
		ano = year;
	}
	
	public void setMes(int mouth) {
		if ((mouth > 0) && (mouth < 13)) {
			mes = mouth;
		}else {
			System.out.println("não existe o mês " + mouth);
		}
	}
	
	public void setDay(int day) {
		if ((day > 0) && (day < 32) ) {
			dia = day;
		} else {
			System.out.println("não há dia " + day + " no mês " + mes);
		}
		
	}
}
