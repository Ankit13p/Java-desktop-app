package implementationPackage;


public class NzSocietyData {
	
		int year;
		String birthdeath, region;
		int count;
		public int getYear() {
			return year;
		}

		public void setYear(int row) {
			this.year = row;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int row) {
			this.count = row;
		}

		public String getBirthdeath() {
			return birthdeath;
		}

		public void setBirthdeath(String birthdeath) {
			this.birthdeath = birthdeath;
		}

		public String getRegion() {
			return region;
		}

		public void setRegion(String region) {
			this.region = region;
		}
		
		public NzSocietyData(int year, String birthdeath,String region,  int count) {
			this.year = year;
			this.count = count;
			this.birthdeath = birthdeath;
			this.region = region;
		}
		
		@Override
		public String toString() {
			return "" + year + ", " + birthdeath + ", " + region + ", "
				+ count ;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + count;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			NzSocietyData other = (NzSocietyData) obj;
			if (count != other.count)
				return false;
			return true;
		}
}
