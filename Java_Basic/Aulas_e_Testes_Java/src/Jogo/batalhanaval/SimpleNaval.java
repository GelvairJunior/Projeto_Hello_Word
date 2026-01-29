package Jogo.batalhanaval;
//Temos o seguinte problema, se colocarem o mesmo numero acertado, vai continur dando como hit
//Temos 3 soluões
//A terceira opção é utilizar a Api ArrayList vai ta em outro documento

public class SimpleNaval {
	private int[] locationCells;
	private int numOfHits = 0;
	// Solução 1 private int[] numAnterior = new int[3];
	
	public String checkAcao(int guess) {
		String respost = null;
		for(int i = 0; i < locationCells.length; i++) {
			
			if ( guess == locationCells[i] ) {
				/*Solução 1: Lenta
			 	for (int j = 0; j < numAnterior.length; j++) {
					if ( numAnterior[j] == guess) { return "miss"; }
				}
				numAnterior[i] = guess;*/
				
				/*Solução 2: um pouco menos lenta, mas por enquanto vai ser a utilizada*/
				locationCells[i] = -1;
				
				numOfHits++;
				respost = ("hit");
				
				break;
			}
			else { respost = ("miss"); }
			
		}
		
		if (numOfHits == 3) {respost = ("kill");}
		
		return respost;
	}
	
	public void setLocationCells(int[] loc) {
		locationCells = loc;
	}
	
}
