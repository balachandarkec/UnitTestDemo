import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;

import in.stack.utils.Calculator;

@Tag("primary")
public class CalculatorTest {
	static Calculator c= null;
	
	@BeforeAll
	public static void config() {
		c= new Calculator();
	}
	
	@BeforeEach
	public void beforeEachdemo() {
		System.out.println("Before Test!");
	}
	
	
	@AfterEach
	public void afterEacEachdemo() {
		System.out.println("After Test!");
	}
	
	
	@Test
	public void AddTest() {
		 
		//int res=c.add(5, 6);
		 assertEquals(11,c.add(5, 6),"Output mismatch!");
		 assertEquals(-11,c.add(-5, -6),"Output mismatch!");
		 assertEquals(1,c.add(-5, 6),"Output mismatch!");
		 
	}
	
	
	@Test
	public void subtractionTest() {
		 //Calculator c= new Calculator();
		//int res=c.add(5, 6);
		 assertEquals(3,c.subtraction(5, 2),"Output mismatch!");
		 assertEquals(7,c.subtraction(5, -2),"Output mismatch!");
		 assertEquals(-11,c.subtraction(-5, 6),"Output mismatch!");
		 
	}
	
	@Test
	public void arrayTest() {
		// Calculator c= new Calculator();
		 int arr[]= {3,5,2,7,8,1,0};
		 assertEquals(0,c.minOfArray(arr),"output mismatch!");
	}
	
	
	@Test
	public void testAssertAll() {
		//c.multiplication(5, 5)
		
		assertAll("Assert All Demo",
								  ()-> assertEquals(25,c.multiplication(5, 5)),
								  ()->assertEquals(9,c.multiplication(3,3)),
								  ()->assertEquals(16,c.multiplication(4, 4))
				
				
				);
	}

	
	@Test
	public void testException() {
		
		Throwable myexeception=assertThrows(ArithmeticException.class, ()-> c.exceptionArise());
		System.out.println("message "+myexeception.getMessage());
		
		
		assertEquals("Aritmetic exception test",myexeception.getMessage());
	}
	
	
	
	
	

	@AfterAll
	public static void cleanUp() {
		System.out.println("Clean Up Progressing !");
		c=null;
	}
	
	
}
