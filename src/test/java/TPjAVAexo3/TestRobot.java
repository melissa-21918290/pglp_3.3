package TPjAVAexo3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;



public class TestRobot {
	
	@Test
	public void tourneTest() {
		position pos=new position(7,8);
		direction dir=direction.NORD;
		robot R=new robot(pos,dir);
		direction expected=direction.EST;
		R.tourne();
		
		assertEquals(expected,R.getdirection());
	}
	
	 public void testAvance() {
	        robot r = new robot(null, null);
	        r.avance();
	        position p = new position(1,2);

	        Assert.assertTrue(p.getX() == r.getposition().getX());
	        Assert.assertTrue(p.getY() == r.getposition().getY());
	    }
	
}
