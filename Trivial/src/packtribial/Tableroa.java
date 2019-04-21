package packtribial;

import java.util.*;

public class Tableroa {
	//atributuak
	private Laukia[][]	lehenengoBidea;// Barneko 6 bideetan
	private int			errendakadaKop;
	private int			zutabeKop;
	private Laukia[]	bigarrenBidea;// Kanpoko bidea, zirkulu bat
	private	int			posizioZirkuluan; 		
	private static Tableroa nireTableroa;

	//eraikitazilea
	private Tableroa() {
		//this.laukienZerrenda = new ArrayList<Laukia>();
		
		
	}

	//gainotzeko metodoak
	public static synchronized Tableroa getNireTableroa() {
		if(Tableroa.nireTableroa == null) {
			Tableroa.nireTableroa = new Tableroa();
		}
		return Tableroa.nireTableroa;
	}


	
	public boolean fitxaMugitu(int pTxanda, boolean pHasierakoPasilloan, int posizioaErrenkada, int posizioaZutabea,
			ListaGaztatxoak puntuak, int ateratakoa) {
		
		boolean garaileaDa		= false;
		int		egungoPosizioa	= posizioaZutabea;
		int		kont			= 0;
		
		if(pHasierakoPasilloan){
			
			
		}
		
		else{
			
		
			while(kont <= ateratakoa){
			
			kont++;
			if( this.instanceof)
		}
		
		
		
		// TODO Auto-generated method stub
		
		return garaileaDa;
	}
	
}
