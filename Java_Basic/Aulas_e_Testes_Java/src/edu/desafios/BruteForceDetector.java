package edu.desafios;

import java.util.ArrayList;
import java.util.Collections;

public class BruteForceDetector {
	public static void main(String[] args) {
		String[] logs = {"9.9.9.9 LOGIN_FAIL user=a", "1.1.1.1 LOGIN_FAIL user=b", "9.9.9.9 LOGIN_FAIL user=a", "1.1.1.1 LOGIN_FAIL user=b", "9.9.9.9 LOGIN_FAIL user=a", "1.1.1.1 LOGIN_FAIL user=b"};
		int p = 0;
		ArrayList<String> log = new ArrayList<String>();//para transformar a lista em um array 
		ArrayList<String> ips = new ArrayList<String>(); // para pegar os ips
		ArrayList<String> retorno = new ArrayList<String>(); // para enviar os ips banidos
		
		for (String s : logs){ // adicionar os logs no array log, e pegar cada ip
			
			String[] partes = logs[p].split(" ");
			log.add(s);
			
			if (ips.contains(partes[0]) == false) {
				ips.add(partes[0]); 
			}
			
			p++;
		}
		
		p = 0;// reiniciar contador
		
		for (String s : ips) { // cada ip pego, ira verificar ip por pi
			for (int j = 0; j < log.size(); j++) { // um loop para que verifique todos os log
				if(log.get(j).contains(s)) { // verificação se é igual a o ip que esta vindo
					System.out.println(log.get(j) + " / " + s); // só para se localisar
					if(log.get(j).contains("LOGIN_FAIL")) { // verificação se deu erro ou nao
						p++; // acressentando
						if(p >= 3) { // se tiver os 3 erros adiciona para retornar dps
							if (retorno.contains(s)) {continue;}// se ja tiver o ip nao precisa continuar
							retorno.add(s);
						} 
					} else { // se ja acertou entao pode reinicia o contador
						p=0;
					}
					
				}
				
			}
			p = 0;// reiniciar contador
		}
		
		Collections.sort(retorno);
		System.out.println(retorno);// o retorno
	}
	
}