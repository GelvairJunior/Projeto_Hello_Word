package edu.desafios;

public class Conferencia { // obj: saber quantos itens teria que comprar para dar a economia das ferias
	
	public static void main(String[] args) {
		int normalPreco = 1400;//aqui é modificavel
		int desconto = 35;// aqui é modificavel
		int custoFerias = 10000; // aqui é modificavel
		double descont = desconto;
		double descontado = 0;
		int quantidade = 0;
		
		
		while (descontado < custoFerias) {
			descontado = descontado + (normalPreco * (descont/100));
			System.out.println(descontado);
			
			
			quantidade = quantidade + 1;
			
			
		}
		
		System.out.println(quantidade);
		boolean foi = certo(quantidade);
		System.out.print(foi);
		
	}
	
	public static boolean certo(int result) {
		int valor_mim = 21;//Aqui é o numero minimo para dar a economia das férias
		if (result == valor_mim) {
			return true;
		}
		else {
			return false;
		}
			
	}
}
