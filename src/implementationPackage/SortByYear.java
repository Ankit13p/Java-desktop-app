package implementationPackage;

import java.util.Comparator;

public class SortByYear implements Comparator<NzSocietyData>{

	@Override
	public int compare(NzSocietyData r1, NzSocietyData r2) {
		
		return (" " +r1.getYear()).compareTo(" " +r2.getYear());
	}

}
