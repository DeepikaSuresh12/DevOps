package Jenkins.Demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWorking {

	WorkLog w1= new WorkLog();
	
	@Test
	public void testAddToLog1() {
		assertEquals("Added Log for Remo",w1.addToLog("Remo"));
	}
	
	@Test
	public void testAddToLog2() {
		assertEquals("Added Log for Lokesh",w1.addToLog("Lokesh"));
	}
	@Test
	public void testAddToLogins1() {
		assertEquals("Added Login Lokesh",w1.addLogIns("Lokesh"));
	}
	@Test
	public void testAddToLogins2() {
		assertEquals("Added Login Remo",w1.addLogIns("Remo"));
	}

}
