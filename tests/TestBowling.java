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
		
		assertEquals("Frame je strike",true, strike);
	}
	
	@Test
	public void testFrameIsSpare() throws BowlingException {
		Frame frejm = new Frame(5,5);
		
		boolean spare = frejm.isSpare();
		
		assertEquals("Frame je spare",true, spare);
	}
	
	@Test
	public void testFrameScore() throws BowlingException {
		Frame frejm = new Frame (6,3);
		
		int rez = frejm.score();
		assertEquals(9,rez);
				
	}
	
	@Test
	public void testAddFrame() throws BowlingException {
		BowlingGame bg = new BowlingGame();
		Frame frejm = new Frame(3,3);
		bg.addFrame(frejm);
		
		assertEquals("Broj frejmova je 1", 1, bg.getFrameNumber());
		
	}

	

}
