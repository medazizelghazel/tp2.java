package tp2;

public class Main1 {

	public static void main(String[] args) {
		employe e1=new employe(1,"aziz",900,1);
		employe e2=new employe(2,"yousef",1000,1);
		employe e3=new employe(37,"chaima",600,1);
		employe e4=new employe(38,"amine",1550,2);
		employe e5=new employe(39,"rihem",800,2);
		employe e6=new employe(40,"fadi",1300,2);
		Département d1=new Département(1);
		Département d2=new Département(2);
		Entreprise en1=new Entreprise("azizos");
		en1.ajoutDep(d1);
		en1.ajoutDep(d2);
		d2.ajoutEmploye(e4);
		d2.ajoutEmploye(e5);
		d2.ajoutEmploye(e6);
		d1.ajoutEmploye(e1);
		d1.ajoutEmploye(e2);
		d1.ajoutEmploye(e3);
		en1.afficheE();
		en1.UpdateDep(e1,2);
		en1.afficheE();
		System.out.println(en1.existeD(d2));
		en1.DepMinCapacity();
	}

}
