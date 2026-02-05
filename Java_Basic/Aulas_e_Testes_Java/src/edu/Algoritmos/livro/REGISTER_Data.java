package edu.Algoritmos.livro;

public class REGISTER_Data {
	int ano;
	int mes;
	int dia;
	
	void setAno(int year) {
		ano = year;
	}
	
	void setMes(int mouth) {
		if ((mouth > 0) && (mouth < 13)) {
			mes = mouth;
		}else {
			System.out.println("não existe o mês " + mouth);
		}
	}
	
	void setDay(int day) {
		if ((day > 0) && (day < 32) ) {
			dia = day;
		} else {
			System.out.println("não há dia " + day + " no mês " + mes);
		}
		
	}
}
