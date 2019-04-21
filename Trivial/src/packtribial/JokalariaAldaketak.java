package packtribial;

public class JokalariaAldaketak {
	private boolean hasierakoPasilloan;
	private int posizioaErrenkada;
	private int posizioaZutabea;
	private String gaztatxoa;
	private boolean partidaAmaituDa;
	
	public JokalariaAldaketak(boolean pHasierakoPasilloan, int pPosizioaErrenkada, int pPosizioaZutabea, String pGaztatxoa,
			boolean pPartidaAmaituDa){
		this.hasierakoPasilloan=pHasierakoPasilloan;
		this.posizioaErrenkada=pPosizioaErrenkada;
		this.posizioaZutabea=pPosizioaZutabea;
		this.gaztatxoa=pGaztatxoa;
		this.partidaAmaituDa=pPartidaAmaituDa;
	}
	public boolean getHasierakoPasilloa(){
		return this.hasierakoPasilloan;
	}
	public int getPosizioaErrenkada(){
		return this.posizioaErrenkada;
	}
	public int getPosizioaZutabea(){
		return this.posizioaZutabea;
	}
	public String getGaztatxoa(){
		return this.gaztatxoa;
	}
	public boolean getPartidaAmaituDa(){
		return this.partidaAmaituDa;
	}
}
