import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author EGREGG
 *
 */
class GradeBookTest {
	
	private GradeBook g1;
	private GradeBook g2;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(50.0);
		g1.addScore(85.0);
		g1.addScore(10.0);
		
		
		g2 = new GradeBook(5);
		g2.addScore(45.0);
		g2.addScore(25.0);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	/**
	 * Test method for {@link GradeBook#addScore(double)}.
	 */
	@Test
	void testAddScore() {
		assertTrue((g1.toString()).equals("50.0 85.0 10.0 "));
		assertTrue((g2.toString()).equals("45.0 25.0 "));
		
		assertEquals(3,g1.getScoreSize(), 0.001);
		assertEquals(2,g2.getScoreSize(), 0.001);
	}

	/**
	 * Test method for {@link GradeBook#sum()}.
	 */
	@Test
	void testSum() {
		assertEquals(145.0, g1.sum(),.0001);
		assertEquals(70.0,g2.sum(),.0001);
	}

	/**
	 * Test method for {@link GradeBook#minimum()}.
	 */
	@Test
	void testMinimum() {
		assertEquals(10.0,g1.minimum(),.0001);
		assertEquals(25.0,g2.minimum(),.0001);
	}

	/**
	 * Test method for {@link GradeBook#finalScore()}.
	 */
	@Test
	void testFinalScore() {
		assertEquals(135.0,g1.finalScore(),.0001);
		assertEquals(45.0,g2.finalScore(),.0001);
	}

//	/**
//	 * Test method for {@link GradeBook#getScoreSize()}.
//	 */
//	@Test
//	void testGetScoreSize() {
//		fail("Not yet implemented");
//	}

//	/**
//	 * Test method for {@link GradeBook#toString()}.
//	 */
//	@Test
//	void testToString() {
//		fail("Not yet implemented");
//	}

}
