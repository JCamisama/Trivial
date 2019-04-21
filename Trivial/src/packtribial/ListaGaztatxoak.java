package packtribial;

import java.util.ArrayList;


public class ListaGaztatxoak {
	
	private ArrayList<String> lista; //Kolorezko gaztatxoak gordetzeko
	
	public ListaGaztatxoak(){
		
		lista = new ArrayList<String>();
	}
	
	public void gehituGaztatxoa(String pGaztatxoa){

        if(!this.badago(pGaztatxoa)){

            this.lista.add(pGaztatxoa);
        }

        else{

            System.out.print("Gaztaxo "+ pGaztatxoa + " jadanik lortu duzu!");
        }
    }


    public boolean badago(String pGaztatxoa){

        return this.lista.contains(pGaztatxoa);

    }

    public int zenbatGaztatxo(){

        return this.lista.size();
    }
	

}
