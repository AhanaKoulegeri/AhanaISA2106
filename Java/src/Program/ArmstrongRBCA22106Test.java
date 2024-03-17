package Program;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArmstrongRBCA22106Test {

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
	    public void testIsArmstrong() {
	        assertTrue(ArmstrongRBCA22106 .isArmstrong(0));
	        assertTrue(ArmstrongRBCA22106 .isArmstrong(1));
	        assertTrue(ArmstrongRBCA22106 .isArmstrong(153));
	        assertTrue(ArmstrongRBCA22106 .isArmstrong(370));
	        assertTrue(ArmstrongRBCA22106 .isArmstrong(371));
	        assertTrue(ArmstrongRBCA22106 .isArmstrong(407));

	        assertFalse(ArmstrongRBCA22106 .isArmstrong(10));
	        assertFalse(ArmstrongRBCA22106 .isArmstrong(100));
	        assertFalse(ArmstrongRBCA22106 .isArmstrong(200));
	        assertFalse(ArmstrongRBCA22106 .isArmstrong(456));
	        assertFalse(ArmstrongRBCA22106 .isArmstrong(999));
	    
	

	}

}
