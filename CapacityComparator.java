package tp2;

import java.util.Comparator;

public class CapacityComparator implements Comparator<Département> {

	@Override
	public int compare(Département o1, Département o2) {
		return Integer.compare(o1.getNbEmployes(), o2.getNbEmployes());
	}

}
