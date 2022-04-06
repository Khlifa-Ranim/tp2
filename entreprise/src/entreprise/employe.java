package entreprise;

import java.util.Objects;

public class employe implements Comparable<employe> {
	private int cin ;
	private  String nom;
	private double  salaire;
	private int NumDep;
	
	public employe(int cin) {
		this.cin=cin;
	}
	
	public employe(int cin, String nom, double salaire, int numDep) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.salaire = salaire;
		NumDep = numDep;
	}
	
	
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public int getNumDep() {
		return NumDep;
	}
	public void setNumDep(int numDep) {
		NumDep = numDep;
	}
	@Override
	public String toString() {
		return "employe [cin=" + cin + ", nom=" + nom + ", salaire=" + salaire + ", NumDep=" + NumDep + "]";
	}

	@Override
	public int compareTo(employe o) {
		if(this.salaire<o.salaire) {
			return 1;
		}
		else if (this.salaire>o.salaire) {
			return -1;
		}
		else return 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cin);
	}

	@Override
	public boolean equals(Object obj) {
			employe e=(employe)obj;
			if(this.cin==e.getCin()) {
				return true;
			}
			return false;
	    	
	}
	

	
	
}
