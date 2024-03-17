package Program;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FactorialRBCA22106Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
		@Test
        public void testCalculateFactorial() {
			FactorialRBCA22106 factorialNumber = new FactorialRBCA22106();

            // Test case for n = 0
            assertEquals(1, factorialNumber.calculateFactorial(0));

            // Test case for n = 1
            assertEquals(1, factorialNumber.calculateFactorial(1));

            // Test case for n = 5
            assertEquals(120, factorialNumber.calculateFactorial(5));

            // Test case for n = 10
            assertEquals(3628800, factorialNumber.calculateFactorial(10));

            // Test case for n = 20
            assertEquals(2432902008176640000L, factorialNumber.calculateFactorial(20));

            // Test case for n = -1 (should throw IllegalArgumentException)
            try {
                factorialNumber.calculateFactorial(-1);
                fail("Expected IllegalArgumentException was not thrown");
            } catch (IllegalArgumentException e) {
                assertEquals("Factorial is not defined for negative numbers", e.getMessage());
            }
        
    

	}

}
