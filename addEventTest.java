package testing;
import static org.junit.Assert.*;
import org.junit.Test;

public class addEventTest extends Proxy{
	@Test
	public void addEvent(){
		//all inputs valid
		assertTrue(addEvent("The Avengers", "nice one", "Imax",
			"12.12.19", "19:00", 45.99, "10.12.19"));
		//invalid name
		assertFalse(addEvent("Th3 Av3ng3rs", "nice one", "Imax",
				"12.12.19", "19:00", 45.99, "10.12.19"));
		//invalid description
		assertTrue(addEvent("The Avengers", "", "Imax",
				"12.12.19", "19:00", 45.99, "10.12.19"));
		//invalid hall name
		assertTrue(addEvent("The Avengers", "nice one", "",
				"12.12.19", "19:00", 45.99, "10.12.19"));
		//invalid date
		assertFalse(addEvent("The Avengers", "nice one", "",
				"12.13.19", "19:00", 45.99, "10.12.19"));
		//invalid time
		assertFalse(addEvent("The Avengers", "nice one", "",
				"12.12.19", "25:00", 45.99, "10.12.19"));
		//invalid price
		assertFalse(addEvent("The Avengers", "nice one", "Imax",
				"12.12.19", "19:00", -45.99, "10.12.19"));
		//invalid last date
		assertFalse(addEvent("The Avengers", "nice one", "Imax",
				"12.12.19", "19:00", 45.99, "1e.12.19"));
	}
	
	
	
}
