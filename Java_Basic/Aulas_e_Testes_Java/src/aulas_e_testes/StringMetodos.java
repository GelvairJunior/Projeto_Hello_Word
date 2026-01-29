package aulas_e_testes;

public class StringMetodos {
	public static void main(String[] args) {
		boolean certo;
	    certo = nome();
	    System.out.print(certo);
	    
	}
	
	
	public static boolean nome() {
		String name = "aba";
		String xInverso = "";
		/*for (int i = name.length() - 1; i >= 0; i--) {

			xInverso = xInverso + name.charAt(i);
		}
		*/
	    
	    char letra;
	    int num = name.length();
		
	    num--;
	    while (num >= 0) {
	    	letra = name.charAt(num);
	    	xInverso = xInverso + letra;
	    	num = num - 1;
	    }
	    
	    if (name.equals(xInverso)) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}
}