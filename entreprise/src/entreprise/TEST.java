package entreprise;

public class TEST {

	public static void main(String[] args) {
		employe a=new employe(13,"ranim",1269,5);
		employe b=new employe(83,"hiba",12690,5);
		employe c=new employe(183,"sami",512,5);
		    departement d = new departement(2,11);
		    d.ajoutEmploye(a);
		    d.ajoutEmploye(b);
		    d.ajoutEmploye(c);
    
		    
 System.out.println("le salaire maximum est"+d.getEmpSalMax());
	}

}
