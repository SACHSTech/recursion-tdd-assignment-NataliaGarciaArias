package recursionAssignment;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import recursionAssignment.Recursion;
public class RecursionTest{
    
    @Before
    public void beforeTest(){
      // some steps to perform before tests are run
    }
    
    /**
     * An initial test
     */
    @Test
    public void Problem1_Test1(){
        // make assertion statement(s)
        assertEquals(2, Recursion.count7(717));
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
    }

    @Test
    public void Problem1_Test2(){
      assertEquals(0, Recursion.count7(1234));
    }

    @Test
    public void Problem2_Test1(){
      assertEquals("", Recursion.changePi(""));
    }
    // add more tests
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
