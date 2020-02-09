package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class orderEventTest extends Proxy {
	@Test
	
	public void testOrderEvent(){
		//valid phone and name
		assertTrue(orderEvent("Alex", "0505884632"));
		//invalid name
		assertFalse(orderEvent("Alex33", "0505884632"));
		//invalid phone number
		assertFalse(orderEvent("Alex", "050g5884632"));
		//invalid phone number more than 10 numbers
		assertTrue(orderEvent("Alex", "05005884632"));
		//empty name
		assertTrue(orderEvent("", "0505884632"));
		//empty number
		assertTrue(orderEvent("Alex", ""));
		//less than 10 numbers
		assertTrue(orderEvent("Alex", "0500584632"));

	}
	
}
