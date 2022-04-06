package exercie_3_tp2;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Annuaire<E> {
	
 Map <String,FICHE> contact ;
 

 
 public Annuaire() {
	   contact=new HashMap<>();
}


public int getNBcontacts() {
	  
	 return  contact.size();
 }


 
 public void addContact(String s) {
 Scanner sc= new Scanner(System.in);
 System.out.println("entrer votre adress");
 String adr =sc .next();
 System.out.println("entrer votre numéro");
 int num =sc.nextInt();
 
  FICHE F = new FICHE(s,num,adr);
 
			contact.put(s, F);
		
 }
 
 public void getContact(String name) {
	 
	for ( String i: contact.keySet()) {
		if( i==name) {
			System.out.println(contact.get(i));
		
	}
	
	}
	
 }
 
 public  void affiche() {
	
	Iterator<Map.Entry<String,FICHE>> i=contact.entrySet().iterator();
	while(i.hasNext()) {
		Map.Entry<String,FICHE> e=i.next();
		System.out.println(e.getKey()+":"+e.getValue());}
		
	}
	
	public void treeConntact() {
		TreeMap<String,FICHE>TM=new TreeMap<String,FICHE>(contact) ;
		System.out.println(TM);
	}
	
	 
 
 
}
