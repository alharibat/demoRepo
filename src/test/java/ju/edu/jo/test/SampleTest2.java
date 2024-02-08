package ju.edu.jo.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class SampleTest2 {

  @Test
  public void testEquality() {
	System.out.println("Test 3");
    int no1 = 1;
    int no2 = 3;
    assertEquals(no1 , no2);
  }

  
  
  
}