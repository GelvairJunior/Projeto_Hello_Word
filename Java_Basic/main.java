
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        byte mes = 9;
        int idadeinvertida= -20;
        short dia = 80;
        long ano = 2004L;
        float peso = 60.35f;
        double numeogrande = 50.35563;
        char lista = 'A';
        boolean bool = true;
        String programacao = "Hello World Java";
    
        //vetores
        int[] colecaoint = {1, 2, 3, 4, 5};
        float[] colecaofloat = {1.1f, 2.2f, 3.3f, 4.4f};
        String[] colecaoStrings = {"Hello", "World", "Java"};

        int[] vetorint = new int[5];
        float[] vetorfloat = new float[5];
        String[] vetorString = new String[5];

        //adicionar no vetorString o valor Jogando, Java e Junior
        vetorString[0] = "Jogando";
        vetorString[1] = "Java";
        vetorString[2] = "Junior";

        //arrayslist
        ArrayList<String> Listas = new ArrayList<>();
        Listas.add("Java a Gata");
        Listas.add("Billy o Cachorro");
        Listas.add("Juliana");
        Listas.add("Junior");    

        // condicionais
        if(mes < dia) {
            System.out.println(programacao + ", aparentemente vou usar muito voce");
        } else if(mes < dia) {
            System.out.println("Hello World Java, vish nao vai ser tanto usado ein, fica esperto");
        } else {
            System.out.println("Hello World Java, voce vai usar muito");
        }

        // vetores
        System.out.println(colecaoStrings[2]);

        // Arraylist
        System.out.println(Listas.get(1));
        Listas.remove("Java");

        //Loops for
        for(int i = 0; i < Listas.size(); i++){
            System.out.println(Listas.get(i));
        }
        
        //Loops for 2
        for(String vetString : vetorString){
            System.out.println(vetString);
        }

        //Loops while
        while(dia > idadeinvertida) {
            System.out.println("eu amo a Java :) " + (dia - idadeinvertida));
            idadeinvertida++;
        }

    }
}