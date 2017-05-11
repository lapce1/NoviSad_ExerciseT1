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
	
	@Test
	public void testFrameIsSpare() throws BowlingException {
		Frame frejm = new Frame(5,4);
		
		boolean spare = frejm.isSpare();
		
		assertEquals(true, spare);
	}

	

}
