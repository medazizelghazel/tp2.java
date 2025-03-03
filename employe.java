package tp2;

import java.util.Objects;

public class employe implements Comparable<employe> {
	private int cin;
	private String nom;
	private double salaire;
	private int idDe;
	
	public employe(int cin, String nom, double salaire, int idDe) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.salaire = salaire;
		this.idDe = idDe;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	@Override
	public String toString() {
		return "employe [cin=" + cin + ", nom=" + nom + ", salaire=" + salaire + ", idDe=" + idDe + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cin);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employe other = (employe) obj;
		return cin == other.cin;
	}
	public int getIdDe() {
		return idDe;
	}
	public double getSalaire() {
		return salaire;
	}
	@Override
	public int compareTo(employe o) {
		if (this.salaire>o.salaire) {
			return 1;
		}else if(this.salaire<o.salaire){
			return -1;
		}else {
			return 0;
		}
	}
	
}
