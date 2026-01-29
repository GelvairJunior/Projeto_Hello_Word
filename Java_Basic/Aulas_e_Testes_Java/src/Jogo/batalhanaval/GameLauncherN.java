package Jogo.batalhanaval;
import java.util.ArrayList;
import java.util.Scanner;

public class GameLauncherN { //Declara e Inicializa as variaveis de que precisamos
	GameHelper helper = new GameHelper();
	private ArrayList<DeluxNaval> startups = new ArrayList();
	private int numOfGuess = 0;
	
	public static void main(String[] args) {
		GameLauncherN game = new GameLauncherN();
		game.setUpGame();
		game.startPlaying();
	}
	
	
	public void setUpGame() {
		// Cria 3 Objetos DeluxNaval, e lhes fornece nome e colca na ArrayList
		DeluxNaval one = new DeluxNaval();
		one.setName("Poniez");
		DeluxNaval two = new DeluxNaval();
		two.setName("hacqui");
		DeluxNaval three = new DeluxNaval();
		three.setName("cabista");
		startups.add(one);
		startups.add(two);
		startups.add(three);
		
		System.out.println("Você deve derrotar as 3 startups(naval)");
		System.out.println("ponize, hacqui, cabista");
		System.out.println("Você dete tentar adivar o local onde estão e digitar a posição de tal");
		
		for ( DeluxNaval startup : startups ) {
			ArrayList<String> newLocation = helper.placeStartup(3);
			startup.setLocationCells(newLocation);
		}
	}
	
	public void startPlaying() {
		while (startups.isEmpty()) {
			String userGuess = helper.getUserInput("De a sugestão: ");
			checkUserGuess(userGuess);
			
		}
		finishGame();
	}

	public void checkUserGuess(String userGuess) {
		numOfGuess++;
		String result = "miss";
		
		for (DeluxNaval startupToTest : startups) {
			result = startupToTest.checkYourself(userGuess);
			
			if (result.equals("hit")) {
				break;
			}
			
			if (result.equals("kill")) {
				startups.remove(startupToTest);
				break;
			}
		}
	}
	
	public void finishGame() {
		System.out.println("Todas as Startups morream! Agora você é inutil");
		if (numOfGuess <= 18) {
			System.out.println("Voce Conseguiu acabar com todos rapidamente em " + numOfGuess + " palpites.");
			System.out.println("Você foi bem melhor nas opções.");
		} else {
			System.out.println("Voce Conseguiue acabar lentamente em " + numOfGuess + " palpites.");
			System.out.println("Você dançou com as opções.");
		}
	}
	
	
	
	public static void simplesNaval() {
		Scanner scanner = new Scanner(System.in);
		SimpleNaval dot = new SimpleNaval();
		
		int tentativas = 0;
		String result = "miss";

		int numRandom = (int) (Math.random() * 5);
		int[] location = {numRandom, numRandom + 1, numRandom + 2};
		dot.setLocationCells(location);
		
		while (result != "kill") {
			
			System.out.print("Digite um numero: ");
			int userGuess = scanner.nextInt();
			
			result = dot.checkAcao(userGuess);
			
			System.out.println(result);
			tentativas++;
			
		}
		
		System.out.println("você derrubou todos os navios em " + tentativas + " palpites.");
	}
}
