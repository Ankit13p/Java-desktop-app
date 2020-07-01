package implementationPackage;

import java.util.Comparator;

public class SortByRegion implements Comparator<NzSocietyData>{

	@Override
	public int compare(NzSocietyData r1, NzSocietyData r2) {
		
		return r1.getRegion().compareTo(r2.getRegion());
	}

}
