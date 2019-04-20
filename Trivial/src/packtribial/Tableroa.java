package proiektua;

import java.util.*;

public class Tableroa {
	//atributuak
	private Kasilla[][] lehenengoBidea;
	private Kasilla[] bigarrenBidea;
	private static Tableroa nireTableroa;

	//eraikitazilea
	private Tableroa() {
		this.laukienZerrenda = new ArrayList<Laukia>();
	}

	//gainotzeko metodoak
	public static synchronized Tableroa getNireTableroa() {
		if(Tableroa.nireTableroa == null) {
			Tableroa.nireTableroa = new Tableroa();
		}
		return Tableroa.nireTableroa;
	}
	private void partidaBatJolastu() {
		//TODO
	}
	

	
	private void partidaHasieratu() {
		//TODO adibidez ezarri jokalari kop, hasieratu zerrenda guztiak etab
	}
	
	public void partidaBukatu(String pIrabazlearenNick, String pFitxarenKolorea) {
		System.out.println("Zorionak " + pIrabazlearenNick + "!!! Zure fitxak, " + pFitxarenKolorea + " kolorekoa, partida irabazi egin du!!!");
	}
	
	public static void main(String args[]){
		Tableroa.getNireTableroa().partidaBatJolastu();
	}
	
}
