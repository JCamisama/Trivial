package packtribial;

public class Laukia {
	//atributuak
	
	private String	kolorea;
	

	//eraikitzailea-constructora
	
	public Laukia(String pKolorea){
		
		this.kolorea = pKolorea;
		
	}

	//gainontzeko metodoak-metodos adicionales
	
	
	public String galderaFormulatu(){
		
		String erantzuna = "okerra";
	
		ListaGalderak galderaHauek = ListaGalderak.getNireListaGalderak();
		
		erantzuna	= galderaHauek.galderaFormulatu(this.kolorea);
	
		return erantzuna;
		
	}
	
	protected String getKolorea(){
		
		return this.kolorea;
	}
}
