package packtribial;


public class Jokalaria {
	
	//Atributuak
	private String			kolorea;
	//Ipini ahal da nick-a
	private ListaGaztatxoak	puntuak;
	private int				posizioaErrenkada;
	private int				posizioaZutabea;
	private boolean 		hasierakoPasilloan; //True 6-etako pasilloren batean badago
	//private boolean			garailea;
		
	//Eraikitzailea
	
	public Jokalaria(String pKolorea, int pPosizioaErrenkada, int pPosizioaZutabea, boolean pHasierakoPasilloa){
		this.kolorea=pKolorea;
		this.puntuak=new ListaGaztatxoak();
		this.posizioaErrenkada=pPosizioaErrenkada;
		this.posizioaZutabea=pPosizioaZutabea;
		this.hasierakoPasilloan=pHasierakoPasilloa;
		
	}
	
	
	public boolean txandaBurutu(int pTxanda){

        boolean garaileaDa = false;
        Tableroa tableroHau = Tableroa.getNireTableroa();
        Dadoa dadoHau = Dadoa.getNireDadoa();
        dadoHau.bota();
        int ateratakoa = dadoHau.getGoikoAldea();

        //Tableroa klasean fitxa mugitzeko
        
        /*garaileaDa=tableroHau.fitxaMugitu(this, this.pasilloa, this.posizioaErrenkada, this.posizioaZutabea
        		, this.puntuak, ateratakoa);*/
                //ateratakoa, this.pasilloa, this.posizioaErrenkada, this.posizioaZutabea, );
        garaileaDa=tableroHau.fitxaMugitu(pTxanda, this.hasierakoPasilloan, this.posizioaErrenkada, this.posizioaZutabea, 
        								  this.puntuak, ateratakoa);
        
        
        
        return garaileaDa;
	    }
	
	public String getFitxarenKolorea(){
		return this.kolorea;
	}
	public void setListaGaztatxoak(ListaGaztatxoak pPuntuak){
		this.puntuak=pPuntuak;
	}
	public void setPosizioaErrenkada(int pPosizioaErrenkada){
		this.posizioaErrenkada=pPosizioaErrenkada;
	}
	public void setPosizioaZutabea(int pPosizioaZutabea){
		this.posizioaZutabea=pPosizioaZutabea;
	}
	public void setPasilloa(boolean pHasierakoPasilloa){
		this.hasierakoPasilloan=pHasierakoPasilloa;
	}
}


