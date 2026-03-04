package aulas_e_testes;

public class cowSey {
	public static void main(String[] args) {
		int linhas = 16;
		String frase = "        Hello Word, sou o Chaves";
		String choro = "pipipipipi";
		String reto = "----------------------------------------";
		String retoBaixo = " _________________________";
		String fala = "\\\\";
		String meioAlto = "/" + "                         " + "\\";
		String meioBaixo = "\\" + "                         " + "/";
		String espaço = "                        ";
		int contraParte = 1;
		
		while (linhas >= 0 ) {
			switch (linhas) {
				case 16:
					System.out.println(reto);
					break;
				case 15:
					System.out.println(frase);
					break;
				case 14:
					System.out.println(reto);
					break;
				case 13:
					System.out.println(" " + espaço + fala);
					break;
				case 12:
					System.out.println("  " + espaço + fala);
					break;
				case 11:
					System.out.println(espaço + retoBaixo);
					break;
				case 10:
					System.out.println(espaço + meioAlto);
					break;
				case 9:
					System.out.println(espaçosMeiosCima(linhas, contraParte));
					contraParte++;
					break;
				case 8:
					System.out.println(espaçosMeiosCima(linhas, contraParte));
					contraParte++;
					break;
				case 7:
					System.out.println(espaçosMeiosCima(linhas, contraParte));
					contraParte++;
					break;
				case 6:
					System.out.println(espaçosMeiosCima(linhas, contraParte));
					contraParte++;
					break;
				case 5:
					System.out.println(espaçosMeiosBaixo(linhas, contraParte));
					contraParte++;
					break;
				case 4:
					System.out.println(espaçosMeiosBaixo(linhas, contraParte));
					contraParte++;
					break;
				case 3:
					System.out.println(espaçosMeiosBaixo(linhas, contraParte));
					contraParte++;
					break;
				case 2:
					System.out.println(espaçosMeiosBaixo(linhas, contraParte));
					contraParte++;
					break;
				case 1:
					System.out.println(espaço + meioBaixo);
					break;
				case 0:
					System.out.println(espaço + retoBaixo);
					break;
			}
			linhas--;
		}
	}
	
	private static String espaçosMeiosCima(int linha, int contraParte) {
		String espaço = " ";
		String espaçoMeio = "  "; 
		String linhaDireita = "/";
		String linhaEsquerda = "\\";
		String espaçoAnterior = "              ";
		String espaçoPosterior = "                         ";
		//System.out.println("outro algo" + espaçoMeio.repeat(contraParte) + "a algo");
		String completo = (espaçoAnterior + espaço.repeat(linha)+ linhaDireita + espaçoPosterior + espaçoMeio.repeat(contraParte) + linhaEsquerda);  
		return completo;
	}
	
	private static String espaçosMeiosBaixo(int linha, int contraParte) {
		
		String espaço = " ";
		String espaçoMeio = "  "; 
		String linhaDireita = "\\";
		String linhaEsquerda = "/";
		String espaçoAnterior = "               ";
		String espaçoPosterior = "                       ";
		
		String completo = (espaçoAnterior + espaço.repeat(contraParte)+ linhaDireita + espaçoPosterior + espaçoMeio.repeat(linha) + linhaEsquerda); 
		return completo;
	}
}
