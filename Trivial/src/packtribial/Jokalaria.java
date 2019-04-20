package packtribial;


public class Jokalaria {
	
	//Atributuak
	private String			kolorea;
	//Ipini ahal da nick-a
	private ListaGaztatxoak	puntuak;
	private int				posizioaErrenkada;
	private int				posizioaZutabea;
	private int 			pasilloa;
	//private boolean			garailea;
	
	
	//Eraikitzailea
	
	public Jokalaria(String pKolorea, int pPosizioaErrenkada, int pPosizioaZutabea, int pPasilloa){
		this.kolorea=pKolorea;
		this.puntuak=new ListaGaztatxoak();
		this.posizioaErrenkada=pPosizioaErrenkada;
		this.posizioaZutabea=pPosizioaZutabea;
		this.pasilloa=pPasilloa;
		
	}
	
	
	public boolean txandaBurutu(){

        boolean garaileaDa = false;
        Tableroa tableroHau = Tableroa.getNireTableroa();
        Dadoa dadoHau = Dadoa.getNireDadoa();
        dadoHau.bota();
        int ateratakoa = dadoHau.getGoikoAldea();

        //Tableroa klasean fitxa mugitzeko
        garaileaDa=tableroHau.fitxaMugitu(this, this.pasilloa, this.posizioaErrenkada, this.posizioaZutabea
        		, this.puntuak, ateratakoa);
                //ateratakoa, this.pasilloa, this.posizioaErrenkada, this.posizioaZutabea, );
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
	public void setPasilloa(int pPasilloa){
		this.pasilloa=pPasilloa;
	}
}


