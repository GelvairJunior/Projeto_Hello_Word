package Jogo.batalhanaval;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameHelper {
	private static final String ALPHABET = "abcdefg";
	private static final int GRID_LENGTH = 7;
	private static final int GRID_SIZE = 49;
	private static final int MAX_ATTEMPTS = 200;
	static final int HORIZONTAL_INCREMENT = 1;       // Um jeito melhor de representar 2 coisas em um enum 
	static final int VERTICAL_INCREMENT = GRID_LENGTH;
	
	private final int[] grid = new int[GRID_SIZE];
	private final Random random = new Random();
	private int startupCount = 0;
	
	public String getUserInput(String prompt) {
		System.out.print(prompt + ": ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine().toLowerCase();
	}
	
	
	public ArrayList<String> placeStartup(int startupSize) {
		// Armazena o índice para a grade (0 - 48)
		int[] startupCoords = new int[startupSize];  // Atuais coordenadas do candidato
		int attemps = 0;                             // contador de tentativas atuais
		boolean success = false;                     // flag = achou um bom local?
		
		startupCount++;                              // Inserindo a énesima Startup
		int increment = getIncrement();              // Alinhamento vert/horiz alternativo
		
		while(!success & attemps++ < MAX_ATTEMPTS) {
			int location = random.nextInt(GRID_SIZE);
			
			for (int i = 0; i < startupCoords.length; i++) {
				startupCoords[i] = location;
				location += increment;
			}
			//
			
			if (startupFits(startupCoords, increment)) {
				success = coordsAvailable(startupCoords);
			}
		}
		savePositionToGrid(startupCoords);
		ArrayList<String> alphaCells = convertCoordsToAlphaFormat(startupCoords);
		//
		return alphaCells;
	}

	
	private boolean startupFits(int[] startupCoords, int increment) {
		int finalLocation = startupCoords[startupCoords.length - 1];
		if (increment == HORIZONTAL_INCREMENT) {
			// Verificar se o final está na mesma linho do início
			return calcRowFromIndex(startupCoords[0]) == calcRowFromIndex(finalLocation);
		} else {
			return finalLocation < GRID_SIZE; //Verifica se a extremidade não excede a parte inferior
		}
	
	}
	
	
	private boolean coordsAvailable(int[]startupCoords) {
		for (int coord : startupCoords) { // Verifica todas as posições potenciais
			if (grid[coord] != 0) { // Esta posição já foi ocupada
				//
				return false; // houve algum conflito
			}
		}
		return true; // não houve conflito
	}
	
	
	private void savePositionToGrid(int[] startupCoords) {
		for (int index : startupCoords) {
			grid[index] = 1;
		}  //Marca a posição da grade como 'used'
	}
	
	
	private ArrayList<String> convertCoordsToAlphaFormat(int[] startupCoords){
		ArrayList<String> alphaCells = new ArrayList<String>();
		for (int index : startupCoords) {
			String alphaCoords = getAlphaCoordsFromIndex(index);
			alphaCells.add(alphaCoords);
		}
		
		return alphaCells;
	}
	
	
	private String getAlphaCoordsFromIndex(int index) {
		int row = calcRowFromIndex(index);
		int column = index % GRID_LENGTH;
		String letter = ALPHABET.substring(column, column + 1);
		
		return letter + row;
	}
	
	
	private int calcRowFromIndex(int index) {
		return index / GRID_LENGTH;
	}
	
	
	private int getIncrement() {
		if(startupCount % 2 == 0) {
			return HORIZONTAL_INCREMENT;
		} else {
			return VERTICAL_INCREMENT;
		}
	}
}
