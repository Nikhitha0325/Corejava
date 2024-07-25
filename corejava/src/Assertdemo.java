
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Assertdemo {
	@Test
	 public void testforassertequal() {
		int result=1;
		int expected=1;
		assertEquals(result,expected);  
		
	}
		
	@Test
		void testassertTrue() {
		assertTrue("hello" .contains("i"));
			
		 }
	@Test
		void testnull() {
		String n="j";
		assertNull(" ");
		 }
	}


