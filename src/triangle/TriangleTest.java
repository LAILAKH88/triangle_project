package triangle;

import static org.junit.jupiter.api.Assertions.*;
import static triangle.TriangleType.EQUILATERAL;
import static triangle.TriangleType.INVALID;
import static triangle.TriangleType.ISOSCELES;
import static triangle.TriangleType.SCALENE;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TriangleTest {
	
	 private Triangle triangle;
		
		@BeforeEach
		void setUp() throws Exception {
			this.triangle = new Triangle();
		}

		@Test
		void test1() {
			assertEquals(SCALENE, this.triangle.classify(1,2, 3));
		}
	 

	  @Test
	  public void testInvalid1() {
	    assertEquals(INVALID, this.triangle.classify(1, 2, 4));
	  }

	  @Test
	  public void testInvalid2() {
	    assertEquals(INVALID, triangle.classify(1, 4, 2));
	  }

	  @Test
	  public void testInvalid3() {
	    assertEquals(INVALID, triangle.classify(4, 1, 2));

	  }

	  @Test
	  public void testInvalidNeg1() {
	    assertEquals(INVALID, triangle.classify(-1, 1, 1));
	  }

	  @Test
	  public void testInvalidNeg2() {
	    assertEquals(INVALID, triangle.classify(1, -1, 1));
	  }

	  @Test
	  public void testInvalidNeg3() {
	    assertEquals(INVALID, triangle.classify(1, 1, -1));
	  }

	  @Test
	  public void testEquiliteral() {
	    assertEquals(EQUILATERAL, triangle.classify(1, 1, 1));
	  }

	  @Test
	  public void testIsoceles1() {
	    assertEquals(ISOSCELES, triangle.classify(2, 2, 3));
	  }

	  @Test
	  public void testIsoceles2() {
	    assertEquals(ISOSCELES, triangle.classify(2, 3, 2));
	  }

	  @Test
	  public void testIsoceles3() {
	    assertEquals(ISOSCELES, triangle.classify(3, 2, 2));
	  }

	  @Test
	  public void testInvalid() {
	    assertEquals(INVALID, triangle.classify(3, 1, 1));
	  }

}
