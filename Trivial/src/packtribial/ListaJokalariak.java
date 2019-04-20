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
		int kont=-1;
		boolean garailea=false;
		while(!garailea){ //txanda kopuru limitatua ipini denbora badago
			kont++;
			if (kont>this.jokalariKop){
				kont=0;
			}
			garailea=lista[kont].txandaBurutu(); //boolean o int no se sabe aún
			//TODO
		}
		this.partidaBukatu(lista[kont].getIrabazlearenNick, lista[kont].getFitxarenKolorea);
	}

	public void setJokalariKop(int pKop){
		this.jokalariKop=pKop;//TODO
	}
	
	public void partidaBukatu(String pIrabazlearenNick, String pFitxarenKolorea) {
		System.out.println("Zorionak " + pIrabazlearenNick + "!!! Zure fitxak, " + pFitxarenKolorea + " kolorekoa, partida irabazi egin du!!!");
	}
}
