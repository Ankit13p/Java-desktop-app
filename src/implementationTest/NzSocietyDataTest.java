package implementationTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import implementationPackage.NzSocietyData;

class NzSocietyDataTest {

	@Test
	void testGetYear() {
		NzSocietyData nsd = new NzSocietyData(2005, "Deaths", "Christchruch", 5224);
		assertEquals(nsd.getYear(), 2005);
	}

	@Test
	void testSetYear() {
		NzSocietyData nsd = new NzSocietyData(2005, "Deaths", "Christchruch", 5224);
		nsd.setYear(2009);
		assertEquals(nsd.getYear(), 2009);
	}

	@Test
	void testGetCount() {
		NzSocietyData nsd = new NzSocietyData(2005, "Deaths", "Christchruch", 5224);
		assertEquals(nsd.getCount(), 5224);
	}

	@Test
	void testSetCount() {
		NzSocietyData nsd = new NzSocietyData(2005, "Deaths", "Christchruch", 5224);
		nsd.setCount(5623);
		assertEquals(nsd.getCount(), 5623);
	}

	@Test
	void testGetBirthdeath() {
		NzSocietyData nsd = new NzSocietyData(2005, "Deaths", "Christchruch", 5224);
		assertEquals(nsd.getBirthdeath(), "Deaths");
	}

	@Test
	void testSetBirthdeath() {
		NzSocietyData nsd = new NzSocietyData(2005, "Deaths", "Christchruch", 5224);
		nsd.setBirthdeath("Births");
		assertEquals(nsd.getBirthdeath(), "Births");
	}

	@Test
	void testGetRegion() {
		NzSocietyData nsd = new NzSocietyData(2005, "Deaths", "Christchruch", 5224);
		assertEquals(nsd.getRegion(), "Christchruch");
	}

	@Test
	void testSetRegion() {
		NzSocietyData nsd = new NzSocietyData(2005, "Deaths", "Christchruch", 5224);
		nsd.setRegion("Dunedin");
		assertEquals(nsd.getRegion(), "Dunedin");
	}

	@Test
	void testToString() {
		NzSocietyData nsd = new NzSocietyData(2005, "Deaths", "Christchruch", 5224);
		assertEquals(nsd.toString(), "2005, Deaths, Christchruch, 5224");
	}

}
