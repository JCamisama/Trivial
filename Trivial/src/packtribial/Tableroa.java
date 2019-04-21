package packtribial;

import java.util.*;

public class Tableroa {
	//atributuak
	private Laukia[][]	lehenengoBidea;// Barneko 6 bideetan
	private int			errenkadaKop;
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


	
	public JokalariaAldaketak fitxaMugitu(boolean pHasierakoPasilloan, int pPosizioaErrenkada, int pPosizioaZutabea,
			ListaGaztatxoak puntuak, int ateratakoa) {
		
		//Kontuz posizioaErrenkadarekin
		
		boolean garaileaDa		= false;
		int		egungoZutabea	= pPosizioaZutabea;
		int		egungoErrenkada	= pPosizioaErrenkada;
		int		kont			= 0;
		
		
		while(kont <= ateratakoa){
			
		kont++;
		egungoZutabea++;
		
			if(pHasierakoPasilloan){
				
				if( this.lehenengoBidea[egungoErrenkada][egungoZutabea] instanceof LaukiGaztaduna){
				
				
					
				}
			
				
				
			}
			
			else{
					if( this.bigarrenBidea[egungoZutabea] instanceof LaukiGaztaduna){
						
					}
				}
		}
		
		
		/*public JokalariaAldaketak(boolean pHasierakoPasilloan, int pPosizioaErrenkada, int pPosizioaZutabea, String pGaztatxoa,
				boolean pPartidaAmaituDa){*/
		JokalariaAldaketak aldaketak = null;
		return aldaketak;
		}
		
	
	
	
	
	
	
	
		public void setErrenkadaKop(int pErrenkadaKop){
	        this.errenkadaKop=pErrenkadaKop;
	    }
	    public void setZutabeKop(int pZutabeKop){
	        this.zutabeKop=pZutabeKop;
	    }
	    public void setPosizioZirkuluan(int pPosizioZirkuluan){
	        this.posizioZirkuluan=pPosizioZirkuluan;
	    }
	    public void gehituHasieranLaukia(Laukia pLaukia) {
	        //Salbuespen if jokalari kop 6 edo 2
	        this.lehenengoBidea[this.errenkadaKop][this.zutabeKop]=pLaukia;
	        errenkadaKop++;
	        zutabeKop++;//TODO
	    }
	    public void gehituZirkuluanLaukia(Laukia pLaukia) {
	        //Salbuespen if jokalari kop 6 edo 2
	        this.bigarrenBidea[this.posizioZirkuluan]=pLaukia;
	        posizioZirkuluan++;//TODO
	    }

}
	

