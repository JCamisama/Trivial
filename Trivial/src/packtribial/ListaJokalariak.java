package packtribial;

import java.util.*;

public class ListaJokalariak {
	//atributuak
	private Jokalaria[] lista;
	private static ListaJokalariak nireListaJokalariak = null;
    private int jokalariKop=2;//defektuz 2
    private int luzera=0;
	//eraikitazilea
	private ListaJokalariak() {
		this.lista = new Jokalaria[this.jokalariKop];
	}

	//gainotzeko metodoak
	public static synchronized ListaJokalariak getNireListaJokalariak() {
		if(ListaJokalariak.nireListaJokalariak == null) {
			ListaJokalariak.nireListaJokalariak = new ListaJokalariak();
		}
		return ListaJokalariak.nireListaJokalariak;
	}
	
	public void gehituJokalaria(Jokalaria pJokalaria) {
		//Salbuespen if jokalari kop 6 edo 2
		this.lista[this.luzera]=pJokalaria;
		luzera++;//TODO
	}
	
	public void jokalarienTxandaKudeatu(int pJokalariKop) {
		int txanda=-1;
		boolean garailea=false;
		while(!garailea){ //txanda kopuru limitatua ipini denbora badago
			txanda++;
			if (txanda+1>this.jokalariKop){// arrayaren indizea eta kopurua ez direlako berdinak!!!
				txanda=0;
			}
			garailea=lista[txanda].txandaBurutu(txanda); //boolean o int no se sabe a�n
			//TODO
		}
		this.partidaBukatu(lista[txanda].getFitxarenKolorea());//nick-a ipini diateke
	}

	public void setJokalariKop(int pKop){
		this.jokalariKop=pKop;//TODO
	}
	
	public void partidaBukatu(String pFitxarenKolorea) {
		System.out.println("Zorionak " + pFitxarenKolorea + " partida irabazi egin du!!!");
	}
}
