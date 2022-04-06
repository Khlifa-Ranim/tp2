package entreprise;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class departement {
	private int idDep;
	private int Capacity;
	Set<employe>LEmployes;
	
	

	public departement(int idDep, int capacity) {
		super();
		this.idDep = idDep;
		Capacity = capacity;
       LEmployes=new HashSet<>();
	}
	public int getIdDep() {
		return idDep;
	}
	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	
	public void ajoutEmploye(employe E) {
		int m=E.getNumDep();
		
		if(E.getCin()>0) {
			LEmployes.add(E);
			m++;
		}
		else {
			System.out.println("le CIN est invalide");
		}
	}
	
	public void retirerEmploye(employe E) {
		LEmployes.remove(E);
	}
	
	public void afficheDep() {
		for(employe a:LEmployes) {
			System.out.println(a.toString()+"id departement"+idDep);}
		}
		
		public boolean existeE(int cin) {
			employe E= new employe(cin);
			LEmployes.contains(E);
			return true;
			
		}
		

	@Override
	public String toString() {
		return "departement [idDep=" + idDep + ", Capacity=" + Capacity + ", LEmployes=" + LEmployes + "]";
	}
	
	
	public employe getEmpSalMax() {
		TreeSet <employe> TS=new TreeSet<>(LEmployes);
		System.out.println(TS);
		return TS.last();
		
	}
	
}
