package packtribial;

public class Trivial {
	
	private static Trivial nireTrivial;
	
	private Trivial() {
		
	}
	
	public static synchronized Trivial getNireTrivial() {
		if(Trivial.nireTrivial == null) {
			Trivial.nireTrivial = new Trivial();
		}
		return Trivial.nireTrivial;
	}
	private void partidaBatJolastu() {
		//Salbuespen 2 jokalari minimo.
		int jokalariKop=Teklatua.getTeklatua().irakurriOsoa("Sartu jokalari kopurua, 2-6 jokalari");
		ListaJokalariak.getNireListaJokalariak().jokalarienTxandaKudeatu(jokalariKop);//TODO
	}
	
	private void partidaHasieratu() {
		//TODO adibidez ezarri jokalari kop, hasieratu zerrenda guztiak etab
	}
	
	
	
	public static void main(String args[]){
		Trivial.getNireTrivial().partidaBatJolastu();
	}
}
