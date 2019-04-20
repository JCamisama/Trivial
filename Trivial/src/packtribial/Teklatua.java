package packtribial;

import java.util.Scanner;

public class Teklatua {
	private static Teklatua nireTeklatua=null;
	private Scanner sc;
	
	private Teklatua() {
		this.sc=new Scanner(System.in);
	}
	public static Teklatua getTeklatua() {
		if(nireTeklatua==null) {
			nireTeklatua= new Teklatua();
		}
		return nireTeklatua;
	}
	
	public int irakurriOsoa(String pMezua) {
		System.out.println(pMezua);
		int zenbakia;
		zenbakia=sc.nextInt();
		return zenbakia;
	}
	
	public String irakurriString(String pMezua, ListaString pAukerak) {
		System.out.println(pMezua);
		pAukerak.inprimatu();
		String erantzuna;
		erantzuna=sc.next();
		return erantzuna;
	}
}
