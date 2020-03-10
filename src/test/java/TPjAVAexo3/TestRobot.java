package TPjAVAexo3;

import java.awt.Robot;
import static org.junit.Assert.assertEquals;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestRobot {
	
	@Test
	public void tourneTest() {
		position p=new position(8,7);
		direction d=direction.NORD;
		robot R=new robot(p,d);
		direction expected=direction.EST;
		R.tourne();
		
		assertEquals(expected,R.getdirection());
	}
	
	

	@Test
	public void avanceTest()  {
		position p=new position(8,7);
		direction d=direction.NORD;
		robot R=new robot(p,d);
		position expected=new position(8,7);
		R.avance();
		
		assertEquals(expected.getY(),R.getposition().getY());
		assertEquals(expected.getX(),R.getposition().getX());
		
		
		@Test 
	}}