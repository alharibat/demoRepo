package ju.edu.jo.test;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class SampleTest {

  @Test
  public void testSummation() {
	System.out.println("Test 1");
    int no1 = 1;
    int no2 = 3;
    int result = 4;
    assertEquals(no1 + no2, result);
  }


  @Test
  public void testSubtration() {
	  System.out.println("Test 2");
	  int no1 = 5;
	  int no2 = 2;
	  int result = 3;
	  assertEquals(no1 - no2, result);
  }
}
