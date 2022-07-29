import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MathsTest {
	Maths m;
	@Before
	public void setUp() throws Exception {
		m=new Maths();
		
	}

	/*
	 * @Test public void test() { fail("Not yet implemented"); }
	 */
	
	@Test
	public void testForAdd()
	{
		assertEquals(4, m.add(2,2));
		
	}
	
	@Test(expected= ArithmeticException.class)
	public void testForException()
	{
		m.add(-4,2);
	}

}
