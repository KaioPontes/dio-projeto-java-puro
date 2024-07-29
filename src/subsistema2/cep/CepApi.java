package subsistema2.cep;



public class CepApi {
	
private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInsntancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Araraquara";		
	}
	
	public String recuperarEstado(String cep) {
		return "SP";		
	}

}
