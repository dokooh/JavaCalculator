package Calculator.com.victor;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class CalculatorTest 
    extends TestCase
{
	 Calculator c;
	
	public void setUp() {
		
		c = new Calculator();
	}

    /**
     * Rigourous Test :-)
     */
    public void testAddition() {
        assertTrue( true );
    }
}
