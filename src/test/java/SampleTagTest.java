import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("secondary")
public class SampleTagTest {
	
	@Test
	@DisplayName("DEMO Test Case 1")
	public void test1() {
		System.out.println("Test 1 running");
		
	}
	
	@Test
	@DisplayName("DEMO Test Case 2")
	public void test2() {
		System.out.println("Test 2 running");
	}

}
