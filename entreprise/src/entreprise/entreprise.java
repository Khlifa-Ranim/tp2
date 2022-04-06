package entreprise;

import java.util.HashMap;
import java.util.HashSet;

public class entreprise {

	private String numEntreprise;
	HashMap<Integer,departement> Liste_Deps;
	
	public String getNumEntreprise() {
		return numEntreprise;
	}
	
	public void setNumEntreprise(String numEntreprise) {
		this.numEntreprise = numEntreprise;
	}

	public entreprise(String numEntreprise) {
		this.numEntreprise = numEntreprise;
		  Liste_Deps=new HashMap<>();
	}

	@Override
	public String toString() {
		return "entreprise [numEntreprise=" + numEntreprise + "]";
	}
	
	public void ajoutDep(departement d) {
		
	}
	
	public void retirerDep(departement d) {
		Liste_Deps.remove(d);
	}
	
	public void afficheE() {
		
		
	}
	
	
	
	
	
}
