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
		
		boolean garaileaDa				= false;
		boolean hasierakoPasilloan		= pHasierakoPasilloan;
		int		egungoZutabea			= pPosizioaZutabea;
		int		egungoErrenkada			= pPosizioaErrenkada;
		String  erantzuna				= "okerra";					//jokalariaren puntuak kontrolatzeko
		int		kont					= 0;
		
		
		if(!hasierakoPasilloan){
			
			egungoZutabea	= this.mugituZirkuluan(egungoZutabea, pAteratakoa);
			erantzuna		= this.bigarrenBidea[egungoZutabea].galderaFormulatu();
				 
			//jokalariaren puntuak eguneratzen
			pPuntuak.gehituGaztatxoa(erantzuna);
				 
			if (pPuntuak.zenbatGaztatxo() == 6){
					 
				hasierakoPasilloan	= true;
				
				//downcasting-a erabiliz
				egungoErrenkada		= ((LaukiGaztaduna)this.bigarrenBidea[egungoZutabea]).getErrenkada();
				egungoZutabea		= ((LaukiGaztaduna)this.bigarrenBidea[egungoZutabea]).getZutabeaPasilloan();
			}
			
		}
		
		else{
			
			if (pPuntuak.zenbatGaztatxo() == 6){
				//pasilloaren barnean dago eta jadanik sartu da
				
				
				egungoZutabea	= egungoZutabea - pAteratakoa;
				
				if (egungoZutabea < 0){
					
					egungoZutabea = 0;
				}
				erantzuna		= this.bigarrenBidea[egungoZutabea].galderaFormulatu();
				
				//Zerogarren laukira heltzeko behar baino gehiago ateratzen bada dadoan, onartuko dugu
				if(egungoZutabea == 0 && erantzuna == "zuzena"){
					
					garaileaDa	= true;
				}
				
				else{
					
					pPuntuak.gehituGaztatxoa(erantzuna);//galdera erantzun ostean zer gertatu den esaten du
					
				}
					
			}
			
			
			else{
				
				while (kont <= pAteratakoa && hasierakoPasilloan){
				
					kont++;
					egungoZutabea++;
					if( this.lehenengoBidea[egungoErrenkada][egungoZutabea] instanceof LaukiGaztaduna){
					
						hasierakoPasilloan	= false;
						//downcasting-a erabiliz
						egungoZutabea		= 
								((LaukiGaztaduna)this.lehenengoBidea[egungoErrenkada][egungoZutabea]).getZutabeaZirkuluan();
					}
				}
				
				if (kont < pAteratakoa){ //zirkulura pasatu da eta oraindik mugitu behar da
					
					int zenbatMugitu	= pAteratakoa - kont;
					egungoZutabea		= this.mugituZirkuluan(egungoZutabea,zenbatMugitu);
					
				}
				
				//Mugimengua guztiz burutu dela, galdera eskatzeko momentua da
				
				if(!hasierakoPasilloan){
					
					erantzuna		= this.bigarrenBidea[egungoZutabea].galderaFormulatu();
	
				}
				
				else{
					
					erantzuna		= this.lehenengoBidea[egungoErrenkada][egungoZutabea].galderaFormulatu();
				}
				
				
				//jokalariaren puntuak eguneratzen
				pPuntuak.gehituGaztatxoa(erantzuna);
				
			}
			
		}
				 
				
		JokalariaAldaketak aldaketak = null;
		aldaketak	= new JokalariaAldaketak(hasierakoPasilloan, egungoErrenkada, egungoZutabea, erantzuna, garaileaDa);
																							//erantzuna ez da beharrezkoa itzuleran
		return aldaketak;
	}
		
	
	private int mugituZirkuluan(int pEgungoPosizioa, int pZenbatMugitu){
		
		//*****************************************************************************************
		Teklatua	teklatuHau	= Teklatua.getTeklatua();
		String noraMugitu 		= teklatuHau.noraMugitu("Nora mugitu nahi duzu fitxa? (aurrera/atzera)");
		//Salbuespena gertatuko da kasu honetan****************************************************
		
		int	posizioBerria	= pEgungoPosizioa;
		
		if (noraMugitu == "aurrera"){
			
			posizioBerria	= posizioBerria + pZenbatMugitu;
			if (posizioBerria > 41){
				
				posizioBerria	= posizioBerria - 42; //Zerotik hasi behar delako zenbaketa "ken 42 egiten da"
			}
		}
			
		else if (noraMugitu == "atzera"){
				
			posizioBerria	= posizioBerria - pZenbatMugitu;
			if(posizioBerria < 0){
					
				posizioBerria	= posizioBerria	+ 42; //Zeroa kontuan hartzeko "gehi 42 egiten da"
			}
		}
			
			
		return posizioBerria;
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
	

