package com.ibm.subscription;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestSubscription {
	Subscription s = new Subscription();
	
	
	@Test
	public void validmonthly() {
		assertEquals(1000,s.monthy());
	}
	@Test
	public void validqaurterly() {
		assertEquals(250,s.quaterly());
	}
	@Test
	public void validannually() {
		assertEquals(1000,s.annually());
	}
	

}
