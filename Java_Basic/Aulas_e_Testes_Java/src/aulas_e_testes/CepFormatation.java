package aulas_e_testes;

public class CepFormatation {
	static String formatarCep(String cep) throws Exception{
        if(cep.length() != 8)
          throw new Exception();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}