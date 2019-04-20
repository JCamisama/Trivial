
package proiektua;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaGalderak {
	
	//atributuak
	private ArrayList<GalderaErantzuna> lista;
	private static ListaGalderak nireListaGalderak = null;
	
	//eraikitzailea
	private ListaGalderak(){
		this.lista = new ArrayList<GalderaErantzuna>();
	}
	
	//gainontzeko metodoak
	public static synchronized ListaGalderak getNireListaGalderak(){
		if(ListaGalderak.nireListaGalderak == null){
			ListaGalderak.nireListaGalderak = new ListaGalderak();
		}
		return ListaGalderak.nireListaGalderak;
	}

	public void galderakKonfiguratu(){
		
		String[] zatiak= new String[6];

		InputStream fitx = this.getClass().getClassLoader().getResourceAsStream("Fitxategiak/galdera1.txt");

		InputStreamReader in= new InputStreamReader(fitx);
		
		Scanner sc; 
		
		sc = new Scanner(in);
		String galderaErantzuna = sc.nextLine();
		zatiak= galderaErantzuna.split("  ");
		String galdera = zatiak[0];
		String eranPosible1 = zatiak[1];
		String eranPosible2 = zatiak[2];
		String eranPosible3 = zatiak[3];
		String eranPosible4 = zatiak[4];
		String zenbakia = zatiak[5];
		int eranEgokia = Integer.parseInt(zenbakia);
		//BLA BLA BLA
	}
}
