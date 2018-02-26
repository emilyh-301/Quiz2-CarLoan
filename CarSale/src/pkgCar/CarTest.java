package pkgCar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void test() 
	{
		Car c = new Car();
		c.setTotalPrice(35000.00);
		c.setDownPayment(0.00);
		c.setInterestRate(0.10);
		c.setLoanLength(60.0);
		
		assertEquals(c.monthlyCarPayment(), 743.65, .01);
		assertEquals(c.spentOnInterestOverTerm(), 9618.79, .01);
		
	}

}
