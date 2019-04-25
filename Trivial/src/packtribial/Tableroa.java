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
			ListaGaztatxoak pPuntuak, int pAteratakoa) {
		
		//Kontuz posizioaErrenkadarekin
		
		//Jokalariaren informazioa eguneratzeko aldagai lokalak
		
		Teklatua	teklatuHau			= Teklatua.getTeklatua();
		boolean garaileaDa				= false;
		boolean hasierakoPasilloan		= pHasierakoPasilloan;
		int		egungoZutabea			= pPosizioaZutabea;
		int		egungoErrenkada			= pPosizioaErrenkada;
		String erantzuna				= "okerra";					//jokalariaren puntuak kontrolatzeko
		int		kont					= 0;
		
		
		if(!hasierakoPasilloan){
				
			String noraMugitu = teklatuHau.noraMugitu("Nora mugitu nahi duzu fitxa? (aurrera/atzera)");
			//Salbuespena gertatuko da kasu honetan****************************
				
			egungoZutabea	= this.mugituZirkuluan(egungoZutabea, pAteratakoa, noraMugitu);
			erantzuna		= this.bigarrenBidea[egungoZutabea].galderaFormulatu();
				 

			//jokalariaren puntuak eguneratzen
			pPuntuak.gehituGaztatxoa(erantzuna);
				 
			if (pPuntuak.zenbatGaztatxo() == 6){
					 
				hasierakoPasilloan	= true;
				/* hemen laukitxo bereziaren koordenatuak ipini: errenkada zenbakia eta zutabe azkenengo posizioa */
			}
			
		}
		
		else{
			
			if (pPuntuak.zenbatGaztatxo() == 6){
				//pasilloaren barnean dago eta jadanik sartu da
				
				
				egungoZutabea = mugituAzkenengoGalderarantz(egungoZutabea);
				
				
				
				
			}
			
		}
				 
				
			/*	
				
				if( this.lehenengoBidea[egungoErrenkada][egungoZutabea] instanceof LaukiGaztaduna){
				
				
					
				}
			
				
			
			else{
				
				
					if( this.bigarrenBidea[egungoZutabea] instanceof LaukiGaztaduna){
						
					}
				}
	
		*/
		
		/*public JokalariaAldaketak(boolean pHasierakoPasilloan, int pPosizioaErrenkada, int pPosizioaZutabea, String pGaztatxoa,
				boolean pPartidaAmaituDa){*/
		JokalariaAldaketak aldaketak = null;
		return aldaketak;
		}
		
	
	private int mugituZirkuluan(int pEgungoPosizioa, int pZenbatMugitu, String pNora){
		
		int	posizioBerria	= pEgungoPosizioa;
		
		if (pNora == "aurrera"){
			
			posizioBerria	= posizioBerria + pZenbatMugitu;
			if (posizioBerria > 41){
				
				posizioBerria	= posizioBerria - 42; //Zerotik hasi behar delako zenbaketa "ken 42 egiten da"
			}
		}
			
		else if (pNora == "atzera"){
				
			posizioBerria	= posizioBerria - pZenbatMugitu;
			if(posizioBerria < 0){
					
				posizioBerria	= posizioBerria	+ 42; //Zeroa kontuan hartzeko "gehi 42 egiten da"
			}
		}
			
			
		return posizioBerria;
	}
	
	private int mugituAzkenengoGalderarantz(int pEgungoPosizioa){
		
		int posizioBerria;
		
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
	

