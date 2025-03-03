package tp2;

import java.util.HashMap;

public class Entreprise  {	
	HashMap<Integer, Département> Liste_Deps;
	private String nomEntreprise;
	
	public Entreprise( String nomEntreprise) {
		this.Liste_Deps = new HashMap<>();
		this.nomEntreprise = nomEntreprise;
	}
	
	public void ajoutDep(Département d){
		Liste_Deps.put(d.getId(),d);
	}
	public void retirerDep(Département d) {
        Liste_Deps.remove(d.getId());
    }
	public void afficheE() {
        System.out.println("Entreprise: " + nomEntreprise);
        for (Département dep : Liste_Deps.values()) {
            dep.afficheDep();
        }
    }
	public void UpdateDep(employe E, int idDep) {
		Liste_Deps.get(E.getIdDe()).retirerEmploye(E);
		Liste_Deps.get(idDep).ajoutEmploye(E);
	}
	
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public boolean existeD(Département d) {
        return Liste_Deps.containsValue(d);
    }
	public void DepMinCapacity() {
		Département minDep = null;
	    for (Département dep : Liste_Deps.values()) {
	        if (minDep == null || dep.LE.size() < minDep.LE.size()) {
	            minDep = dep;
	        }
	    System.out.println("Le département avec la capacité minimale est: " + minDep.getId());
	}

	
    }
}
