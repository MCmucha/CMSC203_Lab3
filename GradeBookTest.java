import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private GradeBook gb1;
    private GradeBook gb2;

	@BeforeEach
	void setUp() throws Exception 
	{
		GradeBook gb1 = new GradeBook(5);
		GradeBook gb2 = new GradeBook(5);

		gb1.addScore(85.0);
		gb1.addScore(90.0);

		gb2.addScore(75.0);
		gb2.addScore(80.0);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		gb1 = null;
		gb2 = null;
	}

	@Test
	void testAddScore() 
	{
		 GradeBook gb = new GradeBook(5);
		    gb.addScore(85.0);
		    gb.addScore(90.0);

		    assertEquals("85.0 90.0", gb.toString());
		    assertEquals(2, gb.getScoreSize());
		
	}

	@Test
	void testSum() {
		GradeBook gb = new GradeBook(5);
	    gb.addScore(85.0);
	    gb.addScore(90.0);

	    assertEquals(175.0, gb.sum(), 0.01);
	}

	@Test
	void testMinimum() {
		GradeBook gb = new GradeBook(5);
	    gb.addScore(85.0);
	    gb.addScore(90.0);

	    assertEquals(85.0, gb.minimum(), 0.01);
	}

	@Test
	void testFinalScore() {
	    GradeBook gb1 = new GradeBook(5);
	    gb1.addScore(85.0);
	    gb1.addScore(90.0);

	    GradeBook gb2 = new GradeBook(5);
	    gb2.addScore(75.0);
	    gb2.addScore(80.0);

	    assertEquals(175.0, gb1.finalScore(), 0.01);
	    assertEquals(80.0, gb2.finalScore(), 0.01);
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testObject() {
		fail("Not yet implemented");
	}

	@Test
	void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	@Test
	void testToString1() {
		fail("Not yet implemented");
	}

	@Test
	void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	void testWait() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	void testFinalize() {
		fail("Not yet implemented");
	}

}
