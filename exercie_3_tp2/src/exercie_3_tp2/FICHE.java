package exercie_3_tp2;

public class FICHE {
	
public String nom;
public int numero;
public String adress;







public FICHE(String nom, int numero, String adress) {
	this.nom = nom;
	this.numero = numero;
	this.adress = adress;
}



public String getNom() {
	return nom;
}



public void setNom(String nom) {
	this.nom = nom;
}



public int getNumero() {
	return numero;
}



public void setNumero(int numero) {
	this.numero = numero;
}



public String getAdress() {
	return adress;
}



public void setAdress(String adress) {
	this.adress = adress;
}



@Override
public String toString() {
	return "FICHE [nom=" + nom + ", numero=" + numero + ", adress=" + adress + "]";
}


}
