import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	//@Test
	//public void test() {
	//	fail("Not yet implemented");
	//}
	
	
	@Test
	public void testFrameIsStrike() throws BowlingException {
		Frame frejm = new Frame(10,0);
		
		boolean strike = frejm.isStrike();
		
		assertEquals(true, strike);
	}
	

}
