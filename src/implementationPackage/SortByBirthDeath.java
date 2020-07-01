package implementationPackage;

import java.util.Comparator;

public class SortByBirthDeath implements Comparator<NzSocietyData>{

	@Override
	public int compare(NzSocietyData bd1, NzSocietyData bd2) {
		
		return bd1.getBirthdeath().compareTo(bd2.getBirthdeath());
	}

}
