package tp2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Département {
	private int id;
	Set<employe> LE;
	public Département(int id) {
		this.id=id;
		LE=new HashSet<>();
	}
	
	public void ajoutEmploye(employe e) {
		if (e.getCin()>0) {
			LE.add(e);
		}else {
			System.out.println("cin non valide");
		}
	}
	public void retirerEmploye(employe e) {
        LE.remove(e);
    }
	
	
	public void afficheDep() {
		System.out.println("departemet "+id+":");
        for (employe e : LE) {
            System.out.println(e);
        }
    }
	
	public boolean existeE(int cin) {
		employe e=new employe(cin,"a",1,1);
		return LE.contains(e);
    }
	
	public employe getEmpSalMax() {
        TreeSet<employe> ts = new TreeSet<>(LE);
        for (employe e : ts) {
            System.out.println(e);
        }
        return ts.last();
    }

	public int getId() {
		return id;
	}
}
